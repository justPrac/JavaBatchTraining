package com.websystique.springmvc.controller;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.websystique.springmvc.error.ErrorResponseData;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.model.validator.UserValidator;
import com.websystique.springmvc.service.UserService;

//http://localhost:8080/Spring4MVCCRUDRestService/welcome/user/123

@RestController
@RequestMapping("/welcome")
public class HelloWorldRestController {

	@Autowired
	UserService userService;  //Service which will do all data retrieval/manipulation work
	
	@Autowired
	DataSource dataSource;

	
	//-------------------Retrieve All Users--------------------------------------------------------
	
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = userService.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	

	//-------------------Retrieve Single User--------------------------------------------------------
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") long id) {
		
		System.out.println("Fetching User with id " + id);
		User user = userService.findById(id);
		if (user == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	
	
	//-------------------Create a User--------------------------------------------------------
	
	@RequestMapping(value = "/user/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createUser(@RequestBody User user, 	UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + user.getName());

		if (userService.isUserExist(user)) {
			System.out.println("A User with name " + user.getName() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		userService.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/user/getcnt/", method=RequestMethod.GET)
	public ResponseEntity<Integer> getUserCount(){
		System.out.println("Called to get the user count");
		int size = userService.findAllUsers().size();
		return new ResponseEntity<Integer>(size, HttpStatus.OK);
	}
	
	
/*
	@RequestMapping(value="/user/getAllReqParams", method=RequestMethod.GET)
	public ResponseEntity<String> getUserCount(ModelAttribute("userCheck") @Validated UserModel userModel, HttpServletRequest request){
		Enumeration<String> iterate = request.getParameterNames();
		StringBuffer buff = new StringBuffer();
		while (iterate.hasMoreElements()) {
			String string = (String) iterate.nextElement();
			System.out.println("Parameter is ==> " + request.getParameter(string));
			buff.append("[ " + string + " ] = " + request.getParameter(string));
		}
		return new ResponseEntity<String>(buff.toString(), HttpStatus.OK);
	}
	*/

	@RequestMapping(value = "/userValidation/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity createUserValidation(@Validated @RequestBody User user, BindingResult binding ) {
		System.out.println("Creating User " + user.getName());
		ErrorResponseData error = null;
		List<ObjectError> l = binding.getAllErrors();
		Iterator<ObjectError> iterator = l.iterator();
		System.out.println("binding.hasErrors()" + binding.hasErrors());
		if(binding.hasErrors()){
			error = new ErrorResponseData("101", "User name not sent"); 
			return new ResponseEntity<ErrorResponseData>(error, HttpStatus.BAD_REQUEST);
		}else
		{
			return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
		}
	}
	
	@InitBinder("user")
	protected void userBinder(WebDataBinder binder) {
		System.out.println("binidng");
		//binder.setValidator(new UserValidator());
		binder.addValidators(new UserValidator());
	}
	
	
	
	/*@ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	public String handleGMediaTypeNotAcceptableException(HttpServletRequest req, Exception exception) {
		Enumeration<String> enumerator = req.getHeaderNames();
		System.out.println("Accept header " + req.getHeader("accept"));
		System.out.println("+++++++++++++++++++");
		while (enumerator.hasMoreElements()) {
			Object object = (Object) enumerator.nextElement();
			System.out.println("Header attribute " + object);
			
		}
		
		
		System.out.println("handleGMediaTypeNotAcceptableException() : Failed to process request [" + req.getRequestURL() + "] error ["
				+ exception + "]");
		ErrorResponseData error = new ErrorResponseData("101", "Generic error"); 
		//return new ResponseEntity<ErrorResponseData>(error, HttpStatus.NOT_ACCEPTABLE);
		return "Error accept";
	}*/
	
	
	/*@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseData> handleGenericException(HttpServletRequest req, Exception exception) {
		System.out.println("handleGenericException() : Failed to process request [" + req.getRequestURL() + "] error ["
				+ exception + "]");
		ErrorResponseData error = new ErrorResponseData("101", "Generic error"); 
		return new ResponseEntity<ErrorResponseData>(error, HttpStatus.BAD_REQUEST);
	}*/

	
	//------------------- Update a User --------------------------------------------------------
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user) {
		System.out.println("Updating User " + id);
		
		User currentUser = userService.findById(id);
		
		if (currentUser==null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		currentUser.setName(user.getName());
		currentUser.setAge(user.getAge());
		currentUser.setSalary(user.getSalary());
		
		userService.updateUser(currentUser);
		return new ResponseEntity<User>(currentUser, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/v1/customer/session/request", method = RequestMethod.GET)
	public ResponseEntity<User> updateUser(@ModelAttribute("user") @Validated User user,BindingResult binding, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Updating User ==================>>>" + user.getName());
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}


	//------------------- Delete a User --------------------------------------------------------
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
		System.out.println("Fetching & Deleting User with id " + id);

		User user = userService.findById(id);
		if (user == null) {
			System.out.println("Unable to delete. User with id " + id + " not found");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		userService.deleteUserById(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

	
	//------------------- Delete All User --------------------------------------------------------
	
	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		System.out.println("Deleting All Users");

		userService.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

}

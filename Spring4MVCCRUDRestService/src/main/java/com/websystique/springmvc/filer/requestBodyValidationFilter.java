package com.websystique.springmvc.filer;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@Component("requestBodyValidationFilter")
public class requestBodyValidationFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		
		int length = request.getContentLength();
		
		System.out.println("body length is " + length);
		if(length == 0 ){
			String statusArg = "Request body content not found";
			response.sendError(HttpServletResponse.SC_REQUEST_ENTITY_TOO_LARGE, statusArg);
			System.out.println("doFilterInternal() : called size restriction");			
		} else {
			filterChain.doFilter(request, response);
		}
		
	}

}

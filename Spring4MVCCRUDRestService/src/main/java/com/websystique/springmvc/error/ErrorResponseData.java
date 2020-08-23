package com.websystique.springmvc.error;

public class ErrorResponseData {
	
	   public  String displayMessage;

       /** The error message. */
       public  String errorMessage;

       /** The error code. */
       public  String errorCode;

       /**
        * Instantiates a new error.
        *
        * @param errorCode the error code
        * @param errorMessage the error message
        * @param displayMessage the display message
        */
       public ErrorResponseData(String errorCode, String errorMessage) {
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
       }

}

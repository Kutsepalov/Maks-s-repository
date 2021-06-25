package controllers;

class IncorrectURIException extends RuntimeException {

    private static final long serialVersionUID = -355805344304974875L;
    private String msg = "URI is not correct.";
    IncorrectURIException() {
	
    }
    
    IncorrectURIException(String msg) {
	this.msg = msg;
    }
    
}

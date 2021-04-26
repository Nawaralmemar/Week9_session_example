package domain.model;

import java.util.ArrayList;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	ArrayList<String> errors = new ArrayList<String>();

	public DomainException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DomainException(String message, Throwable cause) {
		super(message, cause);
	}

	public DomainException(String message) {
		super(message);
	}

	public DomainException(Throwable cause) {
		super(cause);
	}

	public DomainException() {
	}

	public DomainException(ArrayList<String> errors) {
		this.errors = errors;
	}
	
	public ArrayList<String> getErrors(){
		return errors;
	}

}

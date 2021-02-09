package Proj.BackBuscaChela.Security;

public class AuthenticationBean {
	
	private String message;

	public AuthenticationBean(String message)
	{
		  this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}
}

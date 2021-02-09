package Proj.BackBuscaChela.TODO;

public class HolaBean {

	private String message;

	public HolaBean(String message)
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

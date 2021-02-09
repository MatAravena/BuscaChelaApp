package Proj.BackBuscaChela.TODO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TODO {

	private int id;
	private String user;
	private String description;
	private Date targetDate;
	private boolean isDone;

	protected TODO() {
		super();
	}
	
	// coments test

	public TODO(int id, String user, String description, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetdate() {
		return targetDate;
	}

	public void setTargetdate(Date targetdate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.targetDate = format.parse(targetdate.toString() );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			this.targetDate = new Date();
		}
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TODO other = (TODO) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

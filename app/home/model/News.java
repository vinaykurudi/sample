package home.model;

import java.util.Date;

public class News {
	private Date date;
	private String message;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "News [date=" + date + ", message=" + message + "]";
	}

}

package exceptions;

public class DBException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7667765905660723350L;

	public DBException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DBException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}

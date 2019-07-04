/**
 * 
 */
package libg.market.potatobags.exception;

/**
 * @author Renuka
 *
 */
public class ExceptionUtil {
	
	/**
	 * Creates the exception.
	 *
	 * @param message the message
	 * @return the Exception
	 */
	public static Exception createException(String message) {
		
		return new Exception(message);
	}

	/**
	 * ExceptionUtil
	 */
	private ExceptionUtil() {
	}

}

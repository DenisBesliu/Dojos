package dojo.digital;

/**
 * @author dbesliu
 * @created 1/10/13
 */
public class NonDigitizableNumberException extends RuntimeException {

    public NonDigitizableNumberException() {
    }


    public NonDigitizableNumberException(final String message) {
        super(message);
    }


    public NonDigitizableNumberException(final String message, final Throwable cause) {
        super(message, cause);
    }


    public NonDigitizableNumberException(final Throwable cause) {
        super(cause);
    }
}

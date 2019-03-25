package de.root1.wagongit;

public class GitException extends Exception {

    private static final long serialVersionUID = 1L;

    public GitException() {
        super();
    }

    public GitException(String message, Throwable cause) {
        super(message, cause);
    }

    public GitException(String message) {
        super(message);
    }

    public GitException(Throwable cause) {
        super(cause);
    }
}

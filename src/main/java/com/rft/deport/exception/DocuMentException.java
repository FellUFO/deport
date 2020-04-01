package com.rft.deport.exception;

public class DocuMentException extends RuntimeException {
    public DocuMentException() {
    }

    public DocuMentException(String message) {
        super(message);
    }

    public DocuMentException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocuMentException(Throwable cause) {
        super(cause);
    }

    public DocuMentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

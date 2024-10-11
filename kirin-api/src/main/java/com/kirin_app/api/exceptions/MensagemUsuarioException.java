package com.kirin_app.api.exceptions;

public class MensagemUsuarioException extends RuntimeException{
    public MensagemUsuarioException(String message) {
        super(message);
    }

    public MensagemUsuarioException(String message, Throwable cause) {
        super(message, cause);
    }
}

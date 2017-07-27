package org.postgetman.cinema.app.infra.exception;

import org.postgetman.cinema.app.infra.exception.base.AppException;

public class ConfigurationException extends AppException{

    private static final long serialVersionUID = -2177284893894040026L;

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(String message) {
        super(message);
    }
}

package org.postgetman.cinema.app.infra.exception.flow;

import org.postgetman.cinema.app.infra.exception.FlowException;

public class InvalidParameterException extends FlowException{
    private static final long serialVersionUID = 4990959228756992926L;
    public InvalidParameterException(String message) {
        super(message);
    }
}

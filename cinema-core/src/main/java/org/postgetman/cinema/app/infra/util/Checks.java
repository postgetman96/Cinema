package org.postgetman.cinema.app.infra.util;

import java.security.InvalidParameterException;

public class Checks {

    private Checks() {

    }

    /**
     * Verifies that specified check passed and throws exception otherwise
     * @param check
     * @param message
     * @throws InvalidParameterException
     */
    public static void checkParameter(boolean check, String message)
            throws InvalidParameterException {
        if (!check) {
            throw new InvalidParameterException(message);
        }
    }
}

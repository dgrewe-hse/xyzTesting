/** Copyright (c) 2024. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.  
 *
 * This code is distributed for educational purposes only, but WITHOUT
 * ANY WARRANTY; See the GNU General Public License version 3 for more 
 * details (a copy is included in the LICENSE file that
 * accompanied this code).
 */
package de.hse.swt.logging;

/**
 * A simple logging service interface.
 * @author Dennis Grewe
 * @version 1.0
 * @since 1.1
 */
public interface LoggingService {
    /**
     * Logs the given message.
     * @param message the message to log
     */
    void log(String message);
}

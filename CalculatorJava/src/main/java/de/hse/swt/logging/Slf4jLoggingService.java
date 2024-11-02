/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.hse.swt.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A logging service implementation using SLF4J.
 *
 * This class provides a concrete implementation of the LoggingService interface
 * using SLF4J (Simple Logging Facade for Java) as the underlying logging framework.
 * It uses the SLF4J Logger to log messages at the INFO level.
 *
 * Usage:
 * LoggingService logger = new Slf4jLoggingService();
 * logger.log("This is a log message");
 *
 * @see LoggingService
 * @see org.slf4j.Logger
 */

public class Slf4jLoggingService implements LoggingService {
    /**
     * The SLF4J Logger instance used for logging messages.
     */
    private static final Logger logger = LoggerFactory.getLogger(Slf4jLoggingService.class);
    /**
     * Counter to track the number of logged messages.
     */
    private int logCount = 0;

    /**
     * Logs the given message at the INFO level.
     * @param message the message to logc
     */
    @Override
    public void log(String message) {
        logger.info(message);
        logCount++;
    }

    /**
     * Returns the number of messages logged since the service was created.
     * @return the number of logged messages
     */
    public int getLogCount() {
        return logCount;
    }
}

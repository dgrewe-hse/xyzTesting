/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef LOGGER_H
#define LOGGER_H

#include <string>

/**
 * @class Logger
 * @brief Interface for logging messages.
 */
class Logger {
public:
    /**
     * @brief Logs a message.
     * @param message The message to be logged.
     */
    virtual void log(const std::string& message) = 0;
    virtual ~Logger() = default;
};

#endif // LOGGER_H

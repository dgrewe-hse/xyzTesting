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
package de.hse.swt.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Test runner class for executing Cucumber tests.
 *
 * This class uses the JUnit `@RunWith` annotation with Cucumber.class to enable
 * Cucumber test execution. The `@CucumberOptions` annotation configures various
 * options for the Cucumber test run, including the feature file path, step definitions
 * package, and output report format.
 *
 * <p>
 * Cucumber Options:
 * <ul>
 *   <li><b>features</b>: Specifies the location of the feature files.</li>
 *   <li><b>glue</b>: Defines the package where step definitions are located.</li>
 *   <li><b>plugin</b>: Specifies report generation, with "pretty" for readable console output
 *       and "html:target/cucumber-report.html" to generate an HTML report.</li>
 * </ul>
 * </p>
 *
 * Usage:
 * <p>This class should be run as a JUnit test to execute all scenarios defined
 * in the specified feature files.</p>
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to the feature files
    glue = "de.hse.swt.steps",    // Package containing step definitions
    plugin = {"pretty", "summary", "html:target/cucumber-report.html"}, // Verbose output
    monochrome = true
)
public class CalculatorCucumberIT {
}

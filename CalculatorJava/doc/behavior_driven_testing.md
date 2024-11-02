
# Behavior Driven Testing with Cucumber in Java

## What is Behavior Driven Testing?

Behavior Driven Testing (BDT) is an approach to software testing that emphasizes collaboration between developers, testers, and business stakeholders. It is based on Behavior Driven Development (BDD) and focuses on verifying the behavior of an application in terms of how a user would interact with it.

In BDT, requirements are written in a natural language format that is easily understandable by all stakeholders. These requirements, called "scenarios," are typically written in the [Gherkin syntax](https://cucumber.io/docs/gherkin/) using keywords like `Given`, `When`, and `Then`. This approach ensures that testing aligns with business goals and that each scenario demonstrates a particular aspect of the system's behavior.

## What is Cucumber in Java?

In the Java context, [Cucumber](https://cucumber.io/) is a popular framework used to implement BDD. It enables developers and testers to write tests in plain English using Gherkin syntax, making it accessible for non-technical stakeholders as well.

With Cucumber, tests are defined in feature files, and each scenario is mapped to Java methods known as step definitions. Cucumber then executes these scenarios by matching steps in the feature files with corresponding step definitions, enabling behavior-driven testing of the application's features.

## Steps to Build and Run Cucumber Tests in Java

### 1. Set Up Your Project with Cucumber Dependencies

Add the following dependencies to your `pom.xml` file to include Cucumber in your Maven project:
```xml
<dependencies>
    <!-- Cucumber Dependencies -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.11.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.11.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### 2. Write a Feature File

Create a `.feature` file (e.g., `Calculator.feature`) in the `src/test/resources/features` directory. This file contains scenarios in Gherkin syntax.

Example `Calculator.feature`:
```gherkin
Feature: Calculator operations

  Scenario: Adding two numbers
    Given I have entered 2 into the calculator
    And I have entered 3 into the calculator
    When I press add
    Then the result should be 5
```

### 3. Create Step Definitions

Step definitions are Java methods that match the steps in the feature file. Each method uses annotations like `@Given`, `@When`, or `@Then` to link to a Gherkin step.

Example `CalculatorSteps.java`:
```java
package de.hse.swt.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_number_into_the_calculator(int number) {
        if (firstNumber == 0) {
            firstNumber = number;
        } else {
            secondNumber = number;
        }
    }

    @When("I press add")
    public void i_press_add() {
        result = firstNumber + secondNumber;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }
}
```

### 4. Create a Cucumber Test Runner

Create a runner class to execute your Cucumber tests. This class should be annotated with `@RunWith(Cucumber.class)` and specify options like the path to feature files and glue code.

Example `CalculatorCucumberIT.java`:
```java
package de.hse.swt;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "de.hse.swt.steps",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class CalculatorCucumberIT {
}
```

### 5. Run Cucumber Tests

To run Cucumber tests, use Maven commands or your IDE’s test runner.

**Command to Run Cucumber Tests**:
1. Execute all tests:
   ```bash
   mvn test
   ```

2. Run only Cucumber tests (assuming you added a profile for it in `pom.xml`):
   ```bash
   mvn test -Pcucumber
   ```

3. Alternatively, specify a single Cucumber test class to run:
   ```bash
   mvn -Dtest=CalculatorCucumberIT test
   ```

### Additional `pom.xml` Configurations (Optional)

To manage Cucumber-specific executions in Maven, consider adding a profile in your `pom.xml`:
```xml
<profiles>
    <profile>
        <id>cucumber</id>
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <configuration>
                        <includes>
                            <include>**/*Test.java</include>
                        </includes>
                    </configuration>
                </plugin>
                <!-- Failsafe plugin for integration tests, including Cucumber -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-failsafe-plugin</artifactId>
                    <version>3.0.0</version>
                    <executions>
                        <execution>
                            <goals>
                                <goal>integration-test</goal>
                                <goal>verify</goal>
                            </goals>
                        </execution>
                    </executions>
                    <configuration>
                        <includes>
                            <include>**/*CucumberIT.java</include>
                        </includes>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    </profile>
</profiles>
```

Using this configuration, you can explicitly control the execution of Cucumber tests via the `cucumber` profile.

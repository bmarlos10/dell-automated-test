# Dell Automated Test Suite

## Overview
This project is a UI test automation suite developed for testing the Sample App at `http://sampleapp.tricentis.com/101/app.php`. It uses the **Selenium WebDriver** with **Cucumber** and **JUnit**, implementing the **Page Object Model** for maintainability and scalability.

## Tech Stack
- **Java 11**
- **Selenium WebDriver 4.21.0**
- **Cucumber JVM 7.14.0**
- **JUnit 4.13.2**
- **Maven** for build and dependency management
- **Cucumber HTML & JSON Reports**

## Key Components

### 1. Page Objects (`pages/`)
Encapsulate interactions with each application screen:
- `EnterVehicleDataPage`
- `EnterInsurantDataPage`
- `EnterProductDataPage`
- `SelectPriceOptionPage`
- `SendQuotePage`

Each class uses `@FindBy` to locate elements and public methods to perform actions.

### 2. Test Data (`data/TestData.java`)
A centralized static class that provides fixed data for use in form inputs.

### 3. Utilities (`utils/`)
- `DriverFactory`: Creates and manages the WebDriver instance.
- `WaitUtils`: Centralized custom wait methods.
- `ActionUtils`: Global wrapper for `sendKeys`, `click`, and synchronized interactions.

### 4. Step Definitions (`steps/FormSteps.java`)
Implements the glue code using Cucumber annotations. Each method corresponds to a step in the `.feature` file.

### 5. Runner (`runners/TestRunner.java`)
Configured with `@CucumberOptions` to execute the tests and generate reports in:
- JSON: `target/cucumber-reports/cucumber.json`
- HTML: `target/cucumber-reports/html-report.html`

## Feature File
Path: `src/test/resources/features/FillOutForm.feature`

```
Feature: Application Form Submission

  Scenario: Successfully fill and submit the application form
    Given I open the application page
    When I fill out all forms and submit
    Then I should see the success message
```

## Generating Reports
Run the tests using Maven:

```bash
mvn clean test
```

After the run, open the report:

```
target/cucumber-reports/html-report.html
```

## Notes
- The test is synchronized globally via `ActionUtils` to prevent flaky behavior.
- Elements are waited for before each interaction.
- Test data is isolated for clarity and reuse.

## Contribution
This repository follows strict structure and naming conventions to ensure readability and maintainability. Before contributing, ensure your code is clean and well-documented.

---



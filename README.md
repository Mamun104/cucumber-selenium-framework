#  Behavior-Driven Development (BDD) Framework with Cucumber and Selenium 

## Introduction

This project serves as a robust and scalable foundation for automating web application testing. 
It integrates Cucumber for Behavior-Driven Development (BDD),Selenium WebDriver for browser automation, JUnit for test execution, and Gradle for build management.
Designed with maintainability and readability in mind, the framework follows the Page Object Model (POM) to promote modular test components and cleaner code.
It also supports advanced reporting through Masterthought Cucumber Reports, making it easy to analyze test results.

![image](https://github.com/user-attachments/assets/6f0a3131-1a78-4791-809f-4e136a5754b7)

---

## Technologies & Tools Used

| Tool / Library                | Purpose                                           |
|------------------------------|---------------------------------------------------|
| Java                         | Programming language                              |
| Selenium WebDriver           | Browser automation                                |
| Cucumber                     | Behavior Driven Development (BDD) with Gherkin    |
| JUnit                        | Test execution framework                          |
| Gradle                       | Build automation and dependency management        |
| Masterthought Cucumber Report| Advanced HTML test reporting                      |
| ChromeDriver                 | Chrome browser driver for Selenium                |

---

## Prerequisites

Ensure the following tools are installed before you run this project:

- Java JDK 8 or higher
- Gradle
- Chrome browser
- IntelliJ IDEA / Eclipse (optional for development)

---

## Project Structure

```bash
cucumber-selenium-framework/
├── src
│   ├── main
│   │   └── java/org/example
│   │       └── Main.java
│   ├── test
│   │   ├── java
│   │   │   ├── pages                # Page Object classes (LoginPage.java)
│   │   │   ├── setup                # Driver setup classes (Setup.java)
│   │   │   ├── stepDefinitions      # Step definition classes
│   │   │   └── testrunner           # TestRunner class (LoginTestRunner.java)
│   │   └── resources
│   │       └── login.feature        # Cucumber feature files
├── build.gradle
├── settings.gradle
└── README.md


```

## How to Run This Project

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/cucumber-selenium-framework.git
cd cucumber-selenium-framework
```

### 2. Run the Tests

```bash
./gradle clean test
```

### 3. Generate Custom HTML Report (Optional)

```bash
./gradle clean generateReport
```

---

## Test Report

After test execution, reports will be available at:

```bash
target/cucumber-reports/
├── cucumber.html            # Default Cucumber HTML report
├── cucumber.json            # Raw JSON result file
└── feature-overview.html    # Masterthought HTML report
```

> Open `feature-overview.html` in a browser to view an enhanced, interactive test summary.

---

## Report Customization

This framework leverages **Masterthought Cucumber Reporting** for professional HTML reports. You can include custom metadata such as platform, environment, author, and browser.

**Sample Configuration in ****\`\`****:**

```groovy
task generateReport {
    doLast {
        import net.masterthought.cucumber.Configuration
        import net.masterthought.cucumber.ReportBuilder

        def reportOutputDirectory = new File("target/cucumber-reports")
        def jsonFile = new File(reportOutputDirectory, "cucumber.json")

        def configuration = new Configuration(reportOutputDirectory, "Cucumber Selenium Framework")
        configuration.addClassifications("Platform", "Windows 10")
        configuration.addClassifications("Browser", "Chrome")
        configuration.addClassifications("Environment", "QA")
        configuration.addClassifications("Author", "Mamun104")

        def reportBuilder = new ReportBuilder([jsonFile.absolutePath], configuration)
        reportBuilder.generateReports()
    }
}
```

---

## Result

![image](https://github.com/user-attachments/assets/ebd51b6a-19b8-418d-afc2-ac4778794e8b)

![image](https://github.com/user-attachments/assets/57ad64ad-b652-41be-b6d2-12de422d433c)



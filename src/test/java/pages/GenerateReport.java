package pages;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class GenerateReport {

    public static void main(String[] args) {
        File reportOutputDirectory = new File("build/custom-cucumber-report");
        List<String> jsonFiles = Collections.singletonList("build/reports/cucumber.json");

        Configuration config = new Configuration(reportOutputDirectory, "Web Automation Testing");
        config.addClassifications("Platform", System.getProperty("os.name"));
        config.addClassifications("Browser", "Chrome");
        config.addClassifications("Environment", "Staging");
        config.addClassifications("Author", "QA Team");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}

package com.wso2telco.logdebugger.com.reports;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CBS extends GeneralReport {

    private PrintWriter report;

    public CBS(String fileName) throws FileNotFoundException {
        report = new PrintWriter(fileName);
    }

    public PrintWriter getReport() {
        return report;
    }

    public void closeReport() {
        report.close();
    }

}
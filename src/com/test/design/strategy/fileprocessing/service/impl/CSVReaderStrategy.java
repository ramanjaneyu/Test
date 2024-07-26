package com.test.design.strategy.fileprocessing.service.impl;

import com.test.design.strategy.fileprocessing.service.FileReaderStrategy;

import java.io.File;

public class CSVReaderStrategy implements FileReaderStrategy {
    @Override
    public void readFile(File csvFile) {
        System.out.println("CSVReader Strategy invoked...");
    }
}

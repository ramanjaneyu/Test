package com.test.design.strategy.fileprocessing.service.impl;

import com.test.design.strategy.fileprocessing.service.FileReaderStrategy;

import java.io.File;

public class XMLReaderStrategy implements FileReaderStrategy {
    @Override
    public void readFile(File jsonFile) {
        System.out.println("XMLReader Strategy invoked...");
    }
}

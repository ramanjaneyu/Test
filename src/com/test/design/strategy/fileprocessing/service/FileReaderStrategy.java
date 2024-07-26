package com.test.design.strategy.fileprocessing.service;

import java.io.File;
import java.util.concurrent.ExecutionException;

public interface FileReaderStrategy {
    void readFile(File jsonFile) throws ExecutionException, InterruptedException;
}

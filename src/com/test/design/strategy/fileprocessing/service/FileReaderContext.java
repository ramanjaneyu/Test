package com.test.design.strategy.fileprocessing.service;

import com.test.design.strategy.fileprocessing.enums.FileTypeEnum;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class FileReaderContext {
    private Map<String, FileReaderStrategy> fileReaderStrategyMap;
    private FileReaderStrategy strategy;
    public FileReaderContext(Map<String, FileReaderStrategy> fileReaderStrategyMap){
        this.fileReaderStrategyMap = fileReaderStrategyMap;
    }
    public void executeRead(FileTypeEnum fileTypeEnum, File file) throws ExecutionException, InterruptedException {
       FileReaderStrategy fileReaderStrategy = fileReaderStrategyMap.get(fileTypeEnum.name());
       fileReaderStrategy.readFile(file);
    }
}

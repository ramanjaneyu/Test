package com.test.design.strategy.fileprocessing;

import com.test.design.strategy.fileprocessing.enums.FileTypeEnum;
import com.test.design.strategy.fileprocessing.service.FileReaderContext;
import com.test.design.strategy.fileprocessing.service.FileReaderStrategy;
import com.test.design.strategy.fileprocessing.service.impl.CSVReaderStrategy;
import com.test.design.strategy.fileprocessing.service.impl.JsonReaderStrategy;
import com.test.design.strategy.fileprocessing.service.impl.XMLReaderStrategy;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class FileReaderStrategyMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<String, FileReaderStrategy> map = new HashMap<>();
        map.put(FileTypeEnum.XML.name(), new XMLReaderStrategy());
        map.put(FileTypeEnum.CSV.name(), new CSVReaderStrategy());
        map.put(FileTypeEnum.JSON.name(), new JsonReaderStrategy());

        //Here we can pass ReaderStrategy object instead of map for simplicity
        //FileReaderContext context = new FileReaderContext(new JsonReaderStrategy());

        FileReaderContext context = new FileReaderContext(map);
        context.executeRead(FileTypeEnum.JSON, new File("employees.json"));
    }
}

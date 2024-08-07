package com.example.simplelog.impl;

import com.example.simplelog.config.LoggerConfig;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SimpleLoggerFactory implements ILoggerFactory {
    private final ConcurrentMap<String, Logger> loggerMap = new ConcurrentHashMap<>();
    private final LoggerConfig config;

    public SimpleLoggerFactory(LoggerConfig config) {
        this.config = config;
    }

    @Override
    public Logger getLogger(String name) {
        Logger logger = loggerMap.get(name);
        if (logger == null) {
            logger = new SimpleLogger(name, config);
            Logger existingLogger = loggerMap.putIfAbsent(name, logger);
            if (existingLogger != null) {
                logger = existingLogger;
            }
        }
        return logger;
    }
}

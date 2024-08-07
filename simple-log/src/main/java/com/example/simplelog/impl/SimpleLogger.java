package com.example.simplelog.impl;

import com.example.simplelog.config.LoggerConfig;
import org.slf4j.Logger;
import org.slf4j.Marker;

public class SimpleLogger implements Logger {
    private final String name;
    private final LoggerConfig config;

    public SimpleLogger(String name, LoggerConfig config) {
        this.name = name;
        this.config = config;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isTraceEnabled() {
        return config.isLevelEnabled("TRACE");
    }

    @Override
    public void trace(String msg) {
        log("TRACE", msg);
    }

    @Override
    public void trace(String format, Object arg) {
        log("TRACE", String.format(format, arg));
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        log("TRACE", String.format(format, arg1, arg2));
    }

    @Override
    public void trace(String format, Object... arguments) {
        log("TRACE", String.format(format, arguments));
    }

    @Override
    public void trace(String msg, Throwable t) {
        log("TRACE", msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override
    public void trace(Marker marker, String msg) {
        trace(msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        trace(format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        trace(format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... arguments) {
        trace(format, arguments);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        trace(msg, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return config.isLevelEnabled("DEBUG");
    }

    @Override
    public void debug(String msg) {
        log("DEBUG", msg);
    }

    @Override
    public void debug(String format, Object arg) {
        log("DEBUG", String.format(format, arg));
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        log("DEBUG", String.format(format, arg1, arg2));
    }

    @Override
    public void debug(String format, Object... arguments) {
        log("DEBUG", String.format(format, arguments));
    }

    @Override
    public void debug(String msg, Throwable t) {
        log("DEBUG", msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override
    public void debug(Marker marker, String msg) {
        debug(msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        debug(format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        debug(format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        debug(format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        debug(msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return config.isLevelEnabled("INFO");
    }

    @Override
    public void info(String msg) {
        log("INFO", msg);
    }

    @Override
    public void info(String format, Object arg) {
        log("INFO", String.format(format, arg));
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        log("INFO", String.format(format, arg1, arg2));
    }

    @Override
    public void info(String format, Object... arguments) {
        log("INFO", String.format(format, arguments));
    }

    @Override
    public void info(String msg, Throwable t) {
        log("INFO", msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override
    public void info(Marker marker, String msg) {
        info(msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        info(format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        info(format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        info(format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        info(msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return config.isLevelEnabled("WARN");
    }

    @Override
    public void warn(String msg) {
        log("WARN", msg);
    }

    @Override
    public void warn(String format, Object arg) {
        log("WARN", String.format(format, arg));
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        log("WARN", String.format(format, arg1, arg2));
    }

    @Override
    public void warn(String format, Object... arguments) {
        log("WARN", String.format(format, arguments));
    }

    @Override
    public void warn(String msg, Throwable t) {
        log("WARN", msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    @Override
    public void warn(Marker marker, String msg) {
        warn(msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        warn(format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        warn(format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        warn(format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        warn(msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return config.isLevelEnabled("ERROR");
    }

    @Override
    public void error(String msg) {
        log("ERROR", msg);
    }

    @Override
    public void error(String format, Object arg) {
        log("ERROR", String.format(format, arg));
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        log("ERROR", String.format(format, arg1, arg2));
    }

    @Override
    public void error(String format, Object... arguments) {
        log("ERROR", String.format(format, arguments));
    }

    @Override
    public void error(String msg, Throwable t) {
        log("ERROR", msg, t);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override
    public void error(Marker marker, String msg) {
        error(msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        error(format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        error(format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        error(format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        error(msg, t);
    }

    private void log(String level, String message) {
        if (config.isLevelEnabled(level)) {
            System.out.printf("%s [%s] %s - %s%n", level, name, config.getCurrentTime(), message);
        }
    }

    private void log(String level, String message, Throwable t) {
        if (config.isLevelEnabled(level)) {
            System.out.printf("%s [%s] %s - %s%n", level, name, config.getCurrentTime(), message);
            t.printStackTrace(System.out);
        }
    }
}

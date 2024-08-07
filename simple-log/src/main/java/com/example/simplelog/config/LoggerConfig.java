package com.example.simplelog.config;

public class LoggerConfig {
    private String level;

    public LoggerConfig(String level) {
        this.level = level;
    }

    public boolean isLevelEnabled(String level) {
        return switch (this.level) {
            case "DEBUG" -> true;
            case "INFO" -> !level.equals("DEBUG");
            case "WARN" -> level.equals("WARN") || level.equals("ERROR");
            case "ERROR" -> level.equals("ERROR");
            default -> false;
        };
    }

    public String getCurrentTime() {
        return java.time.LocalDateTime.now().toString();
    }
}

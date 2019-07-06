package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logger = null;
    private String fileName = "";
    private String lastLog = "";

    private Logger() {
    }
    public static Logger getInstance() {
        if (logger == null) {
            synchronized(Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public String getFileName() {
        return fileName;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the log");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the log");
    }
}
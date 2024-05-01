package com.assignment.question;

import lombok.Synchronized;
import org.springframework.boot.logging.LogLevel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {
    private static LoggerImpl logger = null;

    private LoggerImpl(){};

    private String logFilePath;
    private PrintWriter pw;

    public static LoggerImpl getInstance(){
        if(logger == null){
            synchronized(LoggerImpl.class){
                if(logger == null)
                {
                    logger = new LoggerImpl();
                }
            }
        }
        return logger;
    }

    public static void resetInstance(){
        logger = null;
    }

    @Override
    public void log(LogLevel level, String message) {
        if(pw == null){
            throw new IllegalStateException("Print Writer not set");
        }

        String logMessage = "DateTime: " + LocalDateTime.now() + " LogLevel: " + level + " Message: " + message;
        pw.println(logMessage);
    }

    @Override
    public void setLogFile(String filePath) {
        this.logFilePath = filePath;
        try{
            pw = new PrintWriter(logFilePath);
        }catch (Exception e){
            System.out.println("File not found");
        }
    }

    @Override
    public String getLogFile() {
        return logFilePath;
    }

    @Override
    public void flush() {
        if(pw != null){
            pw.flush();
        }
    }

    @Override
    public void close() {
        if(pw != null){
            pw.close();
            pw = null;
        }
    }
}
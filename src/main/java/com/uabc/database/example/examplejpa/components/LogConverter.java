package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.Log;
import com.uabc.database.example.examplejpa.model.LogModel;
import org.springframework.stereotype.Component;

@Component("logConverter")
public class LogConverter {
    public Log convertLogModel2Log(LogModel logModel) {
        Log log = new Log();
        log.setDate(logModel.getDate());
        log.setDetails(logModel.getDetails());
        log.setId(logModel.getId());
        log.setUrl(logModel.getUrl());
        log.setUsername(logModel.getUsername());
        return log;
    }

    public LogModel convertLog2LogModel(Log log) {
        LogModel logModel = new LogModel();
        logModel.setDate(log.getDate());
        logModel.setDetails(log.getDetails());
        logModel.setId(log.getId());
        logModel.setUrl(log.getUrl());
        logModel.setUsername(log.getUsername());
        return logModel;
    }
}

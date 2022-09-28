package com.yuricjardim.sbmongodb.resources.exception;

import lombok.Data;

import java.io.Serializable;

@Data
public class StandardError implements Serializable {

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
    public StandardError() {
    }

    public StandardError(Long timestamp, Integer status, String error, String message, String path) {
        super();
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
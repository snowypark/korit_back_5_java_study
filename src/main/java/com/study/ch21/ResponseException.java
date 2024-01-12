package com.study.ch21;

import lombok.Getter;

import java.util.Map;

@Getter
public class ResponseException extends RuntimeException {
    private Map<String, Object> errorMap;

    public ResponseException(String message, Map<String, Object> errorMap) {
        super(message);
        this.errorMap = errorMap;

    }
}

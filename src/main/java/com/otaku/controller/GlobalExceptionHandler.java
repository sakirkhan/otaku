package com.otaku.controller;

import com.otaku.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse>handleException(Exception ex){
        ApiResponse apiResponse = new ApiResponse(null,null,null);
        apiResponse.setHttpStatus (HttpStatus.INTERNAL_SERVER_ERROR);
        apiResponse.setMessage ("An error occurred while processing the request.");
        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}

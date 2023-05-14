package com.otaku.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse <T>{
    private String message;
    private HttpStatus httpStatus;
    private T data;

    public ApiResponse(HttpStatus httpStatus,String message,T data){
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }
}

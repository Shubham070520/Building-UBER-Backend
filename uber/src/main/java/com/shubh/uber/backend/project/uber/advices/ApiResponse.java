package com.shubh.uber.backend.project.uber.advices;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ApiResponse<T> {

    //    @JsonFormat(pattern = "hh:mm:ss dd-MM-yyyy")
    private LocalDateTime timeStamp;
    private T data;
    private ApiError error;

    public ApiResponse() {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiResponse(T data) {
        this();
        this.data = data;
    }

    public ApiResponse(ApiError error) {
        this();
        this.error = error;
    }
}

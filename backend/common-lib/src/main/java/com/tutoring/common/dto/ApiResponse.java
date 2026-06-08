package com.tutoring.common.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ApiResponse<T> {

    private String timestamp;
    private int status;
    private String message;
    private T data;
}

package com.tutoring.common.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PaginationResponse<T> {

    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
}

package com.example.testing.service.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class SuccessResponsePaginationData extends SuccessResponseData{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int totalPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long totalElements;

    public SuccessResponsePaginationData(int totalPages, long totalElements, Object object) {
        super(object);
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}

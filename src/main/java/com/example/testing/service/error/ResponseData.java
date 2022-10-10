package com.example.testing.service.error;

import com.example.testing.model.consts.SymbolConstant;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class ResponseData {

    public static final String DEFAULT_SUCCESS_MESSAGE = "Request Successful";

    public static final String DEFAULT_ERROR_MESSAGE = "Network Anomaly";

    public static final Integer DEFAULT_SUCCESS_CODE = 200;

    public static final Integer DEFAULT_ERROR_CODE = 500;

    private Boolean success;
    private Integer code;
    private String message;
    private Object data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> messages;

    public ResponseData(Boolean success, Integer code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;

        String [] array = message.split(SymbolConstant.COLON + SymbolConstant.COLON);
        this.messages = array.length > 1 ? Arrays.asList(array) : null;
    }

    public static SuccessResponseData success() {
        return new SuccessResponseData();
    }

    public static SuccessResponseData success(Object object) {
        return new SuccessResponseData(object);
    }

    public static SuccessResponseData success(Integer code, String message, Object object) {
        return new SuccessResponseData(code, message, object);
    }

    public static ErrorResponseData error(String message) {
        return new ErrorResponseData(message);
    }

    public static ErrorResponseData error(Integer code, String message) {
        return new ErrorResponseData(code, message);
    }

    public static ErrorResponseData error(Integer code, String message, Object object) {
        return new ErrorResponseData(code, message, object);
    }
}

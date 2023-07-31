package com.automation.ui.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorResponse {
    @JsonProperty("error_message")
    public String errorMessage;

    public ErrorResponse(String message) {
        this.errorMessage = message;
    }

}

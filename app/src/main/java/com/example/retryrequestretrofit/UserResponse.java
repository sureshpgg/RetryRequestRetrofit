package com.example.retryrequestretrofit;


import com.google.gson.annotations.SerializedName;

public class UserResponse {
    @SerializedName("authToken")
    private String authToken;
    @SerializedName("data")
    private Object data;
    @SerializedName("error")
    private Boolean error;
    @SerializedName("message")
    private String message;
    @SerializedName("statusCode")
    private Long statusCode;
    public String getAuthToken() {
        return authToken;
    }
    public Object getData() {
        return data;
    }
    public Boolean getError() {
        return error;
    }
    public String getMessage() {
        return message;
    }
    public Long getStatusCode() {
        return statusCode;
    }
}

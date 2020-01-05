package com.example.retryrequestretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserApiCall {
    @RetryRequest
    @GET("user")
    Call<UserResponse> getUsers();


}

package com.example.retryrequestretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView txvResult;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvResult = findViewById(R.id.text);
        button=findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        UserApiCall apiService = RetrofitClient.getApiService();
        apiService.getUsers().enqueue(new Callback<UserResponse>() {
            @Override public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                txvResult.setText(response.body().getMessage());
                Toast.makeText(getApplicationContext(), "Success " + response.body().getMessage(),
                        Toast.LENGTH_LONG).show();
            }
            @Override public void onFailure(Call<UserResponse> call, Throwable t) {
                txvResult.setText(t.getMessage());
                Toast.makeText(getApplicationContext(), "Failure " + t.getMessage(), Toast.LENGTH_LONG)
                        .show();
            }
        });

    }
});
    }
}

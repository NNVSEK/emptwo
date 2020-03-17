package com.example.emptwo;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Header;

public interface dataservice {

    @GET("search.php?s=margarita&apiKey=1")
    Call<drink> getAllDrink();

}

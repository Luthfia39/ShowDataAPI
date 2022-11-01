package com.example.showdataapi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
//     endpoint
    @GET("jokes/ten")
//    request kembalian arraylist bertipe data joke
    Call<ArrayList<Joke>> getJokes();
}

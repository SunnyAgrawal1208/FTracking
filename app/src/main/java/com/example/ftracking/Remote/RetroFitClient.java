package com.example.ftracking.Remote;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseURL){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())     //Create an instance using a default Gson instance for conversion.
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())// it pushes the meaningless response bytes through converters and wraps it into a usable response with meaningful Java objects.
                                                                        //Returns an instance which creates synchronous observables that do not operate on any scheduler by default.
                    .build();
        }
        return retrofit;
    }
}

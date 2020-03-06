package com.example.ftracking.Remote;

import com.example.ftracking.Model.MyResponse;
import com.example.ftracking.Model.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {

    @Headers({
        "Content-Type:application/json",
            "Authorization:key=AAAAP-zk3ww:APA91bG_rJRGQyUvSGuOcvfk5642tXoYoPQss1E-diX0eSXusR26_10aKa3TjgyihYYoeFq94EVexkSi9dg977Jb37v4nBwFq8AgR5PUUCpYC3bg6QWHVnVqSf0lnjxzGrXPMlFmZZfw"
    })  //Replaces the header with the value of its target.

    @POST("fcm/send")   //Send Post Request with params using Retrofit

    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);  //Send Data in request body

}

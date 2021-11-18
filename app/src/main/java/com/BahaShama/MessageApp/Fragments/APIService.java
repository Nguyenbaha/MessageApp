package com.BahaShama.MessageApp.Fragments;

import com.BahaShama.MessageApp.Notifications.MyResponse;
import com.BahaShama.MessageApp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key= in firebase Storage Rules, change value of \"allow read, write:\" from \"if request.auth != null\" to \"if true;\" (video 12)"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

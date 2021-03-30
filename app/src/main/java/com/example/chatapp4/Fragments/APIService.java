package com.example.chatapp4.Fragments;

import com.example.chatapp4.Notifications.MyResponse;
import com.example.chatapp4.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAoLPUXlk:APA91bGd3jjfddXLWt1XmrTy_31aD8znEo5rylRMr_YHpxnTYl0oK4LZ7H-eccgZNNf5kUttuCJzur4LbMOM1H5p6EcuIZBUPzsroPtOunrFbvT4be3gYZruXsVE6XppbgKu0gf0Aeyi"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}


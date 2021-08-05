package com.nurdinsanjaya.studio.Api;

import com.nurdinsanjaya.studio.model.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}

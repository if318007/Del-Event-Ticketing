package com.example.deleventticketing.apihelper;

public class UtilsAPI {

    public static final String BASE_URL_API = "http://192.168.43.188:8080/pasti/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}

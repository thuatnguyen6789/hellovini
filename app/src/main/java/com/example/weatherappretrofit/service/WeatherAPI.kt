package com.example.weatherappretrofit.service

import com.example.weatherappretrofit.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    //http://api.openweathermap.org/data/2.5/weather?q=london&APPID=45f42356297f2e076180b13de6a3dbaf

    @GET("data/2.5/weather?&units=metric&APPID=45f42356297f2e076180b13de6a3dbaf")
    fun getData(
        @Query("q") cityName: String,
        @Query("units") units: String = "metric",
        @Query("APPID") appId: String = "45f42356297f2e076180b13de6a3dbaf"
    ): Single<WeatherModel>
}
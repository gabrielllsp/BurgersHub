package com.example.burgershub.data.api

import com.example.burgershub.data.model.BurgerResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceAPI {

    @GET("burgers")
    suspend fun getBurgers(): List<BurgerResponse>

    @GET("Burgers/{burgerId}")
    suspend fun getBurgerById(
        @Path("burgerId") burgerId: Int
    ): BurgerResponse

    @GET("find-burger/")
    suspend fun getBurgerByName(
        @Path("searchQuery") name: String
    ): List<BurgerResponse>
}
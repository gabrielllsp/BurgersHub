package com.example.burgershub.data.api

import com.example.burgershub.data.model.BurgerResponse
import io.github.brunogabriel.mockpinterceptor.MOCK
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceAPI {

    @MOCK(asset = "burgers_response.json", runDelay = true)
    @GET("burgers")
    suspend fun getBurgers(): List<BurgerResponse>

    @MOCK(asset = "burger_response.json", runDelay = true)
    @GET("Burgers/{burgerId}")
    suspend fun getBurgerById(
        @Path("burgerId") burgerId: Int
    ): BurgerResponse

    @MOCK(asset = "burger_name_response.json", runDelay = true)
    @GET("find-burger/")
    suspend fun getBurgerByName(
        @Path("searchQuery") name: String
    ): List<BurgerResponse>
}
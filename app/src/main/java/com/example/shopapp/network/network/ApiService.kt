package com.example.shopapp.network.network

import com.example.shopapp.models.PersonInfo
import com.example.shopapp.models.PostItem
import com.example.shopapp.models.SignIn
import com.example.shopapp.models.SignUp
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("login")
    suspend fun login(@Field("email") email: String, @Field("password") password: String): Response<SignIn>

    @FormUrlEncoded
    @POST("register")
    suspend fun register(@Field("email") email: String, @Field("full_name") full_name: String,  @Field("password") password: String): Response<SignUp>

    @GET("posts")
    suspend fun getPosts(): Response<List<PostItem>>

    @FormUrlEncoded
    @POST("profile")
    suspend fun completeProfile(@Field("user_id") userID: Int): Response<PersonInfo>


}
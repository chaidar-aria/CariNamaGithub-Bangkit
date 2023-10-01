package com.chaidar.carinamagithub.data.retrofit
import com.chaidar.carinamagithub.data.response.PostReviewResponse
import com.chaidar.carinamagithub.data.response.RestaurantResponse
import retrofit2.http.*
import retrofit2.Call


interface ApiService {

    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ): Call<PostReviewResponse>
}
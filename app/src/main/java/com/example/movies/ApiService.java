package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=35P1RT1-B8F4BN4-PGJYFNW-1RSA768&rating.kp=4-8&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{idFilms}?token=35P1RT1-B8F4BN4-PGJYFNW-1RSA768")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int idFilms);

    @GET("review?token=35P1RT1-B8F4BN4-PGJYFNW-1RSA768")
    Single<ReviewResponse> loadReviews(@Query("movieId") int id);
}

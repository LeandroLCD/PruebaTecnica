package com.leandrolcd.pruebatecnica.core.networkmodule

import android.content.Context
import com.leandrolcd.pruebatecnica.R
import com.leandrolcd.pruebatecnica.data.network.ActivateClient
import com.leandrolcd.pruebatecnica.data.network.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitProvider {
    @Singleton
    @Provides
    @AcceptInterceptorRetrofit
    fun provideAcceptInterceptorRetrofit(
        context: Context,
        @AcceptOkHttpClient okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(context.getString(R.string.BASE_URL))
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    @ApiInterceptorRetrofit
    fun provideApiInterceptorRetrofit(
        context: Context,
        @ApiInterceptorOkHttpClient okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(context.getString(R.string.BASE_URL))
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }



    @Singleton
    @Provides
    fun providerLoginClient(@AcceptInterceptorRetrofit retrofit: Retrofit): ActivateClient {
        return retrofit.create(ActivateClient::class.java)
    }

    @Singleton
    @Provides
    fun provideApiService(@ApiInterceptorRetrofit retrofit: Retrofit): ApiClient {
        return retrofit.create(ApiClient::class.java)
    }




}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AcceptInterceptorRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiInterceptorRetrofit
package com.leandrolcd.pruebatecnica.core.networkmodule

import android.content.Context
import com.leandrolcd.pruebatecnica.R
import com.leandrolcd.pruebatecnica.data.network.PosClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitProvider {
    @Singleton
    @Provides
    fun providerRetrofit(@ApplicationContext context:Context): Retrofit {
        return Retrofit.Builder()
            .baseUrl(context.getString(R.string.BASE_URL))
            .addConverterFactory(GsonConverterFactory.create())
            .client(onClient())
            .build()
    }



    @Singleton
    @Provides
    fun providerLoginClient(retrofit: Retrofit): PosClient {
        return retrofit.create(PosClient::class.java)
    }


    private fun onClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor())
            .build()
    }

}
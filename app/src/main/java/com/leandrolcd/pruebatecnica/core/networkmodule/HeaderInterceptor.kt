package com.leandrolcd.pruebatecnica.core.networkmodule

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @AcceptOkHttpClient
    @Provides
    fun provideAcceptOkHttpClient(
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @ApiInterceptorOkHttpClient
    @Provides
    fun provideOtherInterceptorOkHttpClient(
        apiInterceptor: ApiInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(apiInterceptor)
            .build()
    }
}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AcceptOkHttpClient

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiInterceptorOkHttpClient
package com.radityalabs.android.corona.data

import com.radityalabs.android.corona.di.Injector
import com.radityalabs.android.corona.helpers.Either
import com.radityalabs.android.corona.network.CovidService
import com.radityalabs.android.corona.network.response.ConfirmedCaseResponse

interface ConfirmedCaseRepository {
    suspend fun fetchConfirmedCase(): Either<Throwable, ConfirmedCaseResponse>
}

class ConfirmedCaseRepositoryImpl(
    private val service: CovidService = Injector.get()
) : ConfirmedCaseRepository {
    override suspend fun fetchConfirmedCase(): Either<Throwable, ConfirmedCaseResponse> {
        TODO()
    }
}
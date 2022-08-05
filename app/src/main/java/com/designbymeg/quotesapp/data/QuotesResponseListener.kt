package com.designbymeg.quotesapp.data

import com.designbymeg.quotesapp.models.QuotesResponse

interface QuotesResponseListener {
    fun didFetch(response: List<QuotesResponse>, message: String)
    fun didError(message: String)
}
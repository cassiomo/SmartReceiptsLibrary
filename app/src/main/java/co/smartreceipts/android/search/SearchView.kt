package co.smartreceipts.android.search

import io.reactivex.Observable

interface SearchView {

    val inputChanges: Observable<CharSequence>

    fun presentSearchResults(searchResults: SearchInteractor.SearchResults)
}
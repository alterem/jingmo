package com.hefengbao.jingmo.ui.screen.people

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hefengbao.jingmo.data.database.model.SimplePeopleInfo
import com.hefengbao.jingmo.data.repository.PeopleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PeopleSearchViewModel @Inject constructor(
    private val peopleRepository: PeopleRepository
) : ViewModel() {
    private val _recommendList: MutableStateFlow<List<String>> = MutableStateFlow(emptyList())
    val recommendList: SharedFlow<List<String>> = _recommendList

    init {
        _recommendList.value = peopleRepository.getRecommendList()
    }

    private val _searchResult: MutableStateFlow<List<SimplePeopleInfo>> =
        MutableStateFlow(emptyList())
    val searchResult: SharedFlow<List<SimplePeopleInfo>> = _searchResult

    fun search(string: String) {
        viewModelScope.launch {
            peopleRepository.searchList(string).collectLatest {
                _searchResult.value = it
            }
        }
    }
}
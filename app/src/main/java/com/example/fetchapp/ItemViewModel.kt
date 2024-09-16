package com.example.fetchapp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ItemViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> = _items

    init {
        fetchItems()
    }

    private fun fetchItems() {
        viewModelScope.launch {
            try {
                val fetchedItems = RetrofitInstance.api.getItems()
                // Filter out items where "name" is blank or null
                val filteredItems = fetchedItems.filter { !it.name.isNullOrEmpty() }
                    .sortedWith(compareBy({ it.listId }, { it.name }))

                _items.value = filteredItems
            } catch (e: Exception) {
                // Handle exceptions
            }
        }
    }
}

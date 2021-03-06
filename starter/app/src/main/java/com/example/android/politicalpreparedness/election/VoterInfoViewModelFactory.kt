package com.example.android.politicalpreparedness.election

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.politicalpreparedness.network.models.Division

class VoterInfoViewModelFactory(private val dataSource: ElectionRepository, private val id:Int, private val division:Division): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VoterInfoViewModel::class.java)) {
            return VoterInfoViewModel(dataSource, id, division) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }



}
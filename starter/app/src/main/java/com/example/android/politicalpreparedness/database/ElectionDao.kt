package com.example.android.politicalpreparedness.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.android.politicalpreparedness.network.models.Election

@Dao
interface ElectionDao {

    @Insert
    suspend fun insert(election: Election)

    @Query("SELECT * FROM election_table ORDER BY electionDay DESC")
    fun getAllElections(): LiveData<List<Election>>

    @Query("SELECT * FROM election_table WHERE id = :id ")
    suspend fun get(id:Int): Election?

    @Delete
    suspend fun delete (election: Election)

    @Query("DELETE FROM election_table")
    suspend fun clear()
}
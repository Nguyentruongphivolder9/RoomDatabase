package com.example.roomdatabase.data.local.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdatabase.data.local.entities.NoteWord;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM note")
    LiveData<List<NoteWord>> getListNote();

}

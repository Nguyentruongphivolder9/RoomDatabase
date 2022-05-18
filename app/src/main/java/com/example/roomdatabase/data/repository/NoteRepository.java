package com.example.roomdatabase.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.roomdatabase.data.local.DatabaseManager;
import com.example.roomdatabase.data.local.daos.NoteDao;
import com.example.roomdatabase.data.local.entities.NoteWord;

import java.util.List;

public class NoteRepository {
    private NoteDao noteDao;

    public NoteRepository(Application application){
        noteDao = DatabaseManager.getDatabase(application).getNotDao();
    }

    public LiveData<List<NoteWord>> getListNotes(){
        return noteDao.getListNote();
    }
}

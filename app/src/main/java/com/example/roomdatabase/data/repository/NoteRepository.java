package com.example.roomdatabase.data.repository;

import android.app.Application;

import com.example.roomdatabase.data.local.DatabaseManager;
import com.example.roomdatabase.data.local.daos.NoteDao;
import com.example.roomdatabase.data.local.entities.NoteWord;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

public class NoteRepository {
    private NoteDao noteDao;

    public NoteRepository(Application application){
        noteDao = DatabaseManager.getDatabase(application).getNotDao();
    }

    public Observable<List<NoteWord>> getListNote(){
        return noteDao.getListNote();
    }

    public Completable insertNote(NoteWord noteWord){
        return noteDao.insertNote(noteWord);
    }
}

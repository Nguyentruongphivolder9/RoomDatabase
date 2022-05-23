package com.example.roomdatabase.presentation.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.roomdatabase.data.local.entities.NoteWord;
import com.example.roomdatabase.data.repository.NoteRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private NoteRepository noteRepository;
    private MutableLiveData<List<NoteWord>> ListNotes = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
        noteRepository = new NoteRepository(application);
    }

    public LiveData<List<NoteWord>> getListNotes(){
        return noteRepository.getListNotes();
    }
}

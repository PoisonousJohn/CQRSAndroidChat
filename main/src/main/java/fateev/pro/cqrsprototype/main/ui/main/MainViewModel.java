package fateev.pro.cqrsprototype.main.ui.main;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import fateev.pro.cqrsprototype.main.model.Message;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<Message>> messages;

    public MutableLiveData<List<Message>> getMessages() {
        if (messages == null)  {
            messages = new MutableLiveData<>();
        }
        return messages;
    }
}

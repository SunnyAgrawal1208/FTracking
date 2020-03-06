package com.example.ftracking.Interface;

import java.util.List;

public interface IFirebaseLoadDone {
    void onFirebaseLoadUserNameDone(List<String> Email);
    void onFirebaseLoadFailed(String message);
}

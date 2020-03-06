package com.example.ftracking.Utils;

import com.example.ftracking.Model.User;
import com.example.ftracking.Remote.IFCMService;
import com.example.ftracking.Remote.RetroFitClient;

public class Common {
    public static final String USER_INFORMATION = "UserInformation";
    public static final String USER_UID_SAVE_KEY = "SaveUid";
    public static final String TOKENS = "Tokens";
    public static final String FROM_NAME = "FromName";
    public static final String ACCEPT_LIST = "acceptList";
    public static final String FROM_UID = "FromUid";
    public static final String TO_UID = "ToUid";
    public static final String TO_NAME = "ToName";
    public static User loggerUser;

    public static IFCMService getFCMService() {
        return RetroFitClient.getClient("https://fcm.googleapis.com/")
                .create(IFCMService.class);
    }
}

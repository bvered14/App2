package com.example.assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class chatMessage {
    public String userPhoto;
    public String userName;
    public String userID;
    public String message;
    public String timestamp;

    public chatMessage(String userPhoto, String userName, String userID, String message) {
        this.userPhoto = userPhoto;
        this.userName = userName;
        this.userID = userID;
        this.message = message;

        // Set timestamp to current time when the message is created.
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
    }
}

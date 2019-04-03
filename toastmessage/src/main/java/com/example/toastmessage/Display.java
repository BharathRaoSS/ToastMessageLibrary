package com.example.toastmessage;

import android.content.Context;
import android.widget.Toast;

public class Display {
    public void toastMessage(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}

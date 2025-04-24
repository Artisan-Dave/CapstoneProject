package com.example.capstone_dswms;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {
    public static void showCustomToast(Context context, String message) {
        // Inflate the custom layout
        LayoutInflater inflater = LayoutInflater.from(context);
        View layout = inflater.inflate(R.layout.custom_toast1, null);

        // Set the custom message
        TextView textView = layout.findViewById(R.id.c_toast1);
        textView.setText(message);

        // Create the custom toast
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER, 0, 16);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        // Show the toast
        toast.show();
    }

}

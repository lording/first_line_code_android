package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Attr;

import java.util.jar.Attributes;

public class TitleLayout extends LinearLayout implements View.OnClickListener {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button button_back = findViewById(R.id.title_back);
        Button button_edit = findViewById(R.id.title_edit);
        button_back.setOnClickListener(this);
        button_edit.setOnClickListener(this);
        Log.d("TitleLayout", "TitleLayout on construct");
    }

    @Override
    public void onClick(View v) {
        Log.d("TitleLayout", "v.getId = " + v.getId());
        switch (v.getId()) {
            case R.id.title_back:
                ((Activity)getContext()).finish();
                break;
            case R.id.title_edit:
                Toast.makeText(getContext(),"you clicked edit button", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d("TitleLayout", "do default");
                break;
        }
    }
}

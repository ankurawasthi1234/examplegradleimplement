package com.example.gimexample;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyTestActivity extends AppCompatActivity {
    Button sumbit ;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_test);
        setpopup(this);
    }

    public void setpopup(Activity activity){
        activity = this;
        sumbit = (Button)findViewById(R.id.sumbit_btn);
        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MyTestActivity.this, R.style.AppCompatAlertDialogStyle);
                builder.setTitle("Dialog");
                builder.setCancelable(false);
                builder.setMessage("THANK YOU ....");
                builder.setPositiveButton("OK", null);
                builder.show();
            }
        });
    }
}

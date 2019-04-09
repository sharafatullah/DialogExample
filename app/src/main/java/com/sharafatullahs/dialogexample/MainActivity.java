package com.sharafatullahs.dialogexample;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sharafatullahs.dialogexample.CommanClasses.UtilCommanClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button To show the dialog
        Button btnOpenDialog = findViewById(R.id.btnOpenDialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //utility class in which i show the dialog
                UtilCommanClass utilCommanClass= new UtilCommanClass();
                utilCommanClass.ShowDialog(MainActivity.this);
            }
        });
    }
}

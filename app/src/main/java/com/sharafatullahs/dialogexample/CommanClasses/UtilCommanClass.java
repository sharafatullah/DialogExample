package com.sharafatullahs.dialogexample.CommanClasses;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sharafatullahs.dialogexample.R;

public class UtilCommanClass {

    public UtilCommanClass() {
    }

    public void ShowDialog(Context context){
        //Creating dialog final because want to used it inside button onclick listener
        final Dialog dialog = new Dialog(context);
        //setting the Layout to the dialog
        dialog.setContentView(R.layout.dialogitem);
        //making cancable false
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);

        //Making Dialog Transparent //You can be avoid
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        //Setting the Height and Width of Dialog
        Window window = dialog.getWindow();
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        //Declare and initialize the dialog widgets a
        RadioGroup rdgGender = dialog.findViewById(R.id.rdgGender);
        Button btnClose = dialog.findViewById(R.id.btnSubmit);
        RadioButton rdbMale = dialog.findViewById(R.id.rdbMale);
        RadioButton rdbFemale = dialog.findViewById(R.id.rdbFemale);
        ImageView imgClose = dialog.findViewById(R.id.imgClose);

        //Top of Dialog Cross Image on click on this dialog will close
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dialog != null && dialog.isShowing())
                    dialog.dismiss();
            }
        });

        //on button Submit Dialog will close
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dialog != null && dialog.isShowing())
                    dialog.dismiss();
            }
        });

        //for Show the Dialog
        if(dialog != null && !dialog.isShowing())
            dialog.show();
    }
}

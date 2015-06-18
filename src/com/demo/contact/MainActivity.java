package com.demo.contact;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnClickMe = (Button) findViewById(R.id.btnClickMe);
        btnClickMe.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						MainActivity.this);
		 
					// set title
					alertDialogBuilder.setTitle("Alert");
		 
					// set dialog message
					alertDialogBuilder
						.setMessage("Hello Hemanth!!")
						.setCancelable(false)
						.setPositiveButton("Ok",null);
						
						// create alert dialog
						AlertDialog alertDialog = alertDialogBuilder.create();
		 
						// show it
						alertDialog.show();
			}
		});
    }
}

package com.kmm.babytraker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BabyTracker extends Activity {
	 private static final int ACTIVITY_CREATE=0;
	
	private void ShowMessage(String message){
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	}
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selector);
        
        TextView diapers = (TextView) findViewById(R.id.diapers);
        TextView feedings = (TextView) findViewById(R.id.feeding);

        feedings.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ShowMessage("Feeding button pressed!");
				
			}
		});
        
        diapers.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onDiapersClick();
			}

		});
    }
    
    private void onDiapersClick()
    {
    	Intent i = new Intent(this, DiaperChange.class);
    	startActivityForResult(i, ACTIVITY_CREATE);
    }
    
       
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
//        switch(requestCode){
//        case ACTIVITY_CREATE:
//        	ShowMessage("Back from Diaper Change");
//        }
        
    }
    
}
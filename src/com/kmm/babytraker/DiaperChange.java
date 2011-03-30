package com.kmm.babytraker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiaperChange extends Activity {

	
	public void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diaperchange);
		
		Button save = (Button) findViewById(R.id.submit);
		
		save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
	}
	
}

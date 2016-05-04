package com.example.bookstore;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText et;
	EditText et1;
	EditText et2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main); 
		EditText et=(EditText)findViewById(R.id.editname);
		EditText et1=(EditText)findViewById(R.id.editmail);
		EditText et2=(EditText)findViewById(R.id.editpass);
        
    }
	public void log_btn(View v){
		MediaPlayer mp=MediaPlayer.create(this, R.raw.button);
		 mp.start();
		//if(et.getText().toString().equals(null)){
		Toast.makeText(getApplicationContext(), "Enter", Toast.LENGTH_SHORT).show();
		//}
		//else{
		Intent in=new Intent(MainActivity.this,SecondActivity.class);
		startActivity(in);
		//}
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

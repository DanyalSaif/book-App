package com.example.bookstore;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main2); 
		

}
	public void fiction_btn(View v)
	
	{
		MediaPlayer mp=MediaPlayer.create(this, R.raw.button);
		mp.start();
		Intent in=new Intent(SecondActivity.this,GridActivity.class);
		startActivity(in);
	}
}

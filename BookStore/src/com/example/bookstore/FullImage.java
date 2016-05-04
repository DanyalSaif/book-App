package com.example.bookstore;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FullImage extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fulimage);
         Intent i = getIntent();
		
		// Selected image id
		int position = i.getExtras().getInt("id");
		ImageAdapter imageAdapter = new ImageAdapter(this);
		
		ImageView imageView = (ImageView) findViewById(R.id.imageView);
		imageView.setImageResource(imageAdapter.mThumbIds[position]);
	
		
		
		

}
	public void read_btn(View v){
		MediaPlayer mp=MediaPlayer.create(this, R.raw.button);
		mp.start();
		Intent in=new Intent(FullImage.this,ReadActivity.class);
		startActivity(in);
	}
	public void cart_btn(View v)
	{
		Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
		//Toast.makeText(getApplicationContext(), "Added to cart", Toast.class).show();
	}
}

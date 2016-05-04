package com.example.bookstore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class GridActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_grid); 
		GridView gView = (GridView) findViewById(R.id.gridView);
		gView.setAdapter(new ImageAdapter(this));
		
		gView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				
				
				// Sending image id to FullScreenActivity
				Intent i = new Intent(getApplicationContext(), FullImage.class);
				// passing array index
				i.putExtra("id", position);
				startActivity(i);
			}
		});
	}
		
		
}


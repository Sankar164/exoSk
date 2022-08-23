
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		page_3
	 *	@date 		Tuesday 23rd of August 2022 09:40:02 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.innovativehackers.exosk;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class welcome_activity extends Activity {

	
	private View __bg__welcome_ek2;
	private View rectangle_24_ek2;
	private View ellipse_1_ek2;
	private View ellipse_2_ek2;
	private ImageView vector_ek12;
	private ImageView vector_ek13;
	private ImageView vector_ek14;
	private TextView _9_45_ek2;
	private ImageView ellipse_11_ek1;
	private TextView welcome_user_ek1;
	private ImageView _vector_ek15;
	private View rectangle_1;
	private TextView get_started;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		
		__bg__welcome_ek2 = (View) findViewById(R.id.__bg__welcome_ek2);
		rectangle_24_ek2 = (View) findViewById(R.id.rectangle_24_ek2);
		ellipse_1_ek2 = (View) findViewById(R.id.ellipse_1_ek2);
		ellipse_2_ek2 = (View) findViewById(R.id.ellipse_2_ek2);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		_9_45_ek2 = (TextView) findViewById(R.id._9_45_ek2);
		ellipse_11_ek1 = (ImageView) findViewById(R.id.ellipse_11_ek1);
		welcome_user_ek1 = (TextView) findViewById(R.id.welcome_user_ek1);
		_vector_ek15 = (ImageView) findViewById(R.id._vector_ek15);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		get_started = (TextView) findViewById(R.id.get_started);
	
		
		__bg__welcome_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), dashboard_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek15.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
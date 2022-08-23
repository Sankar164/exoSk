
	 
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
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class page_3_activity extends Activity {

	
	private View _bg__page_3_ek2;
	private View rectangle_24;
	private View ellipse_2;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private TextView _9_45;
	private TextView welcome_surjith_surya_v;
	private TextView activity__;
	private ImageView rectangle_28;
	private ImageView _vector_ek3;
	private ImageView _vector_ek4;
	private ImageView slice___2__33_3__;
	private ImageView slice___4__66_7__;
	private TextView resting;
	private ImageView vector_ek5;
	private TextView active;
	private TextView _75_;
	private ImageView rectangle_27;
	private TextView _5;
	private TextView hours_remamining__;
	private TextView battery__;
	private TextView percentage_remaining__;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.page_3);

		
		_bg__page_3_ek2 = (View) findViewById(R.id._bg__page_3_ek2);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		_9_45 = (TextView) findViewById(R.id._9_45);
		welcome_surjith_surya_v = (TextView) findViewById(R.id.welcome_surjith_surya_v);
		activity__ = (TextView) findViewById(R.id.activity__);
		rectangle_28 = (ImageView) findViewById(R.id.rectangle_28);
		_vector_ek3 = (ImageView) findViewById(R.id._vector_ek3);
		_vector_ek4 = (ImageView) findViewById(R.id._vector_ek4);
		slice___2__33_3__ = (ImageView) findViewById(R.id.slice___2__33_3__);
		slice___4__66_7__ = (ImageView) findViewById(R.id.slice___4__66_7__);
		resting = (TextView) findViewById(R.id.resting);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		active = (TextView) findViewById(R.id.active);
		_75_ = (TextView) findViewById(R.id._75_);
		rectangle_27 = (ImageView) findViewById(R.id.rectangle_27);
		_5 = (TextView) findViewById(R.id._5);
		hours_remamining__ = (TextView) findViewById(R.id.hours_remamining__);
		battery__ = (TextView) findViewById(R.id.battery__);
		percentage_remaining__ = (TextView) findViewById(R.id.percentage_remaining__);
	
		
		_vector_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), dashboard_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
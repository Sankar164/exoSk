
	 
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

public class reset_activity extends Activity {

	
	private View _bg__reset_ek2;
	private View ellipse_1_ek4;
	private View ellipse_2_ek4;
	private ImageView vector_ek19;
	private ImageView vector_ek20;
	private ImageView vector_ek21;
	private TextView _9_45_ek4;
	private TextView forgot_password_;
	private View rectangle_1_ek2;
	private TextView sign_in_ek1;
	private TextView enter_otp;
	private ImageView _vector_ek22;
	private View rectangle_2_ek2;
	private TextView enter_your_email_ek2;
	private View rectangle_2_ek3;
	private TextView enter_your_email_ek3;
	private View rectangle_2_ek4;
	private TextView enter_your_email_ek4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.reset);

		
		_bg__reset_ek2 = (View) findViewById(R.id._bg__reset_ek2);
		ellipse_1_ek4 = (View) findViewById(R.id.ellipse_1_ek4);
		ellipse_2_ek4 = (View) findViewById(R.id.ellipse_2_ek4);
		vector_ek19 = (ImageView) findViewById(R.id.vector_ek19);
		vector_ek20 = (ImageView) findViewById(R.id.vector_ek20);
		vector_ek21 = (ImageView) findViewById(R.id.vector_ek21);
		_9_45_ek4 = (TextView) findViewById(R.id._9_45_ek4);
		forgot_password_ = (TextView) findViewById(R.id.forgot_password_);
		rectangle_1_ek2 = (View) findViewById(R.id.rectangle_1_ek2);
		sign_in_ek1 = (TextView) findViewById(R.id.sign_in_ek1);
		enter_otp = (TextView) findViewById(R.id.enter_otp);
		_vector_ek22 = (ImageView) findViewById(R.id._vector_ek22);
		rectangle_2_ek2 = (View) findViewById(R.id.rectangle_2_ek2);
		enter_your_email_ek2 = (TextView) findViewById(R.id.enter_your_email_ek2);
		rectangle_2_ek3 = (View) findViewById(R.id.rectangle_2_ek3);
		enter_your_email_ek3 = (TextView) findViewById(R.id.enter_your_email_ek3);
		rectangle_2_ek4 = (View) findViewById(R.id.rectangle_2_ek4);
		enter_your_email_ek4 = (TextView) findViewById(R.id.enter_your_email_ek4);
	
		
		_vector_ek22.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
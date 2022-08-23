
	 
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

public class registration_activity extends Activity {

	
	private View _bg__registration_ek2;
	private View ellipse_1_ek5;
	private View ellipse_2_ek5;
	private ImageView vector_ek23;
	private ImageView vector_ek24;
	private ImageView vector_ek25;
	private TextView _9_45_ek5;
	private TextView welcome_onboard_;
	private TextView let_s_help_you_meet_up_your_tasks;
	private View rectangle_1_ek3;
	private TextView register;
	private TextView _already_have_an_account___sign_in;
	private View rectangle_2_ek5;
	private TextView enter_your_email_ek5;
	private View rectangle_2_ek6;
	private TextView enter_your_email_ek6;
	private View rectangle_2_ek7;
	private TextView enter_your_email_ek7;
	private View rectangle_2_ek8;
	private TextView enter_your_email_ek8;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration);

		
		_bg__registration_ek2 = (View) findViewById(R.id._bg__registration_ek2);
		ellipse_1_ek5 = (View) findViewById(R.id.ellipse_1_ek5);
		ellipse_2_ek5 = (View) findViewById(R.id.ellipse_2_ek5);
		vector_ek23 = (ImageView) findViewById(R.id.vector_ek23);
		vector_ek24 = (ImageView) findViewById(R.id.vector_ek24);
		vector_ek25 = (ImageView) findViewById(R.id.vector_ek25);
		_9_45_ek5 = (TextView) findViewById(R.id._9_45_ek5);
		welcome_onboard_ = (TextView) findViewById(R.id.welcome_onboard_);
		let_s_help_you_meet_up_your_tasks = (TextView) findViewById(R.id.let_s_help_you_meet_up_your_tasks);
		rectangle_1_ek3 = (View) findViewById(R.id.rectangle_1_ek3);
		register = (TextView) findViewById(R.id.register);
		_already_have_an_account___sign_in = (TextView) findViewById(R.id._already_have_an_account___sign_in);
		rectangle_2_ek5 = (View) findViewById(R.id.rectangle_2_ek5);
		enter_your_email_ek5 = (TextView) findViewById(R.id.enter_your_email_ek5);
		rectangle_2_ek6 = (View) findViewById(R.id.rectangle_2_ek6);
		enter_your_email_ek6 = (TextView) findViewById(R.id.enter_your_email_ek6);
		rectangle_2_ek7 = (View) findViewById(R.id.rectangle_2_ek7);
		enter_your_email_ek7 = (TextView) findViewById(R.id.enter_your_email_ek7);
		rectangle_2_ek8 = (View) findViewById(R.id.rectangle_2_ek8);
		enter_your_email_ek8 = (TextView) findViewById(R.id.enter_your_email_ek8);
	
		
		_already_have_an_account___sign_in.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	
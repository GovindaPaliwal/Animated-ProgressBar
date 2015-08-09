package com.gp.progressbar;

import com.govinda.githubprogressbar.R;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ExampleCall extends AppCompatActivity
{
	TeddyProgressBar progress;
	
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_example);
			
			progress=new TeddyProgressBar(ExampleCall.this);
			progress.show();
			
		}
}

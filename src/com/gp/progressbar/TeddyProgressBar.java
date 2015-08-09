package com.gp.progressbar;

import com.govinda.githubprogressbar.R;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class TeddyProgressBar extends AlertDialog 
{
Context context;
TextView txtBottomText;
ImageView imgTeddyImage;

public static String DEFALT_TEXT="Loading...";

    public TeddyProgressBar(Context context) 
    {    	
		super(context);
		// TODO Auto-generated constructor stub
		this.context=context;
	}
	@Override
    public void show() {

     super.show();
     setContentView(R.layout.activity_main);
     init();
     
     
    // AnimationDrawable Animation = (AnimationDrawable) img.getBackground();
   //  Animation.start();
     WindowManager.LayoutParams lp = this.getWindow().getAttributes();
     this.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
   
     Animation shake = AnimationUtils.loadAnimation(this.context, R.anim.shake);
     imgTeddyImage.startAnimation(shake);
     
     // remove the dim effect
     // lp.dimAmount = 0;
    }
	
	public void init()
	{
		imgTeddyImage=(ImageView)findViewById(R.id.imageView1);
	    txtBottomText=(TextView)findViewById(R.id.textView1);
	    txtBottomText.setText(DEFALT_TEXT);
	}
	
	public void setTextLoading(String txt) {
		this.DEFALT_TEXT=txt;
		txtBottomText.setText(DEFALT_TEXT);
	}
	
	
	
}
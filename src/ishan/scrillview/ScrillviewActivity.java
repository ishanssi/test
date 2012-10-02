package ishan.scrillview;

import java.io.File;

import ishan.scrillview.R.layout;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ScrillviewActivity extends Activity {
 
	LinearLayout myGallery;
	CheckBox c1,c2,c3;
	int key=0;
	private TranslateAnimation moveLefttoRight;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        final RelativeLayout popup = (RelativeLayout) findViewById(R.id.popup_window);
 
		final Button btn=(Button)findViewById(R.id.show_popup_button);
		
		  	moveLefttoRight = new TranslateAnimation(100, -160, 0, 0);
	        moveLefttoRight.setDuration(10);
	        moveLefttoRight.setFillAfter(true);
	        btn.startAnimation(moveLefttoRight);
	        
	        moveLefttoRight.setAnimationListener(new AnimationListener() {
				
				@Override
				public void onAnimationStart(Animation arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onAnimationRepeat(Animation arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onAnimationEnd(Animation arg0) {
					
//					android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) new LayoutParams(
//				            android.widget.LinearLayout.LayoutParams.FILL_PARENT,
//				            android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
//				            params.topMargin = btn.getTop()-100;
//
//				            btn.setLayoutParams(params);
//					// TODO Auto-generated method stub
					
				}
			});
	        
	    	popup.startAnimation(moveLefttoRight);
	    	
	    	
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if(key==0){
					key=1;
					
					    moveLefttoRight = new TranslateAnimation(-160, 100,0 , 0);
				        moveLefttoRight.setDuration(1000);
				        moveLefttoRight.setFillAfter(true);

					popup.startAnimation(moveLefttoRight);
					 
				}
				else if(key==1){
					key=0;
					
					  moveLefttoRight = new TranslateAnimation(100, -160, 0, 0);
				        moveLefttoRight.setDuration(1000);
				        moveLefttoRight.setFillAfter(true);
				        
				    	popup.startAnimation(moveLefttoRight);
					 
				}
			}
		});

        
       
    }

    
}
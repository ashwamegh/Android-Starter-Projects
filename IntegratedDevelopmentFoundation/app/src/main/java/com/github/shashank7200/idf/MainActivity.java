package com.github.shashank7200.idf;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
        private ViewFlipper mViewFlipper;
        private GestureDetector mGestureDetector;
        private TextView mLink;

        int[] resources = {
                R.drawable.image,
                R.drawable.image0,
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            CustomGestureDetector customGestureDetector = new CustomGestureDetector();
            mGestureDetector = new GestureDetector(this, customGestureDetector);

            // Get the ViewFlipper
            mViewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

            mViewFlipper.setAutoStart(true);
            mViewFlipper.setFlipInterval(2000); // flip every 2 seconds

            // Add all the images to the ViewFlipper
            for (int i = 0; i < resources.length; i++) {
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(resources[i]);
                mViewFlipper.addView(imageView);
            }

            mLink = (TextView) findViewById(R.id.visit_link);

            if (mLink != null) {
                mLink.setMovementMethod(LinkMovementMethod.getInstance());


            }




        }

        class CustomGestureDetector extends GestureDetector.SimpleOnGestureListener {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

                // Swipe left (next)
                if (e1.getX() > e2.getX()) {
                    mViewFlipper.showNext();
                }

                // Swipe right (previous)
                if (e1.getX() < e2.getX()) {
                    mViewFlipper.showPrevious();
                }

                return super.onFling(e1, e2, velocityX, velocityY);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            mGestureDetector.onTouchEvent(event);

            return super.onTouchEvent(event);
        }
}

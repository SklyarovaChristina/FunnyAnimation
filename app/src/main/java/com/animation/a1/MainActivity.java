package com.animation.a1;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button myView;
    ImageView ivCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        myView = (Button)findViewById(R.id.button);
        ivCat = (ImageView)findViewById(R.id.imageView);

        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cx = (ivCat.getLeft() + ivCat.getRight()) / 2;
                int cy = (ivCat.getTop() + ivCat.getBottom()) / 2;

                int finalRadius = Math.max(ivCat.getWidth(), ivCat.getHeight());

                Animator anim =
                        ViewAnimationUtils.createCircularReveal(ivCat, cx, cy, 0, finalRadius);

                ivCat.setVisibility(View.VISIBLE);
                anim.start();
            }
        });

    }


}
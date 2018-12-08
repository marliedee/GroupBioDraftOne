package org.pursuit.groupproject;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        Drawable shape = res.getDrawable(R.drawable.shapes);
        ConstraintLayout cl =  findViewById(R.id.main);
        cl.setBackground(shape);

        Drawable textshape = res.getDrawable(R.drawable.textshapes);
        TextView tv = findViewById(R.id.textView);
        tv.setBackground(textshape);

        ImageButton button = findViewById(R.id.button3);
        TransitionDrawable drawable = (TransitionDrawable) button.getDrawable();
        drawable.startTransition(3500);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Biography.class);
                startActivity(intent);


            }

        });
    }



}


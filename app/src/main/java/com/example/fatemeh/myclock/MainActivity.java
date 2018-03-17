package com.example.fatemeh.myclock;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface txtfont= Typeface.createFromAsset(getAssets(),"fonts/digital7.ttf");
        TextView tex1= (TextView)findViewById(R.id.txt1);
        tex1.setTypeface(txtfont);

        TextView tex2= (TextView)findViewById(R.id.txt2);
        tex2.setTypeface(txtfont);

        TextView tex3= (TextView)findViewById(R.id.txt3);
        tex3.setTypeface(txtfont);

        TextView tex4= (TextView)findViewById(R.id.txt4);
        tex4.setTypeface(txtfont);

        TextView tex5= (TextView)findViewById(R.id.txt5);
        tex5.setTypeface(txtfont);


    }
}

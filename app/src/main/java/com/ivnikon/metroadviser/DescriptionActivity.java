package com.ivnikon.metroadviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ivnikon on 02.03.2016.
 */
public class DescriptionActivity extends AppCompatActivity {

    public static final String EXTRA_POSITION="com.ivnikon.metroadviser";
    int position;
    TextView description;
    String DescriptionString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decription);
        position=getIntent().getIntExtra(EXTRA_POSITION,0);
        DescriptionString=Integer.toString(position);
        description=(TextView)findViewById(R.id.DescriptionTextView);
        description.setText(DescriptionString);


    }
}

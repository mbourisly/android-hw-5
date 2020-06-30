package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         TextView a = (findViewById(R.id.textviewname));
        TextView g = (findViewById(R.id.textviewage));
        TextView c = (findViewById(R.id.textviewphone));
        TextView d = (findViewById(R.id.textviewjob));
        TextView e = (findViewById(R.id.textviewemail));

        Bundle b = getIntent().getExtras();
         a.setText(b.getString("1"));
         g.setText(b.getString("2"));
         c.setText( b.getString("3"));
         d.setText( b.getString("4"));
         e.setText(b.getString("5"));





    }
}
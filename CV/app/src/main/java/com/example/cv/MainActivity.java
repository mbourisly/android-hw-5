package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Name = findViewById(R.id.name);
        final EditText Age = findViewById(R.id.age);
        final EditText Phone = findViewById(R.id.Phone);
        final EditText Job = findViewById(R.id.job);
        final EditText Email = findViewById(R.id.mail);

        Button submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //name=fawzia  age=15  phone=12345678 job=app developer  email=fawzia@gmail
             if (Name.getText().toString().equals("fawzia")&&(Age.getText().toString().equals("15")&&(Phone.getText().toString().equals("12345678")&&(Job.getText().toString().equals("app developer")&&(Email.getText().toString().equals("fawzia@gmail")))))){

                 Intent x = new Intent(MainActivity.this,MainActivity2.class);
                 x.putExtra("1",Name.getText().toString());
                 x.putExtra("2",Age.getText().toString());
                 x.putExtra("3",Phone.getText().toString());
                 x.putExtra("4",Job.getText().toString());
                 x.putExtra("5",Email.getText().toString());

                 startActivity(x);
             }
             else  {
                 Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
             }






            }
        });


    }
}
package com.example.alana.exercise11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        final Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Integer age = intent.getIntExtra("age",20);
        Toast.makeText(this,name+age,Toast.LENGTH_LONG).show();

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = getIntent();
                String name = intent1.getStringExtra("name");
                Integer age = intent1.getIntExtra("age",20);
                intent1.putExtra("result","姓名"+name+"年龄"+age);
                setResult(0,intent1);
                Intent intent2 = new Intent(AnotherActivity.this,MainActivity.class);
                finish();
            }
        });
    }
}

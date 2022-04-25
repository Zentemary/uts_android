package com.willyam.utsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button daftar;
    private String key_name = "username";
    private String key_pass = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.edt_name);
        password = (EditText) findViewById(R.id.edt_pass);
        daftar = (Button) findViewById(R.id.btn_daftar);

        daftar.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                String str_name = username.getText().toString();
                String str_pass = password.getText().toString();
                if(str_name != null){
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    i.putExtra(key_name, str_name);
                    i.putExtra(key_pass, str_pass);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplication(), "Mohon diisi yang lengkap", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

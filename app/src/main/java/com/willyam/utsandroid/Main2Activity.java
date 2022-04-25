package com.willyam.utsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText username_login, pass_login;
    TextView username_reg, pass_reg;
    Button login;
    private String username_reg2, password_reg2;
    private String key_name = "username";
    private String key_pass = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username_login = findViewById(R.id.edt_name_login);
        pass_login = findViewById(R.id.edt_pass_login);
        username_reg = findViewById(R.id.txt_nama_regis);
        pass_reg = findViewById(R.id.txt_pass_regis);
        login = findViewById(R.id.btn_login);

        Bundle extras = getIntent().getExtras();
        username_reg2 = extras.getString(key_name);
        password_reg2 = extras.getString(key_pass);

        username_reg.setText(username_reg2);
        pass_reg.setText(password_reg2);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String username_login_key = username_login.getText().toString();
                String pass_login_key = pass_login.getText().toString();

                if(username_login_key.equals(username_reg.toString()) && pass_login_key.equals(pass_reg.toString())){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    finish();
                }
            }
        });

    }
}

package com.it18155358.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText et_name1,et_email1,et_telephone1,et_password1,et_password2;
    private String name,email,telephone,password;
    Button register,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_name1 =(EditText) findViewById(R.id.name1);
        et_email1 =(EditText) findViewById(R.id.email1);
        et_telephone1 =(EditText) findViewById(R.id.telephone1);
        et_password1 =(EditText) findViewById(R.id.password1);
        et_password2 =(EditText) findViewById(R.id.password2);

        register = (Button) findViewById(R.id.br1);
        cancel =(Button) findViewById(R.id.bc1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }
    public void register(){
        intialize();
        if(!validate()){
            Toast.makeText(this,"signup has failed",Toast.LENGTH_SHORT).show();

        }
        else{
            onSignupSuccess();
        }
    }
    public void onSignupSuccess(){
        //
    }
    public boolean validate(){
        boolean valid = true;
        if(name.isEmpty()||name.length()>32){

            et_email1.setError("Please Enter valid Email Address");
            valid =false;
        }
        return valid;
    }
    public void intialize(){

        name = et_name1.getText().toString().trim();
        email = et_email1.getText().toString().trim();
        telephone = et_telephone1.getText().toString().trim();
        password = et_password1.getText().toString().trim();
        password = et_password2.getText().toString().trim();

    }
}

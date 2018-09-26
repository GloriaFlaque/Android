package com.utad.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
   private EditText mEmail;
   private  EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mEmail = findViewById(R.id.editText);
        mPassword = findViewById(R.id.editText2);

        mEmail.setText("gloria.flaque@live.u-tad.com");

        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();
    }

    public void LoginactionA(View view) {
        Toast.makeText(this, "On login pressed!", Toast.LENGTH_SHORT).show();
    }
}

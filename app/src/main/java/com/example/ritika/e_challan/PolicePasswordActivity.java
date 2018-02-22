package com.example.ritika.e_challan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PolicePasswordActivity extends AppCompatActivity {

    private Button mSignInButtonView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_password);

        mPasswordView = (EditText) findViewById(R.id.editTextPolicePassword);
        mSignInButtonView = (Button) findViewById(R.id.buttonSignIn);

        mSignInButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PolicePasswordActivity.this,PolicePortalActivity.class);
                startActivity(intent);
            }
        });
    }
}

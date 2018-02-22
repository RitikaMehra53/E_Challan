package com.example.ritika.e_challan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText mEmailView;
    private EditText mPhoneNoView;
    private Button mSubmitButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);*/
        mEmailView = (EditText) findViewById(R.id.editTextHomePageEmail);
        mPhoneNoView = (EditText) findViewById(R.id.editTextHomePagePhoneNo);
        mSubmitButtonView = (Button) findViewById(R.id.buttonHomePageSubmit);

        mSubmitButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,PolicePasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}

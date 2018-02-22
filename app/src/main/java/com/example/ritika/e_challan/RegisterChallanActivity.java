package com.example.ritika.e_challan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterChallanActivity extends AppCompatActivity {

    private Button mRegisterChallanSubmitView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_challan);

        mRegisterChallanSubmitView = (Button) findViewById(R.id.buttonRegisterChallanSubmitChallan);

        mRegisterChallanSubmitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegisterChallanActivity.this,"Challan Successfully Registered",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

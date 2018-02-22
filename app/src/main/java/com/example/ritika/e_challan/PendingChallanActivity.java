package com.example.ritika.e_challan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PendingChallanActivity extends AppCompatActivity {


    private EditText mPendingRCNumberView;
    private EditText mPendingVehicleNumberView;
    private Button mPendingSubmitView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_challan);

        mPendingRCNumberView = (EditText) findViewById(R.id.editTextPendingChallanRCNo);
        mPendingVehicleNumberView = (EditText) findViewById(R.id.editTextPendingChallanVehicleNo);
        mPendingSubmitView = (Button) findViewById(R.id.buttonPendingChallanSubmit);

        mPendingSubmitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PendingChallanActivity.this,"Search Pending Challan",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

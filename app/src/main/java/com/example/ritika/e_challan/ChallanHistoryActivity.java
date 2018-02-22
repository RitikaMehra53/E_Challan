package com.example.ritika.e_challan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChallanHistoryActivity extends AppCompatActivity {

    private EditText mHistoryRCNumberView;
    private EditText mHistoryVehicleNumberView;
    private Button mHistorySubmitView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challan_history);

        mHistoryRCNumberView = (EditText) findViewById(R.id.editTextChallanHistoryRCNo);
        mHistoryVehicleNumberView = (EditText) findViewById(R.id.editTextChallanHistoryVehicleNo);
        mHistorySubmitView = (Button) findViewById(R.id.buttonChallanHistorySubmit);

        mHistorySubmitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChallanHistoryActivity.this,"Search Challan History",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

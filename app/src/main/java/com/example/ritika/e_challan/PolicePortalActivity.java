package com.example.ritika.e_challan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PolicePortalActivity extends AppCompatActivity {

    private TextView mRegisterChallanView;
    private TextView mPendingChallanView;
    private TextView mChallanHistoryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_portal);
        mRegisterChallanView= (TextView) findViewById(R.id.textViewPolicePortalRegisterChallan) ;
        mPendingChallanView= (TextView) findViewById(R.id.textViewPolicePortalPendingChallan) ;
        mChallanHistoryView= (TextView) findViewById(R.id.textViewPolicePortalChallanHistory) ;


        mRegisterChallanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PolicePortalActivity.this,RegisterChallanActivity.class);
                startActivity(intent);
            }
        });

        mPendingChallanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PolicePortalActivity.this,PendingChallanActivity.class);
                startActivity(intent);
            }
        });

        mChallanHistoryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PolicePortalActivity.this,ChallanHistoryActivity.class);
                startActivity(intent);
            }
        });
    }


}

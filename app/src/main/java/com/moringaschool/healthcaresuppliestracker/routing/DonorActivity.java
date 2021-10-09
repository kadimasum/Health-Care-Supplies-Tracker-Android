package com.moringaschool.healthcaresuppliestracker.routing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.moringaschool.healthcaresuppliestracker.R;
import com.moringaschool.healthcaresuppliestracker.fragments.AllRequestsFragment;
import com.moringaschool.healthcaresuppliestracker.fragments.DispatchesFragment;
import com.moringaschool.healthcaresuppliestracker.fragments.InStockFragment;

public class DonorActivity extends AppCompatActivity {
    TextView _requests, _dispatches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor);

        _requests = (TextView) findViewById(R.id.all_requests_header);
        _dispatches = (TextView) findViewById(R.id.dispatches_header);


        _requests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allRequests();
            }
        });

        _dispatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispatches();
            }
        });

    }


    private void allRequests() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AllRequestsFragment allRequestsFragment = new AllRequestsFragment();
        fragmentTransaction.add(R.id.fragment_container_donor_pages, allRequestsFragment);
        fragmentTransaction.commit();
    }

    private void dispatches() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DispatchesFragment dispatchesFragment = new DispatchesFragment();
        fragmentTransaction.add(R.id.fragment_container_donor_pages, dispatchesFragment);
        fragmentTransaction.commit();
    }
}
package com.mostafa.navigationcomponent.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.mostafa.navigationcomponent.R;


public class MainFragment extends Fragment {
    View view;
    private Button viewTransaction,SendMoney,ViewBalance;


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_main, container, false);
        viewTransaction = view.findViewById(R.id.view_transaction);

        viewTransaction.setOnClickListener(view -> {
        Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_transactionFragment);
            Toast.makeText(this.getContext(), "ok", Toast.LENGTH_SHORT).show();
            Log.e("abc","ok-------------");
        });

        SendMoney = view.findViewById(R.id.send_money);
        SendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_recipientFragment);
            }
        });

        ViewBalance = view.findViewById(R.id.view_balance);
        ViewBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_viewBalanceFragment);
            }
        });

        return view;
    }
}
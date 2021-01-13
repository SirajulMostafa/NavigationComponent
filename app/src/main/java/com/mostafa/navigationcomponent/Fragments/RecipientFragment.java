package com.mostafa.navigationcomponent.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mostafa.navigationcomponent.R;


public class RecipientFragment extends Fragment {

    private TextView editText;
    private View view;
    private Button Next,Cancel;

    public RecipientFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_recipient, container, false);

        editText = view.findViewById(R.id.editText);

        Next  = view.findViewById(R.id.send);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //s1 Navigation.findNavController(view).navigate(R.id.action_recipientFragment_to_specifyAmountFragment);
               NavDirections directions = RecipientFragmentDirections.actionRecipientFragmentToSpecifyAmountFragment(editText.getText().toString());
               Navigation.findNavController(view).navigate(directions);//s1 replace for argument passing
//
            }
        });

        Cancel = view.findViewById(R.id.cancel);
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigateUp();
            }
        });


        return view;
    }
    //for back button navigation
//    @Override
//    public boolean onSupportNavigateUp() {
//        return  navController.navigateUp();
//    }
}

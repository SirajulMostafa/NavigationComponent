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
import android.widget.TextView;

import com.mostafa.navigationcomponent.R;

import static com.mostafa.navigationcomponent.Fragments.RecipientFragmentDirections.actionRecipientFragmentToSpecifyAmountFragment;


public class SpecifyAmountFragment extends Fragment {
    private TextView editText;
    private View view;
    private Button Next,Cancel;
    public SpecifyAmountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     view= inflater.inflate(R.layout.fragment_specify_amount, container, false);

        Log.i("dshcjhd", "onCreateView: "+SpecifyAmountFragmentArgs.fromBundle(getArguments()).getName());

        editText = view.findViewById(R.id.editText);

        Next  = view.findViewById(R.id.send);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //s1 Navigation.findNavController(view).navigate(R.id.action_recipientFragment_to_specifyAmountFragment);
                NavDirections directions = SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(
                        SpecifyAmountFragmentArgs.fromBundle(getArguments()).getName(),
                        Integer.parseInt(editText.getText().toString())
                );

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
}

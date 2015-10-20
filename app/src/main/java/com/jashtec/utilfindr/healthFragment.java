package com.jashtec.utilfindr;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import Common.Initializer;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * Use the {@link healthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class healthFragment extends Fragment {

//    private OnFragmentInteractionListener mListener;

    public healthFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     */
    // TODO: Rename and change types and number of parameters
    public static healthFragment newInstance() {
        Bundle args = new Bundle();
        healthFragment fragment = new healthFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_health, container, false);
        ListView listHealth = (ListView) view.findViewById(R.id.listHealth);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, Initializer.getHealthData());
        listHealth.setAdapter(adapter);
        return view;
    }

}

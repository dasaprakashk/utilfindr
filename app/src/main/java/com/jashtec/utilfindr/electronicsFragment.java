package com.jashtec.utilfindr;


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
 * Use the {@link electronicsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class electronicsFragment extends Fragment {


    public electronicsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment electronicsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static electronicsFragment newInstance() {
        electronicsFragment fragment = new electronicsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_electronics, container, false);
        ListView listElectronics = (ListView) view.findViewById(R.id.listElectronics);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, Initializer.getElectronicsData());
        listElectronics.setAdapter(adapter);
        return view;
    }


}

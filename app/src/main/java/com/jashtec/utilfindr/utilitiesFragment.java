package com.jashtec.utilfindr;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import Common.Initializer;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link utilitiesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class utilitiesFragment extends Fragment {

    public utilitiesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment utilitiesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static utilitiesFragment newInstance() {
        utilitiesFragment fragment = new utilitiesFragment();
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
        final View view = inflater.inflate(R.layout.fragment_utilities, container, false);
        final ListView listUtilities = (ListView) view.findViewById(R.id.listUtilities);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, Initializer.getUtilitiesData());
        listUtilities.setAdapter(adapter);

        //Item click
        listUtilities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)listUtilities.getItemAtPosition(position);
                Toast.makeText(getActivity(), "Clicked : " + item, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }


}

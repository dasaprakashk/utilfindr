package com.jashtec.utilfindr;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import Common.Adapter.CustomListAdapter;
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
        final ListView listHealth = (ListView) view.findViewById(R.id.listHealth);
        CustomListAdapter adapter = new CustomListAdapter(getActivity(), Initializer.getHealthData(), Initializer.getHealthIcons());
        listHealth.setAdapter(adapter);

        //Item Click
        listHealth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String)listHealth.getItemAtPosition(position);
                Toast.makeText(getActivity(), "Clicked: " + itemValue, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}

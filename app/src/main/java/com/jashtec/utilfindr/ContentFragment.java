package com.jashtec.utilfindr;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import Common.Adapter.CustomListAdapter;
import Common.Initializer;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_CONTENTTYPE = "contentType";

    // TODO: Rename and change types of parameters
    private int contentType;

    public ContentFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ContentFragment newInstance(int contentType) {
        ContentFragment fragment = new ContentFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_CONTENTTYPE, contentType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            contentType = getArguments().getInt(ARG_CONTENTTYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_content, container, false);
        ListView list = (ListView)view.findViewById(R.id.listContent);
        CustomListAdapter adapter;
        Initializer.ContentType type = Initializer.ContentType.values()[contentType];
        if(type == Initializer.ContentType.HEALTH)
            adapter = new CustomListAdapter(getActivity(), Initializer.getHealthData(), Initializer.getHealthIcons());
        else if(type == Initializer.ContentType.FOOD)
            adapter = new CustomListAdapter(getActivity(), Initializer.getFoodData(), Initializer.getFoodIcons());
        else if(type == Initializer.ContentType.ELECTRONICS)
            adapter = new CustomListAdapter(getActivity(), Initializer.getElectronicsData(), Initializer.getElectronicsIcon());
        else
            adapter = new CustomListAdapter(getActivity(), Initializer.getUtilitiesData(), Initializer.getUtilitiesIcon());

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView rowtext = (TextView)view.findViewById(R.id.rowtext);
                Toast.makeText(getActivity(), rowtext.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}

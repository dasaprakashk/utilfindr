package Common.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jashtec.utilfindr.R;

/**
 * Created by Das on 21/10/15.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemName;
    private final Integer[] iconName;

    public CustomListAdapter(Activity context, String[] itemName, Integer[] iconName) {
        super(context, R.layout.listrow, itemName);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemName=itemName;
        this.iconName=iconName;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listrow, null, true);

        TextView txtIcon = (TextView) rowView.findViewById(R.id.rowicon);
        TextView txtItem = (TextView) rowView.findViewById(R.id.rowtext);

        txtIcon.setText(iconName[position]);
        txtItem.setText(itemName[position]);
        return rowView;

    }
}


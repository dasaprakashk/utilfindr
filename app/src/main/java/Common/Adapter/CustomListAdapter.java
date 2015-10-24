package Common.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jashtec.utilfindr.R;

import java.util.ArrayList;

import BusinessObjects.Catalog;

/**
 * Created by Das on 21/10/15.
 */
public class CustomListAdapter extends ArrayAdapter<Catalog> {
    private final Activity context;
    private final ArrayList<Catalog> catalogCollection;

    public CustomListAdapter(Activity context, ArrayList<Catalog> catalogCollection) {
        super(context, R.layout.listrow, catalogCollection);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.catalogCollection=catalogCollection;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listrow, null, true);

        TextView txtIcon = (TextView) rowView.findViewById(R.id.rowicon);
        TextView txtItem = (TextView) rowView.findViewById(R.id.rowtext);
        Catalog objCatalog = catalogCollection.get(position);
        txtIcon.setText(objCatalog.getIcon());
        txtItem.setText(objCatalog.getText());
        txtItem.setTag(objCatalog.getId());
        return rowView;

    }
}


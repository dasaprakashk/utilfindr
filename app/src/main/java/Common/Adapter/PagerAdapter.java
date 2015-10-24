package Common.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;
import android.util.Log;
import com.jashtec.utilfindr.ContentFragment;
import java.util.List;

import Common.Initializer;

/**
 * Created by Das on 18/10/15.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    FragmentManager manager;
    private Context context;
    private String[] tabTitles = new String[]{
            "Health", "Food", "Electronics", "Utilities"
    };

    public PagerAdapter(FragmentManager manager, Context context) {
        super(manager);
        this.manager = manager;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("PAGERADAPTER", String.valueOf(position));
        return ContentFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return this.tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
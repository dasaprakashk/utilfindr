package Common.Adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Das on 18/10/15.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments;
    FragmentManager manager;

    public PagerAdapter(FragmentManager manager, List<Fragment> fragments) {
        super(manager);
        this.fragments = fragments;
        this.manager = manager;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}

package com.example.internproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    private String tabTitles[] = new String[]{"return", "receive"};
    public PagerAdapter(FragmentManager fm, int NoOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NoOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                returnam tab1 = new returnam();
                return tab1;
            case 1:
                receiveam tab2 = new receiveam();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabTitles[position];
    }
}

package com.example.viewpager_class_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) {
            return new HomeFragment();
        }
        else if (position == 1) {
            return new ProfileFragment();
        }
        else if (position == 2) {
            return new HelpFragment();
        }
        else {
            return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

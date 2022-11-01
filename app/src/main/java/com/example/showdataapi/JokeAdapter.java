package com.example.showdataapi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class JokeAdapter extends FragmentStateAdapter {
    public JokeAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            AboutUsFragment aboutUs = new AboutUsFragment();
            return aboutUs;
        }else{
            ListJokeFragment listData = new ListJokeFragment();
            return listData;
        }
    }

    @Override
//    menentukan jumlah tab yg ditampilkan
    public int getItemCount() {
        return 2;
    }
}

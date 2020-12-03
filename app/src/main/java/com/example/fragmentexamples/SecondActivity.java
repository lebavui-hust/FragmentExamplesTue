package com.example.fragmentexamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity implements BlueFragment.OnUpdateSelectedItem {

    BlueFragment blueFragment;
    RedFragment redFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        if (fragment.getClass() == BlueFragment.class) {
            blueFragment = (BlueFragment) fragment;
        } else if (fragment.getClass() == RedFragment.class) {
            redFragment = (RedFragment) fragment;
        }
    }

    @Override
    public void updateSelectedItem(String item) {
        redFragment.updateContent(item);
    }
}
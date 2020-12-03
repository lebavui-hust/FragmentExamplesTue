package com.example.fragmentexamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlueFragment.OnUpdateSelectedItem {

    BlueFragment blueFragment;
    RedFragment redFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueFragment = BlueFragment.newInstance("BLUE", "");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_blue, blueFragment);
        ft.commit();

        redFragment = RedFragment.newInstance("RED", "");
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_red, redFragment);
        ft.commit();
    }


    @Override
    public void updateSelectedItem(String item) {
        redFragment.updateContent(item);
    }
}
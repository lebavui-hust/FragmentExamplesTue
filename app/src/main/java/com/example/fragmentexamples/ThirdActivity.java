package com.example.fragmentexamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedFragment redFragment = RedFragment.newInstance(String.valueOf(index++), "");
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.add(R.id.fragment_layout, redFragment);
                ft.addToBackStack("red");
                ft.commit();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_replace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedFragment redFragment = RedFragment.newInstance(String.valueOf(index++), "");
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_layout, redFragment);
                ft.addToBackStack("red");
                ft.commit();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_add_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GreenFragment greenFragment = GreenFragment.newInstance("", "");
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.add(R.id.fragment_layout, greenFragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_replace_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GreenFragment greenFragment = GreenFragment.newInstance("", "");
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_layout, greenFragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_remove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_layout);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.remove(fragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_layout);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.show(fragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_hide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_layout);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.hide(fragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_attach).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_layout);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.attach(fragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });

        findViewById(R.id.btn_detach).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_layout);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.detach(fragment);
                ft.commitNow();

                Log.v("TAG", "Number of fragments:" + getSupportFragmentManager().getFragments().size());
            }
        });
    }
}
package com.openclassrooms.myamazingviewpager.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.myamazingviewpager.R;


public class NewsPageFragment extends Fragment {


    public static NewsPageFragment newInstance() {
        return (new NewsPageFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news_page, container, false);
    }
}
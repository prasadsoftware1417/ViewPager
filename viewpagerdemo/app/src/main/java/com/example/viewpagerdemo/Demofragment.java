package com.example.viewpagerdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Demofragment extends Fragment {
    TextView textView;
    ImageView imageView;
    private int[] images ={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
            R.drawable.img11};

    String[] name = {"ravi","pratik","sunny","shivani","abhishek","abhi","shubham","chetan","tushar","sami","Shweta"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_demofragment, container, false);
        textView=view.findViewById(R.id.t1);
        imageView=view.findViewById(R.id.i1);
        int i=getArguments().getInt("id");
        textView.setText(name[i]);
        imageView.setImageResource(images[i]);
        return  view;
    }

   }

package com.example.e_cinema.fragements;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.e_cinema.R;
import com.example.e_cinema.activities.Detail;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        View imageView8 = view.findViewById(R.id.imageView8);

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Detail.class);
                i.putExtra("title","The Fate of the Furious (2017)");
                i.putExtra("desc","Luke Hobbs (Dwayne Johnson) membentuk aliansi yang tidak mungkin " +
                        "dengan Deckard Shaw (Jason Statham). Keduanya terpaksa bersatu membantu Hattie Shaw " +
                        "(Vanessa Kirby) untuk memburu Brixton (Idris Elba). Brixton adalah penjahat jenis baru " +
                        "yang berhasil mengubah dirinya menjadi " +
                        "manusia super. Keberadaanya menjadi ancaman bagi umat manusia.");
                i.putExtra("rate","6.7 | 137 Min | Blue-Ray | Western");
                startActivity(i);
            }
        });


        return view;
    }

}

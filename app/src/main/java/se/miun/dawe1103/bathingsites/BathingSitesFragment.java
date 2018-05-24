package se.miun.dawe1103.bathingsites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BathingSitesFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {
        Log.d("DEBUG", "onCreateView of BathingSitesFragment");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bathing_sites, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
    }



}

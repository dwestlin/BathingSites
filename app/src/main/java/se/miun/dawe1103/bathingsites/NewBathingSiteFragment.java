package se.miun.dawe1103.bathingsites;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;


public class NewBathingSiteFragment extends Fragment {
    private EditText bathing_name_input, bathing_desc_input,
                     bathing_address_input, bathing_latitude_input,
                     bathing_longitude_input, temp_water_edittext,
                     date_water_edittext;

    private RatingBar grade_rate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_new_bathing_site, container, false);

        bathing_name_input = v.findViewById(R.id.bathing_name_input);
        bathing_desc_input = v.findViewById(R.id.bathing_desc_input);
        bathing_address_input= v.findViewById(R.id.bathing_address_input);
        bathing_latitude_input= v.findViewById(R.id.bathing_latitude_input);
        bathing_longitude_input= v.findViewById(R.id.bathing_longitude_input);
        temp_water_edittext= v.findViewById(R.id.temp_water_edittext);
        date_water_edittext= v.findViewById(R.id.date_water_edittext);

        grade_rate = v.findViewById(R.id.grade_rate);


        return v;
    }


    public void clearInput(){
        bathing_name_input.setText("");
        bathing_desc_input.setText("");
        bathing_address_input.setText("");
        bathing_latitude_input.setText("");
        bathing_longitude_input.setText("");
        date_water_edittext.setText("");
        temp_water_edittext.setText("");
        grade_rate.setRating(0F);
    }
}

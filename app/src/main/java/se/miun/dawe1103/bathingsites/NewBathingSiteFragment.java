package se.miun.dawe1103.bathingsites;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;


public class NewBathingSiteFragment extends Fragment {

    // Defining EditText variables.
    private EditText bathingName, bathingDesc,
                     bathingAddress, bathingLatitude,
                     bathingLongitude, tempWater,
                     dateWater;

    private RatingBar grade_rate;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_new_bathing_site, container, false);

        attachVariables(v);

        return v;
    }

    public void attachVariables(View v){
        bathingName = v.findViewById(R.id.bathing_name_input);
        bathingDesc = v.findViewById(R.id.bathing_desc_input);
        bathingAddress= v.findViewById(R.id.bathing_address_input);
        bathingLatitude= v.findViewById(R.id.bathing_latitude_input);
        bathingLongitude= v.findViewById(R.id.bathing_longitude_input);
        tempWater= v.findViewById(R.id.temp_water_edittext);
        dateWater= v.findViewById(R.id.date_water_edittext);
        grade_rate = v.findViewById(R.id.grade_rate);
    }


    public void clearInput(){
        bathingName.setText("");
        bathingName.setError(null);
        bathingDesc.setText("");
        bathingAddress.setText("");
        bathingAddress.setError(null);
        bathingLatitude.setText("");
        bathingLatitude.setError(null);
        bathingLongitude.setText("");
        bathingLongitude.setError(null);
        dateWater.setText("");
        tempWater.setText("");
        grade_rate.setRating(0F);
    }


    public void saveBathingSite(){
        if(!isEmpty(bathingName) && ((!isEmpty(bathingAddress) || (!isEmpty(bathingLatitude) && !isEmpty(bathingLongitude))))){

            // Erasing errors.
            bathingName.setError(null);
            bathingAddress.setError(null);
            bathingLongitude.setError(null);
            bathingLatitude.setError(null);

            // Creating the snack bar.
            createSnackBarMessage();

        }else{

            // If the name field is empty, an error-message will show up.
            if(isEmpty(bathingName)){
                bathingName.setError("Name is required");
            }


            // If the address-field is empty...
            if(isEmpty(bathingAddress)){

                // We also need to check if latitude and longitude is empty.
                if(isEmpty(bathingLatitude) && isEmpty(bathingLongitude)){
                    bathingAddress.setError("Address is required");

                    // And if its empty, error messages on latitude and longitude needs to be set.
                    bathingLatitude.setError("Both latitude and longitude need to be entered");
                    bathingLongitude.setError("Both latitude and longitude need to be entered");
                } // If one of lat/long is set, we need to tell the user that the other needs to be set as well.
                else if(isEmpty(bathingLatitude) && !isEmpty(bathingLongitude)){
                    bathingLatitude.setError("Latitude need to be entered");
                }
                else if(isEmpty(bathingLongitude) && !isEmpty(bathingLatitude)){
                    bathingLongitude.setError("Longitude need to be entered");
                }
            }
        }
    }



    // Function that gathers the information into a string and then calls function that's creates the snack bar.
    private void createSnackBarMessage() {

        String s =  "Name: "+bathingName.getText().toString()+"\n"+
                    "Description: "+bathingDesc.getText().toString()+"\n"+
                    "Address: "+bathingAddress.getText().toString()+"\n"+
                    "Longitude: "+bathingLongitude.getText().toString()+"\n"+
                    "Latitude: "+bathingLatitude.getText().toString()+"\n"+
                    "Grade: "+grade_rate.getRating()+"\n"+
                    "Water temp: "+tempWater.getText().toString()+"\n"+
                    "Date for temp: "+dateWater.getText().toString();

        createSnackbar(s);
    }



    private void createSnackbar(String s){
        View v = getActivity().findViewById(android.R.id.content);

        final Snackbar snackbar = Snackbar.make(v, s, Snackbar.LENGTH_INDEFINITE);
        View snackbarView = snackbar.getView();

        TextView textView = snackbarView.findViewById(android.support.design.R.id.snackbar_text);

        textView.setMaxLines(30);
        snackbar.setAction("Dismiss", new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();


    }

    // Function that checks if the editText-field is empty or not.
    private boolean isEmpty(EditText editText) {
        if (editText.getText().toString().trim().length() > 0){
            return false;
        }
        return true;
    }

}

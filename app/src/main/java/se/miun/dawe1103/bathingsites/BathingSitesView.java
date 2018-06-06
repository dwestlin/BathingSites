package se.miun.dawe1103.bathingsites;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressWarnings("ConstantConditions")
public class BathingSitesView extends LinearLayout {

    //Defining variables, ImageView and TextView.
    private int bathingSites = 0;
    private ImageView imageView;
    private TextView textView;

    public BathingSitesView(Context context) {
        super(context);
        inflateView(context);
    }

    public BathingSitesView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflateView(context);
    }

    public BathingSitesView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateView(context);
    }

    private void inflateView(Context context){

        // Inflate XML-file
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.bathingsiteview, this, true);

        // Defining the variables.
        imageView = findViewById(R.id.bathingSiteIcon);
        textView = findViewById(R.id.bathingSiteTextView);


        // Sets the number of bathing sites. For future tasks, the database can be called and then check the number of rows returned and then fill it in setBathingSites(rows).
        setBathingSites(0);
    }




    /**
     * @param count the number of Bathing sites.
     */
    public void setBathingSites(int count){
        this.bathingSites = count;

        // When the number of bathing places has been set, it should call this feature, to put it as text in TextView contained in the class.
        updateTextView();
    }


    // Function that just updates the text view.
    public void updateTextView(){
        int bathingSitesCount = getBathingSites();
        String input = bathingSitesCount + " "+getResources().getString(R.string.bathing_site);

        textView.setText(input);
    }

    /**
     * @return int bathingSites
     */
    public int getBathingSites(){
        return bathingSites;
    }

}


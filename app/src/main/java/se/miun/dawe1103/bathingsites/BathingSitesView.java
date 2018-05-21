package se.miun.dawe1103.bathingsites;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BathingSitesView extends LinearLayout {

    private int bathingSites;
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.bathingsiteview, this, true);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
    }


    /**
     * @param count
     */
    public void setBathingSites(int count){
        this.bathingSites = count;

        textView.setText(this.getBathingSites());
    }

    /**
     * @return int bathingSites
     */
    public int getBathingSites(){
        return bathingSites;
    }

}


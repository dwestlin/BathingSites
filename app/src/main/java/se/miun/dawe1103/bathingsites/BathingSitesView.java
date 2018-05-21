package se.miun.dawe1103.bathingsites;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class BathingSitesView extends LinearLayout {

    private int bathingSites;

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
    }


    /**
     * @param count
     */
    public void setBathingSites(int count){
        this.bathingSites = count;
    }

    /**
     * @return int bathingSites
     */
    public int getBathingSites(){
        return bathingSites;
    }

}


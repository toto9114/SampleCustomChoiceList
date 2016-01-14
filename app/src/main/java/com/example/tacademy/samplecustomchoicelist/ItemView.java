package com.example.tacademy.samplecustomchoicelist;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class ItemView extends FrameLayout implements Checkable{
    public ItemView(Context context) {
        super(context);
        init();
    }

    TextView titleView;
    ImageView checkView, selectorView;
    public void init(){
        inflate(getContext(),R.layout.view_item,this);
        titleView = (TextView)findViewById(R.id.text_title);
        checkView = (ImageView)findViewById(R.id.image_check);
        selectorView = (ImageView)findViewById(R.id.image_selector);

    }
    public void setText(String text){titleView.setText(text);}

    boolean isChecked;
    public void drawCheck()
    {
        if(isChecked){
            selectorView.setVisibility(VISIBLE);
        }
        else{
            selectorView.setVisibility(View.INVISIBLE);
        }
    }
    @Override
    public void setChecked(boolean checked) {
        if(isChecked != checked){
            isChecked = checked;
            drawCheck();
        }

    }

    @Override
    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public void toggle() {
        setChecked(!isChecked);
    }
}

package com.approcket.discretecrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yarolegovich.discretescrollview.DSVOrientation;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.transform.Pivot;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DiscreteScrollView discreteScrollView;
    private Adapter adapter;
    private List<Images> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        discreteScrollView=findViewById(R.id.picker);

        list.add(new Images(R.drawable.s,"Yaar"));
        list.add(new Images(R.drawable.s1,"jldi"));
        list.add(new Images(R.drawable.s2,"se"));
        list.add(new Images(R.drawable.s3,"smj"));
        list.add(new Images(R.drawable.s4,"lo"));
        list.add(new Images(R.drawable.bg,"iss"));
        list.add(new Images(R.drawable.disney_cinderalla,"app"));
        list.add(new Images(R.drawable.re2,"ko"));
        list.add(new Images(R.drawable.s,"thk"));
        list.add(new Images(R.drawable.s1,"rhega"));

        adapter=new Adapter(this,list);

        discreteScrollView.setAdapter(adapter);

        discreteScrollView.setOrientation(DSVOrientation.HORIZONTAL);
        discreteScrollView.setOffscreenItems(1000);
        discreteScrollView.setOverScrollEnabled(true);

        discreteScrollView.setItemTransformer(new ScaleTransformer.Builder()
                .setMaxScale(1.05f)
                .setMinScale(0.8f)
                .setPivotX(Pivot.X.CENTER) // CENTER is a default one
                .setPivotY(Pivot.Y.BOTTOM) // CENTER is a default one
                .build());


    }
}
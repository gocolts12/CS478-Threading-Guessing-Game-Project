package com.example.project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ThreadVsThread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_vs_thread);

        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        gridLayout.setColumnCount(10);
        gridLayout.setRowCount(10);

        for (int i = 0; i < 10; i++) {
            GridLayout.Spec rowSpec = GridLayout.spec(i, 1, 1);
            for (int j = 0; j < 10; j++) {
                GridLayout.Spec colSpec = GridLayout.spec(j, 1, 1);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                linearLayout.setId();
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                linearLayout.addView(imageView);
                GridLayout.LayoutParams myGLP = new GridLayout.LayoutParams();
                myGLP.rowSpec = rowSpec;
                myGLP.columnSpec = colSpec;
                gridLayout.addView(linearLayout, myGLP);
            }
        }
    }
}

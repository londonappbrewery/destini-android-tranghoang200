package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTStory;
    Button mTAnswer1;
    Button mTAnswer2;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTStory = findViewById(R.id.storyTextView);
        mTAnswer1 = findViewById(R.id.buttonTop);
        mTAnswer2 = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2) {
                    mTStory.setText(R.string.T3_Story);
                    mTAnswer1.setText(R.string.T3_Ans1);
                    mTAnswer2.setText((R.string.T3_Ans2));
                    mStoryIndex = 3;
                } else {
                    mTStory.setText(R.string.T6_End);
                    mTAnswer1.setVisibility(View.GONE);
                    mTAnswer2.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mTAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    mTStory.setText(R.string.T2_Story);
                    mTAnswer1.setText(R.string.T2_Ans1);
                    mTAnswer2.setText((R.string.T2_Ans2));
                    mStoryIndex = 2;
                } else if(mStoryIndex == 2) {
                    mTStory.setText(R.string.T4_End);
                    mTAnswer1.setVisibility(View.GONE);
                    mTAnswer2.setVisibility(View.GONE);
                } else {
                    mTStory.setText(R.string.T5_End);
                    mTAnswer1.setVisibility(View.GONE);
                    mTAnswer2.setVisibility(View.GONE);
                }
            }
        });

    }
}

package com.example.windows.meshkah2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGraid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainGraid=(GridLayout)findViewById(R.id.mainGraid);

        setSigleEvent(mainGraid);

    }

    private void setSigleEvent(GridLayout mainGraid) {

        CardView cardView2=(CardView)mainGraid.getChildAt(0);
        CardView cardView3=(CardView)mainGraid.getChildAt(1);
        CardView cardView4=(CardView)mainGraid.getChildAt(2);
        CardView cardView5=(CardView)mainGraid.getChildAt(3);
        CardView cardView6=(CardView)mainGraid.getChildAt(4);
        CardView cardView7=(CardView)mainGraid.getChildAt(5);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this , Main2Activity.class);
                startActivity(intent);


            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this , Main3Activity.class);
                startActivity(intent);


            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this , Main4Activity.class);
                startActivity(intent);


            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this , Main5Activity.class);
                startActivity(intent);


            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this , SettingsActivity.class);
                startActivity(intent);


            }
        });


        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this , Main6Activity.class);
                startActivity(intent);


            }
        });

    }


}

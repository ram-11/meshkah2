package com.example.windows.meshkah2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class Main3Activity extends AppCompatActivity {
    CarouselPicker carouselPicker;
    int x=0;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        carouselPicker=(CarouselPicker)findViewById(R.id.carouselpicker);
        button=(Button)findViewById(R.id.button);

        List<CarouselPicker.PickerItem>itemsText =new ArrayList<>();
        itemsText.add(new CarouselPicker.TextItem("   استغفر الله     ",15));
        itemsText.add(new CarouselPicker.TextItem("    سبحان الله     ",15));
        itemsText.add(new CarouselPicker.TextItem("     الحمدلله      ",15));
        CarouselPicker.CarouselViewAdapter textAdapter =new CarouselPicker.CarouselViewAdapter(this,itemsText,0);
        carouselPicker.setAdapter(textAdapter);
       }
        public boolean dispatchKeyEvent(KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                }
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {

                    x++;
                    button.setText(Integer.toString(x));
                }
                return true;
            default:
                return super.dispatchKeyEvent(event);
        }
    }

    public void cli(View view) {
        x++;
        button.setText(Integer.toString(x));
    }


    public void cli1(View view) {
        x=0;
        button.setText(Integer.toString(x));
    }
}


package com.example.slide_images_with_viewflipper;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipperMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipperMain = findViewById(R.id.viewFlipperMain);
        ActionViewFlipperMain();
    }
    //ham Flipper
    private void ActionViewFlipperMain() {
        List<String> arrayListFlipper =  new ArrayList<>();
        arrayListFlipper.add("https://app.iotstar.vn/appfoods/flipper/quangcao.png");
        arrayListFlipper.add("https://app.iotstar.vn/appfoods/flipper/coffee.jpg");
        arrayListFlipper.add("https://app.iotstar.vn/appfoods/flipper/companypizza.jpeg");
        arrayListFlipper.add("https://app.iotstar.vn/appfoods/flipper/themoingon.jpeg");
        for (int i = 0; i < arrayListFlipper.size(); i++) {
            ImageView imageView  = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(arrayListFlipper.get(1)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipperMain.addView(imageView);
        }
        viewFlipperMain.setFlipInterval(3000);
        viewFlipperMain.setAutoStart(true);
        //thiết lập animation cho flipper
        Animation slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipperMain.setInAnimation(slide_in);
        viewFlipperMain.setOutAnimation(slide_out);
    }
}
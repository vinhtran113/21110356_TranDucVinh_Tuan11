package com.example.recycleview_indicator_search;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Interpolator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.graphics.Path;
import android.view.animation.PathInterpolator;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcIcon;
    IconAdapter iconAdapter;
    ArrayList<IconModel> arrayList1;

    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rcIcon = findViewById(R.id.rcIcon);
        arrayList1 = new ArrayList<>();
        arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
        arrayList1.add(new IconModel(R.drawable.icon2, "sdfdf sfdsf"));
        arrayList1.add(new IconModel(R.drawable.icon3, "sdfdf sfds"));
        arrayList1.add(new IconModel(R.drawable.icon4, "dfgfhyh sxdff"));
        arrayList1.add(new IconModel(R.drawable.icon5, "jfdjfdjf djfdh"));
        arrayList1.add(new IconModel(R.drawable.icon6, "sdfdf sfdsf"));
        arrayList1.add(new IconModel(R.drawable.icon7, "sdfdf sfds"));
        arrayList1.add(new IconModel(R.drawable.icon8, "dfgfhyh sxdff"));
        arrayList1.add(new IconModel(R.drawable.icon9, "dfgfhyh sxdff"));
        arrayList1.add(new IconModel(R.drawable.icon1, "jfdjfdjf djfdh"));
        arrayList1.add(new IconModel(R.drawable.icon2, "sdfdf sfdsf"));
        arrayList1.add(new IconModel(R.drawable.icon3, "sdfdf sfds"));
        arrayList1.add(new IconModel(R.drawable.icon4, "dfgfhyh sxdff"));
        arrayList1.add(new IconModel(R.drawable.icon5, "jfdjfdjf djfdh"));
        arrayList1.add(new IconModel(R.drawable.icon6, "sdfdf sfdsf"));
        arrayList1.add(new IconModel(R.drawable.icon7, "sdfdf sfds"));
        arrayList1.add(new IconModel(R.drawable.icon8, "dfgfhyh sxdff"));
        arrayList1.add(new IconModel(R.drawable.icon9, "dfgfhyh sxdff"));
        // Thay thế GridLayoutManager bằng LinearLayoutManager với hướng dọc
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rcIcon.setLayoutManager(layoutManager);
        iconAdapter = new IconAdapter (getApplicationContext(), arrayList1);
        rcIcon.setAdapter(iconAdapter);
        rcIcon.addItemDecoration (new LinePagerIndicatorDecoration());
        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange (String newText) {
                filterListener(newText);
                return true;
            }
        });
    }
    private void filterListener (String text) {
        List<IconModel> list = new ArrayList<>();
        for (IconModel iconModel:arrayList1){
            if(iconModel.getDesc().toLowerCase().contains(text.toLowerCase())) {
                list.add(iconModel);
            }
        }
        if(list.isEmpty()){
            Toast.makeText(this, "Không có dữ liệu", Toast.LENGTH_SHORT).show();
        }else{
            iconAdapter.setListenerList(list);
        }
    }

}
package com.example.kuisrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_1);
        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Sujito", "Bapak", R.drawable.bapak));
        keluargaArrayList.add(new Keluarga("Suryatin", "Ibu", R.drawable.ibuk));
        keluargaArrayList.add(new Keluarga("Eka Priyananda", "Anak 1", R.drawable.anak1));
        keluargaArrayList.add(new Keluarga("Dwi Bastomi", "Anak 2", R.drawable.anak2));
    }
}

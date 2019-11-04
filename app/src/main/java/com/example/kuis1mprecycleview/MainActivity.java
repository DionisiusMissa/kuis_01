package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("SAMAT", "Bapak", R.drawable.bapak));
        mahasiswaArrayList.add(new Keluarga("SUPI", "Ibu", R.drawable.ibuk));
        mahasiswaArrayList.add(new Keluarga("MOCHAMMAD NANANG UTOMO", "Saya", R.drawable.saya));
        mahasiswaArrayList.add(new Keluarga("MUHAMMAD DWI AJI PRASETYO", "Adik", R.drawable.adik));
    }
}



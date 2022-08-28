package com.example.recyclerview12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        address = new ArrayList<>();
        loadData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new AddressAdapter(address));
    }

    private void loadData(){
        address.add("Chui");
        address.add("Toctogula");
        address.add("Bokonbaeva");
        address.add("Turusbekova");
        address.add("Manasa");
        address.add("Ahunbaeva");
        address.add("Frunze");
        address.add("Togolok Moldo");
        address.add("Moscovskaya");
        address.add("Sovetskaya");
        address.add("Jibek Jolu");
    }
}
package com.example.ice_info.pastChair;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ice_info.R;

import java.util.ArrayList;

public class PastChairActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private PcAdapter adapter;
    private ArrayList<PCModel> arrayList = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_chair);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Previous Chairmen");

        initData();
        RV();


    }

    private void RV() {
        recyclerView = findViewById(R.id.pcRV);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new PcAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        String[] name = getResources().getStringArray(R.array.prev_chair);
        String[] from = getResources().getStringArray(R.array.from);
        String[] to = getResources().getStringArray(R.array.to);
        int[] icons = {R.drawable.ic_user, R.drawable.rahman, R.drawable.rahman, R.drawable.rubayet, R.drawable.dipankardas, R.drawable.rubayet, R.drawable.sr, R.drawable.ic_user, R.drawable.safa, R.drawable.ic_user, R.drawable.safa, R.drawable.ic_user, R.drawable.dipankardas, R.drawable.emdad};
        for (int i = name.length - 1; i >= 0; i--) {
            PCModel pcModel = new PCModel();
            pcModel.setName(name[i]);
            pcModel.setFrom(from[i]);
            pcModel.setTo(to[i]);
            pcModel.setIcon(icons[i]);

            arrayList.add(pcModel);
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

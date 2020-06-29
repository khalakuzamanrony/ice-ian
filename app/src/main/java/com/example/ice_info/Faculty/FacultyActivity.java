package com.example.ice_info.Faculty;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ice_info.R;

import java.util.ArrayList;

public class FacultyActivity extends AppCompatActivity {
    int[] icons = {R.drawable.rubayet, R.drawable.dipankardas, R.drawable.rahman, R.drawable.emdad, R.drawable.rashedul, R.drawable.fa, R.drawable.hh, R.drawable.safa, R.drawable.sr, R.drawable.sabbir, R.drawable.hk, R.drawable.rh, R.drawable.fe, R.drawable.ln, R.drawable.mz, R.drawable.gr, R.drawable.mh, R.drawable.ic_user, R.drawable.foez, R.drawable.ashraful, R.drawable.matiqul, R.drawable.fa2};
    private ArrayList<FacultyModel> arrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FacultyAdapter facultyAdapter;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Faculty Members");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] faculty_names = getResources().getStringArray(R.array.faculty);
        String[] faculty_designation = getResources().getStringArray(R.array.designation);
        String[] faculty_email = getResources().getStringArray(R.array.email);
        String[] faculty_degree = getResources().getStringArray(R.array.degree);
        String[] faculty_phone = getResources().getStringArray(R.array.faculty_phone);

        for (int i = 0; i < faculty_names.length; i++) {
            FacultyModel facultyModel = new FacultyModel();
            facultyModel.setName(faculty_names[i]);
            facultyModel.setDesignation(faculty_designation[i]);
            facultyModel.setEmail(faculty_email[i]);
            facultyModel.setIcon(icons[i]);
            facultyModel.setDegree(faculty_degree[i]);
            facultyModel.setPhone(faculty_phone[i]);

            arrayList.add(facultyModel);
        }


        recyclerView = findViewById(R.id.faculty_recyclerview);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        facultyAdapter = new FacultyAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(facultyAdapter);


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

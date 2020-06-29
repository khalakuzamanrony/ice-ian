package com.example.ice_info.Syllebus;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ice_info.R;

import java.util.ArrayList;

public class SyllebusActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private Syllabus_Adapter syllabus_adapter;
    private ArrayList<S_Model> arrayList = new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllebus);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Syllebus");


        InitData();
        InitViews();


    }

    private void InitViews() {
        recyclerView = findViewById(R.id.syllebus_RV);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        syllabus_adapter = new Syllabus_Adapter(arrayList);
        recyclerView.setAdapter(syllabus_adapter);
        //recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL));

    }

    private void InitData() {
        String sm11 = "Part-I (Odd)";
        ArrayList<S_C_Model> s11 = new ArrayList<>();
        s11.add(new S_C_Model("Introduction to Information and Communication Engineering", "ICE1111", "3", "75"));
        s11.add(new S_C_Model("Electronics-I", "ICE 1121", "2", "75"));
        s11.add(new S_C_Model("Electronics-I Lab", "ICE 1122", "1.5", "37.5"));
        s11.add(new S_C_Model("Digital Electronics", "ICE 1131", "3", "75"));
        s11.add(new S_C_Model("Digital Electronics Lab", "ICE 1132", "1.5", "37.5"));
        s11.add(new S_C_Model("Algebra, Trigonometry and Vector Analysis", "MATH 1111", "3", "75"));
        s11.add(new S_C_Model("Physical and Inorganic Chemistry", "CHEM 1111", "3", "75"));
        s11.add(new S_C_Model("Technical  and Communicative English", "ENG 1111", "2", "75"));

        String sm12 = "Part-I (Even)";
        ArrayList<S_C_Model> s12 = new ArrayList<>();
        s12.add(new S_C_Model("Electronics-II", "ICE 1211", "2", "75"));
        s12.add(new S_C_Model("Electronics-II Lab", "ICE 1212", "1.5", "37.5"));
        s12.add(new S_C_Model("Programming with C", "ICE 1291", "3", "75"));
        s12.add(new S_C_Model("Programming with C Lab", "ICE 1292", "1.5", "37.5"));
        s12.add(new S_C_Model("Differential and Integral Calculus", "MATH 1211", "3", "75"));
        s12.add(new S_C_Model("Statistics for Engineers", "STAT 1211", "2", "75"));
        s12.add(new S_C_Model("Applied Electricity and Magnetism", "PHY 1221", "3", "75"));
        s12.add(new S_C_Model("Economics", "ECON 1211", "2", "75"));
        s12.add(new S_C_Model("Viva-Voce", "ICE 1210", "2", "75"));

        String sm21 = "Part-II (Odd)";
        ArrayList<S_C_Model> s21 = new ArrayList<>();
        s21.add(new S_C_Model("Electronic Circuits and Semiconductor Devices", "ICE 2111", "3", "75"));
        s21.add(new S_C_Model("Electronic Circuits and Semiconductor Devices Lab", "ICE 2112", "1.5", "37.5"));
        s21.add(new S_C_Model("Analog Communication and Radio-TV Engineering", "ICE 2121", "3", "75"));
        s21.add(new S_C_Model("Analog Communication and Radio-TV Engineering Lab", "ICE 2122", "1.5", "37.5"));
        s21.add(new S_C_Model("Electromagnetic Fields and Waves", "ICE 2211", "3", "75"));
        s21.add(new S_C_Model("Matrices and Differential Equations", "MATH 2111", "3", "75"));
        s21.add(new S_C_Model("Basic Theory of Statistics", "STAT 2111", "2", "75"));
        s21.add(new S_C_Model("Industrial Management and Accountancy", "ACCO 2111", "2", "75"));


        String sm22 = "Part-II (Even)";
        ArrayList<S_C_Model> s22 = new ArrayList<>();
        s22.add(new S_C_Model("Cellular and Mobile Communication", "ICE 2221", "3", "75"));
        s22.add(new S_C_Model("Signals and Systems", "ICE 2221", "3", "75"));
        s22.add(new S_C_Model("Signals and Systems Lab", "ICE 2222", "1.5", "37.5"));
        s22.add(new S_C_Model("Data Structures and Algorithm", "CSE 2231", "3", "75"));
        s22.add(new S_C_Model("Data Structure and Algorithm Lab", "CSE 2232", "1.5", "37.5"));
        s22.add(new S_C_Model("Discrete Mathematics  and Numerical Methods", "MATH 2221", "3", "75"));
        s22.add(new S_C_Model("Cyber and Intellectual Property Law", "LAW 2211", "2", "50"));
        s22.add(new S_C_Model("Viva-Voce", "ICE 2210", "2", "50"));


        String sm31 = "Part-III (Odd)";
        ArrayList<S_C_Model> s31 = new ArrayList<>();
        s31.add(new S_C_Model("Microwave Communication and Radar", "ICE 3111", "3", "75"));
        s31.add(new S_C_Model("Digital Signal Processing", "ICE 3121", "3", "75"));
        s31.add(new S_C_Model("Digital Signal Processing Lab", "ICE 3122", "1.5", "37.5"));
        s31.add(new S_C_Model("Java  and Network Programming", "ICE 3131", "3", "75"));
        s31.add(new S_C_Model("Java  and Network Programming Lab", "ICE3132", "1.5", "37.5"));
        s31.add(new S_C_Model("Antenna Engineering", "ICE3141", "3", "75"));
        s31.add(new S_C_Model("Antenna Engineering Lab", "ICE3142", "1.5", "37.5"));
        s31.add(new S_C_Model("Satellite Communication", "ICE3151", "3", "75"));

        String sm32 = "Part-III (Even)";
        ArrayList<S_C_Model> s32 = new ArrayList<>();
        s32.add(new S_C_Model("Digital Image Processing", "ICE 3211", "3", "75"));
        s32.add(new S_C_Model("Digital Image Processing Lab", "ICE 3212", "1.5", "37.5"));
        s32.add(new S_C_Model("Digital Communication", "ICE 3221", "3", "75"));
        s32.add(new S_C_Model("Digital Communication Lab", "ICE 3222", "1.5", "37.5"));
        s32.add(new S_C_Model("Telecommunication Engineering", "ICE 3231", "3", "75"));
        s32.add(new S_C_Model("Optical Fiber Communication", "ICE 3241", "3", "75"));
        s32.add(new S_C_Model("Optical Fiber Communication Lab", "ICE 3242", "1.5", "37.5"));
        s32.add(new S_C_Model("Software Engineering ", "ICE 3291", "3", "75"));
        s32.add(new S_C_Model("Viva-Voce", "ICE 3210", "2", "50"));

        String sm41 = "Part-IV (Odd)";
        ArrayList<S_C_Model> s41 = new ArrayList<>();
        s41.add(new S_C_Model("Artificial Intelligence  and Neural Computing", "ICE 4111", "3", "75"));
        s41.add(new S_C_Model("Computer Architecture and Microprocessor", "ICE 4121", "3", "75"));
        s41.add(new S_C_Model("Computer Architecture and Microprocessor Lab", "ICE 4122", "1.5", "37.5"));
        s41.add(new S_C_Model("Wireless Communication", "ICE 4131", "3", "75"));
        s41.add(new S_C_Model("Wireless Communication Lab", "ICE 4132", "1.5", "37.5"));
        s41.add(new S_C_Model("Database Management System", "ICE 4141", "3", "75"));
        s41.add(new S_C_Model("Database Management System Lab", "ICE 4142", "1.5", "37.5"));
        s41.add(new S_C_Model("Information System  Analysis and Design", "ICE 4151", "3", "75"));

        String sm42 = "Part-IV (Even)";
        ArrayList<S_C_Model> s42 = new ArrayList<>();
        s42.add(new S_C_Model("Computer Networks", "ICE 4211", "3", "75"));
        s42.add(new S_C_Model("Computer Networks Lab", "ICE 4212", "1.5", "37.5"));
        s42.add(new S_C_Model("Fundamentals of Cryptography", "ICE 4221", "3", "75"));
        s42.add(new S_C_Model("Fundamentals of Cryptography Lab", "ICE 4222", "1.5", "37.5"));
        s42.add(new S_C_Model("Information Theory and Coding", "ICE 4231", "3", "75"));
        s42.add(new S_C_Model("Web Engineering", "ICE 4241", "3", "75"));
        s42.add(new S_C_Model("Web Engineering Lab", "ICE 4242", "1.5", "37.5"));
        s42.add(new S_C_Model("Viva-Voce", "ICE 4210", "2", "50"));
        s42.add(new S_C_Model("Research Project", "ICE 4252", "2", "50"));


        arrayList.add(new S_Model(sm11, s11));
        arrayList.add(new S_Model(sm12, s12));
        arrayList.add(new S_Model(sm21, s21));
        arrayList.add(new S_Model(sm22, s22));
        arrayList.add(new S_Model(sm31, s31));
        arrayList.add(new S_Model(sm32, s32));
        arrayList.add(new S_Model(sm41, s41));
        arrayList.add(new S_Model(sm42, s42));

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

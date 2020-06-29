package com.example.ice_info.About_ICE;

import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.example.ice_info.R;

public class AboutICE_Activity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout history, program, lab, rg, contact;
    private RelativeLayout history_rl, program_rl, lab_rl, rg_rl, contact_rl;
    private ImageButton history_ib, program_ib, lab_ib, rg_ib, contact_ib;
    private ScaleAnimation cola, ex;
    private CardView cv;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_ice);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About ICE");

        InitViews();


    }

    private void InitViews() {
        history = findViewById(R.id.history_ll);
        program = findViewById(R.id.program_ll);
        lab = findViewById(R.id.lab_ll);
        rg = findViewById(R.id.rg_ll);
        contact = findViewById(R.id.contact_ll);
        history_rl = findViewById(R.id.history_rl);
        program_rl = findViewById(R.id.programs_title_lt);
        lab_rl = findViewById(R.id.lab_title_lt);
        rg_rl = findViewById(R.id.rg_title_lt);
        contact_rl = findViewById(R.id.contact_title_lt);
        history_ib = findViewById(R.id.history_ib);
        program_ib = findViewById(R.id.program_ib);
        lab_ib = findViewById(R.id.lab_ib);
        rg_ib = findViewById(R.id.rg_ib);
        contact_ib = findViewById(R.id.contact_ib);
        cv = findViewById(R.id.cv);


        history_rl.setOnClickListener(this);
        program_rl.setOnClickListener(this);
        lab_rl.setOnClickListener(this);
        rg_rl.setOnClickListener(this);
        contact_rl.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.history_rl:
                if (history.getVisibility() == View.GONE) {
                    history.setVisibility(View.VISIBLE);

                    history_ib.setImageResource(R.drawable.ic_arrow_drop_up);
                } else {
                    history.setVisibility(View.GONE);
                    history_ib.setImageResource(R.drawable.ic_arrow_drop_down);
                }
                break;
            case R.id.programs_title_lt:
                if (program.getVisibility() == View.GONE) {
                    program.setVisibility(View.VISIBLE);
                    TransitionManager.beginDelayedTransition(cv,new AutoTransition());
                    program_ib.setImageResource(R.drawable.ic_arrow_drop_up);
                } else {
                    program.setVisibility(View.GONE);
                    program_ib.setImageResource(R.drawable.ic_arrow_drop_down);
                }
                break;
            case R.id.lab_title_lt:
                if (lab.getVisibility() == View.GONE) {
                    lab.setVisibility(View.VISIBLE);
                    lab_ib.setImageResource(R.drawable.ic_arrow_drop_up);
                } else {
                    lab.setVisibility(View.GONE);
                    lab_ib.setImageResource(R.drawable.ic_arrow_drop_down);
                }
                break;
            case R.id.rg_title_lt:
                if (rg.getVisibility() == View.GONE) {
                    rg.setVisibility(View.VISIBLE);
                    rg_ib.setImageResource(R.drawable.ic_arrow_drop_up);
                } else {
                    rg.setVisibility(View.GONE);
                    rg_ib.setImageResource(R.drawable.ic_arrow_drop_down);
                }
                break;
            case R.id.contact_title_lt:
                if (contact.getVisibility() == View.GONE) {
                    contact.setVisibility(View.VISIBLE);
                    contact_ib.setImageResource(R.drawable.ic_arrow_drop_up);
                } else {
                    contact.setVisibility(View.GONE);
                    contact_ib.setImageResource(R.drawable.ic_arrow_drop_down);
                }
                break;

        }

    }

    public void closeAll() {
        history.setVisibility(View.GONE);
        program.setVisibility(View.GONE);
        lab.setVisibility(View.GONE);
        rg.setVisibility(View.GONE);
        contact.setVisibility(View.GONE);
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


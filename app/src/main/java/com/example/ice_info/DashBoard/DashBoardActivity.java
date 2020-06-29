package com.example.ice_info.DashBoard;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.ice_info.About.AboutActivity;
import com.example.ice_info.About_ICE.AboutICE_Activity;
import com.example.ice_info.Faculty.FacultyActivity;
import com.example.ice_info.Links.LinksActivity;
import com.example.ice_info.R;
import com.example.ice_info.Syllebus.SyllebusActivity;
import com.example.ice_info.pastChair.PastChairActivity;
import com.google.android.material.navigation.NavigationView;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private RelativeLayout faculty_rl, links_rl, pastchair_rl, syllebus_rl, ice_rl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //ToolBar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        //Init Variable;
        InitVar();
        //NavigationView
        navigationViewCall();
        //Setting Action Listener
        SetActionListener();

    }

    private void InitVar() {
        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawerLayout);
        faculty_rl = findViewById(R.id.faculty_rl);
        links_rl = findViewById(R.id.links_rl);
        pastchair_rl = findViewById(R.id.past_chair_rl);
        syllebus_rl = findViewById(R.id.syllebus_rl);
        ice_rl = findViewById(R.id.ice_rl);

    }

    private void SetActionListener() {
        faculty_rl.setOnClickListener(this);
        links_rl.setOnClickListener(this);
        pastchair_rl.setOnClickListener(this);
        syllebus_rl.setOnClickListener(this);
        ice_rl.setOnClickListener(this);

    }


    private void navigationViewCall() {
        navigationView.bringToFront();
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setItemIconTintList(null);
        //Navigation Width Controll
        DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams) navigationView.getLayoutParams();
        params.width = WindowManager.LayoutParams.WRAP_CONTENT;
        navigationView.setLayoutParams(params);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.app_bar_switch:
                        break;
                    case R.id.nav_about:
                        Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                    case R.id.nav_share:
                        break;
                    case R.id.nav_rate:
                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.faculty_rl) {
            Intent intent = new Intent(getApplicationContext(), FacultyActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (v.getId() == R.id.links_rl) {
            Intent intent = new Intent(getApplicationContext(), LinksActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (v.getId() == R.id.past_chair_rl) {
            Intent intent = new Intent(getApplicationContext(), PastChairActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (v.getId() == R.id.syllebus_rl) {
            Intent intent = new Intent(getApplicationContext(), SyllebusActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (v.getId() == R.id.ice_rl) {
            Intent intent = new Intent(getApplicationContext(), AboutICE_Activity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder adb = new AlertDialog.Builder(this, R.style.ADBStyle);
        adb.setTitle("Exit !");
        adb.setMessage("Are you Sure to exit ?");
        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        Dialog dialog = adb.create();
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_bg);
        dialog.show();
        Window window = dialog.getWindow();
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, 400);
    }
}

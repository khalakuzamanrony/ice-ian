package com.example.ice_info.Links;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.ice_info.R;

public class LinksActivity extends AppCompatActivity  implements View.OnClickListener {
    private Toolbar toolbar;
    private RelativeLayout association,pc;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Links");

        association=findViewById(R.id.ice_ass_rl);
        pc=findViewById(R.id.ice_pc_rl);

        association.setOnClickListener(this);
        pc.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.ice_ass_rl)
        {
            Intent intent=new Intent(getApplicationContext(),MyWebView.class);
            intent.putExtra("link","https://www.facebook.com/groups/ice.association.ru/");
            intent.putExtra("tn","ICE Association");
            startActivity(intent);
        }
        else  if (v.getId()==R.id.ice_pc_rl)
        {
            Intent intent=new Intent(getApplicationContext(),MyWebView.class);
            intent.putExtra("link","https://www.facebook.com/groups/icepc/?ref=share");
            intent.putExtra("tn","ICE Programming Club");
            startActivity(intent);
        }
    }
}

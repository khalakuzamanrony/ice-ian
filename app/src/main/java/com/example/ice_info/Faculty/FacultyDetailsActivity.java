package com.example.ice_info.Faculty;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.ice_info.R;

public class FacultyDetailsActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private TextView name, degree, degn, email, phone;
    private ImageButton fd_call, fd_save, fd_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TransparentStatusBar();
        Init();
        FacultyModel facultyModel = getFacultyModel();
        settingData(facultyModel);
        CheakingAvaility();


    }

    private void TransparentStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    private void settingData(FacultyModel facultyModel) {
        imageView.setImageResource(facultyModel.getIcon());
        name.setText(facultyModel.getName());
        degree.setText(facultyModel.getDegree());
        degn.setText(facultyModel.getDesignation());
        phone.setText(facultyModel.getPhone());
        email.setText(facultyModel.getEmail());
    }

    private void CheakingAvaility() {
        if (getFacultyModel().getEmail().equals("Not Provided")) {
            fd_email.setVisibility(View.GONE);
        } else if (getFacultyModel().getPhone().equals("Not Provided")) {
            fd_save.setVisibility(View.GONE);
            fd_call.setVisibility(View.GONE);
        }
    }

    private FacultyModel getFacultyModel() {
        Bundle bundle = getIntent().getExtras();
        return (FacultyModel) bundle.getSerializable("ALL");
    }

    private void Init() {
        imageView = findViewById(R.id.ronyx);
        name = findViewById(R.id.fd_name);
        degree = findViewById(R.id.fd_degree);
        degn = findViewById(R.id.fd_degisnation);
        phone = findViewById(R.id.fd_phone_number);
        email = findViewById(R.id.fd_email);
        fd_call = findViewById(R.id.fd_call);
        fd_email = findViewById(R.id.fd_email_button);
        fd_save = findViewById(R.id.fd_save);

        fd_call.setOnClickListener(this);
        fd_save.setOnClickListener(this);
        fd_email.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fd_call) {

            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + getFacultyModel().getPhone()));
            startActivity(Intent.createChooser(intent, "Using"));

        } else if (v.getId() == R.id.fd_save) {
            Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
            intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
            intent.putExtra(ContactsContract.Intents.Insert.EMAIL, getFacultyModel().getEmail());
            intent.putExtra(ContactsContract.Intents.Insert.PHONE, getFacultyModel().getPhone());
            intent.putExtra(ContactsContract.Intents.Insert.NAME, getFacultyModel().getName());
            intent.putExtra(ContactsContract.Intents.Insert.JOB_TITLE, getFacultyModel().getDesignation());
            intent.putExtra(ContactsContract.Intents.Insert.COMPANY, "Information & Communication Engineering, University of Rajshahi");


            startActivity(intent);
        } else if (v.getId() == R.id.fd_email_button) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:" + getFacultyModel().getEmail()));
            startActivity(Intent.createChooser(intent, "Mail"));

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

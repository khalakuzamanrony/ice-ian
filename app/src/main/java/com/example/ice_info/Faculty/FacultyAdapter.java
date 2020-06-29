package com.example.ice_info.Faculty;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ice_info.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.ViewHolder> {
    Context context;
    private ArrayList<FacultyModel> arrayList;

    public FacultyAdapter(ArrayList<FacultyModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public FacultyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sample4faculty_recyclerview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FacultyAdapter.ViewHolder holder, int position) {
        final FacultyModel facultyModel = arrayList.get(position);
        holder.name.setText(facultyModel.getName());
        holder.degi.setText(facultyModel.getDesignation());
        holder.imageView.setImageResource(facultyModel.getIcon());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("ALL", facultyModel);
                Intent intent = new Intent(context, FacultyDetailsActivity.class);
                intent.putExtras(bundle);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton call, email, details;
                ImageView avater;
                TextView name;
                final View view = LayoutInflater.from(v.getContext()).inflate(R.layout.image_demo, null);
                AlertDialog.Builder adb = new AlertDialog.Builder(v.getContext(), R.style.ADBStyle);
                adb.setView(view);
                avater = view.findViewById(R.id.image_demo);
                avater.setImageResource(facultyModel.getIcon());
                name = view.findViewById(R.id.demo_name);
                call = view.findViewById(R.id.demo_call);
                email = view.findViewById(R.id.demo_email);
                details = view.findViewById(R.id.demo_details);
                name.setText(facultyModel.getName());
                Dialog dialog = adb.create();
                dialog.getWindow().setBackgroundDrawableResource(R.drawable.card_border);
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name, degi;
        private CircleImageView imageView;
        private LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            degi = itemView.findViewById(R.id.degination);
            imageView = itemView.findViewById(R.id.image);
            linearLayout = itemView.findViewById(R.id.linearLayout);

        }
    }
}

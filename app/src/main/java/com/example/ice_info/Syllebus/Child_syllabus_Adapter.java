package com.example.ice_info.Syllebus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ice_info.R;

import java.util.ArrayList;

public class Child_syllabus_Adapter extends RecyclerView.Adapter<Child_syllabus_Adapter.ViewHolder> {
    private ArrayList<S_C_Model> arrayList;

    public Child_syllabus_Adapter(ArrayList<S_C_Model> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Child_syllabus_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_syllebus_model, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Child_syllabus_Adapter.ViewHolder holder, int position) {
        S_C_Model s_c_model = arrayList.get(position);
        holder.course_name.setText(s_c_model.getC_name());
        holder.course_code.setText(s_c_model.getC_code());
        holder.course_credit.setText("Credit : " + s_c_model.getC_credit());
        holder.course_marks.setText("Marks : " + s_c_model.getC_marks());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView course_code, course_credit, course_marks, course_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            course_name = itemView.findViewById(R.id.course_name);
            course_code = itemView.findViewById(R.id.course_code);
            course_credit = itemView.findViewById(R.id.course_credit);
            course_marks = itemView.findViewById(R.id.course_marks);
        }
    }
}

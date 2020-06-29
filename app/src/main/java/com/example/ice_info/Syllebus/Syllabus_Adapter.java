package com.example.ice_info.Syllebus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ice_info.R;

import java.util.ArrayList;

public class Syllabus_Adapter extends RecyclerView.Adapter<Syllabus_Adapter.ViewHolder> {
    private ArrayList<S_Model> arrayList;
    private Context context;

    public Syllabus_Adapter(ArrayList<S_Model> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.syllebus_model, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final S_Model s_model = arrayList.get(position);
        holder.partName.setText(s_model.getCourse_name());
        ArrayList<S_C_Model> childItems = s_model.getChild_items();
        Child_syllabus_Adapter child_syllabus_adapter = new Child_syllabus_Adapter(childItems);
        holder.childRV.setAdapter(child_syllabus_adapter);
        boolean isEx = s_model.isEx();
        holder.linearLayout.setVisibility(isEx ? View.VISIBLE : View.GONE);
        holder.drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s_model.setEx(!s_model.isEx());

                notifyItemChanged(position);
            }
        });
        if (isEx) {
            holder.drop_ib.setImageResource(R.drawable.ic_arrow_drop_up);
        } else {
            holder.drop_ib.setImageResource(R.drawable.ic_arrow_drop_down);
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView partName;
        private RecyclerView childRV;
        private LinearLayout linearLayout, drop;
        private ImageButton drop_ib;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            partName = itemView.findViewById(R.id.part);
            childRV = itemView.findViewById(R.id.child_syllebus_RV);
            linearLayout = itemView.findViewById(R.id.s_linearLayout);
            drop = itemView.findViewById(R.id.drop);
            drop_ib = itemView.findViewById(R.id.drop_ib);
        }
    }
}

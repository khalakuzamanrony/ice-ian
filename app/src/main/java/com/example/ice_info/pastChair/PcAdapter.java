package com.example.ice_info.pastChair;

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

public class PcAdapter extends RecyclerView.Adapter<PcAdapter.ViewHolder> {
    private ArrayList<PCModel> arrayList;

    public PcAdapter(ArrayList<PCModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public PcAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.past_chair_model, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PcAdapter.ViewHolder holder, final int position) {
        final PCModel pcModel = arrayList.get(position);
        holder.name.setText(pcModel.getName());
        holder.from.setText("From: " + pcModel.getFrom());
        holder.to.setText("To: " + pcModel.getTo());
        holder.icon.setImageResource(pcModel.getIcon());
        boolean isExpended = pcModel.isExpended();
        holder.expended.setVisibility(isExpended ? View.VISIBLE : View.GONE);
        holder.tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pcModel.setExpended(!pcModel.isExpended());
                notifyItemChanged(position);
            }
        });
        if (isExpended == true) {
            holder.ddib.setImageResource(R.drawable.ic_arrow_drop_up);
        } else {
            holder.ddib.setImageResource(R.drawable.ic_arrow_drop_down);
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name, from, to;
        private ImageView icon;
        private ImageButton ddib;
        private LinearLayout expended, tap;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.pc_name);
            from = itemView.findViewById(R.id.pc_from);
            to = itemView.findViewById(R.id.pc_to);
            icon = itemView.findViewById(R.id.pc_image);
            expended = itemView.findViewById(R.id.expended);
            tap = itemView.findViewById(R.id.tap);
            ddib = itemView.findViewById(R.id.ddb);

        }
    }
}

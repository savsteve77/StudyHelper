package com.zybooks.studyhelperhomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import com.android.volley.AuthFailureError;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<Subject> subjectList;

    public Adapter(Context context, List<Subject> subjectList){
        this.inflater = LayoutInflater.from(context);
        this.subjectList = subjectList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // bind data
        holder.subjectList.setText(subjectList.get(position) .getText());
        holder.updateTime.setText(subjectList.get(position) .getUpdateTime());
    }

    @Override
    public int getItemCount() {
        return subjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView subjectList, updateTime;
        ImageView bookIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            subjectList = itemView.findViewById(R.id.subject);
            updateTime = itemView.findViewById(R.id.updateTime);
        }
    }
}

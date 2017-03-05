package com.sample.joao.todolist.task;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sample.joao.todolist.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Adaptador usado para gerenciador tarefas apresentados na tela
 */
public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.RecordedTripItemViewHolder> {

    ArrayList<TaskViewModel> tasksViewModels;

    public TasksAdapter(ArrayList<TaskViewModel> taskViewModels) {
        this.tasksViewModels = taskViewModels;
    }

    @Override
    public RecordedTripItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_task, parent, false);
        RecordedTripItemViewHolder recordedTripItemViewHolder = new RecordedTripItemViewHolder(v);

        return recordedTripItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecordedTripItemViewHolder holder, int position) {
        holder.titleTextView.setText(tasksViewModels.get(position).getTitle());
        holder.dateTextView.setText(tasksViewModels.get(position).getDate());
        switch (tasksViewModels.get(position).getPriority()){
            case 1:
                holder.statusImageView.setBackgroundResource(R.drawable.ic_circle_red);
                break;
            case 2:
                holder.statusImageView.setBackgroundResource(R.drawable.ic_circle_orange);
                break;
            case 3:
                holder.statusImageView.setBackgroundResource(R.drawable.ic_circle_yellow);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return tasksViewModels.size();
    }

    public class RecordedTripItemViewHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener {

        @Bind(R.id.item_task_title)
        TextView titleTextView;

        @Bind(R.id.item_task_date)
        TextView dateTextView;

        @Bind(R.id.img_status_task)
        ImageView statusImageView;

        public RecordedTripItemViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            ButterKnife.bind(this, itemView);

        }

        @Override
        public void onClick(View v) {
        }
    }
}

package com.sample.joao.todolist.task;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sample.joao.todolist.R;

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
        holder.nameTextView.setText(tasksViewModels.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return tasksViewModels.size();
    }

    public class RecordedTripItemViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.item_task_title)
        TextView nameTextView;

        public RecordedTripItemViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}

package com.salahkouhen.quests;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestAdapter extends RecyclerView.Adapter<QuestViewHolder> {

    Context context;
    List<Quest> quests;

    public QuestAdapter(Context context, List<Quest> quests) {
        this.context = context;
        this.quests = quests;
    }

    @NonNull
    @Override
    public QuestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new QuestViewHolder(LayoutInflater.from(context).inflate(R.layout.quest_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull QuestViewHolder holder, int position) {
        holder.titleTxt.setText(quests.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return quests.size();
    }
}

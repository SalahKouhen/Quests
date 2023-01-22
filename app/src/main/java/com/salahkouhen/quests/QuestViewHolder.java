package com.salahkouhen.quests;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuestViewHolder extends RecyclerView.ViewHolder{

    TextView rewardTxt, titleTxt;
    Button completeBtn, rewardImageView;

    public QuestViewHolder(@NonNull View quest_view) {
        super(quest_view);
        rewardImageView = quest_view.findViewById(R.id.rewardImg);
        rewardTxt = quest_view.findViewById(R.id.rewardTxt);
        titleTxt = quest_view.findViewById(R.id.questTitle);
        completeBtn = quest_view.findViewById(R.id.completeBtn);
    }
}



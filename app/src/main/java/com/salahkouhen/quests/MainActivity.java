package com.salahkouhen.quests;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.ArrayDeque;

public class MainActivity extends AppCompatActivity {

    // main activity is the quest list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.questRecView);
        FloatingActionButton addQuestBtn = findViewById(R.id.addQuestBtn);

        List<Quest> quests = new ArrayList<Quest>();
        quests.add(new Quest("Create quests app"));
        quests.add(new Quest("Complete morning routine"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestAdapter(getApplicationContext(),quests));

        addQuestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuestInput();
            }
        });

    }

    public void openQuestInput(){
        Intent intent = new Intent(this, QuestInput.class);
        startActivity(intent);
    }
}
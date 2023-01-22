package com.salahkouhen.quests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuestInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_input);

        EditText questTitleIn = findViewById(R.id.edtTxtQuestTitle);
        Button addBtn = findViewById(R.id.addNewQuestBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quest newQuest = new Quest(questTitleIn.getText().toString());
                QuestList.getInstance().getList().add(newQuest);
            }
        });

    }
}
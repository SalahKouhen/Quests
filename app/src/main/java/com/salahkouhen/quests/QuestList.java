package com.salahkouhen.quests;

import java.util.ArrayList;

public class QuestList {

    private static QuestList instance;
    private ArrayList<Quest> list;

    public ArrayList<Quest> getList() {
        return list;
    }

    public void setList(ArrayList<Quest> list) {
        this.list = list;
    }

    private QuestList() {}

    public static QuestList getInstance(){
        if (instance == null){
            instance = new QuestList();
        }
        return instance;
    }

}

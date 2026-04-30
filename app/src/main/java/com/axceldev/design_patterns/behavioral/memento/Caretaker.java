package com.axceldev.design_patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<ArticleMemento> state =  new ArrayList<>();

    public void add(ArticleMemento memento) {
        state.add(memento);
    }

    public ArticleMemento get(int index) {
        return state.get(index);
    }

    public int getSize() {
        return state.size();
    }
}

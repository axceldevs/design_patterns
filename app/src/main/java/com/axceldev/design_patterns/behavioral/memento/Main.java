package com.axceldev.design_patterns.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        testMemento();
    }

    private static void testMemento(){
        Caretaker caretaker = new Caretaker();
        Article article = new Article("Juan", "one hundred years old");
        article.setText(article.getText() + " single");
        logger.info("text state before to create memento: {}", article.getText());
        caretaker.add(article.createMemento());
        article.setText(article.getText() + " of grabiel garcia marques");
        logger.info("text state after to create memento: {}", article.getText());
        caretaker.add(article.createMemento());

        logger.info("How many versions of the text are there? {}", caretaker.getSize());

        logger.info("----------- GETTER -------------");

        for (int i = 0; i < caretaker.getSize(); i++) {
            ArticleMemento articleState = caretaker.get(i);
            logger.info("View the {} version of the text: '{}'", (i+1), articleState.getText());
        }

        logger.info("----------- RESTORE -------------");

        for (int j =caretaker.getSize()-1; j >= 0 ; j--) {
            ArticleMemento articleState = caretaker.get(j);
            article.restoreMemento(articleState);
            logger.info("View the {} version restore of the text: '{}'", (j+1), articleState.getText());
        }


    }
}

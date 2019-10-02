package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();
    private final String name;

    public Homework(String name) {
        this.name = name;
    }

    public void addHomework(String message) {
        this.messages.add(message);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}

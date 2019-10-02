package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(username + " - new homework to check from " + homework.getName() + "\n"
                + "(total: " + homework.getMessages().size() + " homeworks to check)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

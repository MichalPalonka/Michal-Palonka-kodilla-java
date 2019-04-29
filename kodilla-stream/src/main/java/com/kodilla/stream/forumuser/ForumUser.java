package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate birthdate;
    private final int postCount;

    public ForumUser(final int id, final String name, final char sex, final LocalDate birthdate, final int postCount) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthdate = birthdate;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postCount=" + postCount +
                '}';
    }
}

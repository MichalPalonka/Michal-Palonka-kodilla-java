package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        Forum theForum = new Forum();
        Map<Integer, ForumUser> mapForumUsers = theForum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthdate().getYear() >= 1999)
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        mapForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

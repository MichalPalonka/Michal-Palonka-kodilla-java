package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avengerPostPerUser;
    private double avengerCommentPerUser;
    private double avengerCommentPerPost;

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvengerPostPerUser() {
        return avengerPostPerUser;
    }

    public double getAvengerCommentPerUser() {
        return avengerCommentPerUser;
    }

    public double getAvengerCommentPerPost() {
        return avengerCommentPerPost;
    }
    private double checkAvengerPostPerUser(){
        if(userCount>0) {
            return (double)getPostCount() / getUserCount();
        }else{
            return 0;
        }
    }
    private double checkAvengerCommentPerUser(){
        if(userCount>0) {
            return (double)getCommentCount()/getUserCount();
        }else{
            return 0;
        }
    }
    private double checkAvengerCommentPerPost(){
        if(postCount>0) {
            return (double)getCommentCount()/getPostCount();
        }else{
            return 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics){
        userCount=statistics.usersNames().size();
        postCount=statistics.postsCount();
        commentCount=statistics.commentsCount();
        avengerPostPerUser=checkAvengerPostPerUser();
        avengerCommentPerUser=checkAvengerCommentPerUser();
        avengerCommentPerPost=checkAvengerCommentPerPost();
    }
    public void showStatistics(){
        System.out.println("User count " + getUserCount());
        System.out.println("Post count " + getPostCount());
        System.out.println("Comment count "+ getCommentCount());
        System.out.println("Avenger post per User "+ getAvengerPostPerUser());
        System.out.println("Avenger comment per User " + getAvengerCommentPerUser());
        System.out.println("Avenger comment per post " + getAvengerCommentPerPost());
    }
}

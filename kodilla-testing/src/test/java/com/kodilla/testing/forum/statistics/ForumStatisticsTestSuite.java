package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void test0PostCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
            listMock.add("User1");
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistic.getUserCount());
        assertEquals(0, forumStatistic.getPostCount());
        assertEquals(0, forumStatistic.getCommentCount());
        assertEquals(0, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(0, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(0, forumStatistic.getAvengerCommentPerPost(),1);
    }
    @Test
    public void test1000PostCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        listMock.add("User1");
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistic.getUserCount());
        assertEquals(1000, forumStatistic.getPostCount());
        assertEquals(0, forumStatistic.getCommentCount());
        assertEquals(1000, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(0, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(0, forumStatistic.getAvengerCommentPerPost(),1);
    }

    @Test
    public void test0CommentsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        listMock.add("User1");
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistic.getUserCount());
        assertEquals(0, forumStatistic.getPostCount());
        assertEquals(0, forumStatistic.getCommentCount());
        assertEquals(0, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(0, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(0, forumStatistic.getAvengerCommentPerPost(),1);
    }

    @Test
    public void testMoreCommentFromPost(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        listMock.add("User1");
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistic.getUserCount());
        assertEquals(100, forumStatistic.getPostCount());
        assertEquals(1000, forumStatistic.getCommentCount());
        assertEquals(100, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(1000, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(10, forumStatistic.getAvengerCommentPerPost(),1);
    }

    @Test
    public void testLessCommentFromPost(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        listMock.add("User1");
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistic.getUserCount());
        assertEquals(1000, forumStatistic.getPostCount());
        assertEquals(100, forumStatistic.getCommentCount());
        assertEquals(1000, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(100, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(0.1, forumStatistic.getAvengerCommentPerPost(),1);
    }

    @Test
    public void test0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistic.getUserCount());
        assertEquals(0, forumStatistic.getPostCount());
        assertEquals(0, forumStatistic.getCommentCount());
        assertEquals(0, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(0, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(0, forumStatistic.getAvengerCommentPerPost(),1);
    }

    @Test
    public void test100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("NewUser");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistic forumStatistic = new ForumStatistic();

        //When
        forumStatistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistic.getUserCount());
        assertEquals(0, forumStatistic.getPostCount());
        assertEquals(0, forumStatistic.getCommentCount());
        assertEquals(0, forumStatistic.getAvengerPostPerUser(), 1);
        assertEquals(0, forumStatistic.getAvengerCommentPerUser(),1);
        assertEquals(0, forumStatistic.getAvengerCommentPerPost(),1);
    }


}

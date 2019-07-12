package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User mark = new ZGeneration("Mark Links");

        //When
        String stevenPublish = steven.sharePost();
        System.out.println("Steven " + stevenPublish);
        String johnPublish = john.sharePost();
        System.out.println("John " + johnPublish);
        String markPublish = mark.sharePost();
        System.out.println("Mark " + markPublish);

        //Then
        Assert.assertEquals("published on Facebook", stevenPublish);
        Assert.assertEquals("published on Snapchat", johnPublish);
        Assert.assertEquals("published on Twitter", markPublish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenPublish = steven.sharePost();
        System.out.println("Steven " + stevenPublish);
        steven.setPublishPleace(new SnapchatPublisher());
        stevenPublish = steven.sharePost();
        System.out.println("Steven now " + stevenPublish);

        //Then
        Assert.assertEquals("published on Snapchat", stevenPublish);
    }
}
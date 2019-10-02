package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.Students.JessiePinkman;
import com.kodilla.patterns2.observer.homework.Students.SaoulGoodman;
import com.kodilla.patterns2.observer.homework.Students.WalterWhite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        WalterWhite white = new WalterWhite();
        SaoulGoodman goodman = new SaoulGoodman();
        JessiePinkman pinkman = new JessiePinkman();

        Mentor godLvlMentor = new Mentor("Mentor God");
        Mentor typicalMentor = new Mentor("Human mentor");

        white.registerObserver(godLvlMentor);
        goodman.registerObserver(typicalMentor);
        pinkman.registerObserver(godLvlMentor);

        //When
        white.addHomework("1 - module");
        white.addHomework("2 - module");
        white.addHomework("3 - module");
        goodman.addHomework("1 - module");
        goodman.addHomework("2 - module");
        pinkman.addHomework("1 - module");

        //Then
        assertEquals(4, godLvlMentor.getUpdateCount());
        assertEquals(2, typicalMentor.getUpdateCount());
    }
}

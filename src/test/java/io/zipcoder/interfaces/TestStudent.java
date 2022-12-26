package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent extends TestCase {

    @Test
    public void testStudentImplementation() {
        Student student = new Student(1,"Tony");
        Assert.assertTrue(student instanceof Learner);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(1,"Penny");
        student.learn(2.0);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(2.0,actual,.1);
    }

}
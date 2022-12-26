package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestPerson {

    @Test
    public void testPersonConstructor() {
        long expectedId = 0001;
        String expectedName = "Benji";

        Person person = new Person(expectedId,expectedName);

        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName() {
       String expectedName = "Benji";
       Person person = new Person(1, "Benji");
       Assert.assertTrue(expectedName.equals(person.getName()));
    }


}

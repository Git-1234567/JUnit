package org.example;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AssertExercise {
    //1.create a test method that uses assertEquals or assertNotEquals to verify if the string Codeup is the same as CodeUp
    @Test
    public void assEq()
    {
        String s1="Sam";
        String s2="Sam";
        String s3="Ram";
        assertEquals(s1,s2);
        assertNotEquals(s1,s3);
    }
    //2.create a test method that uses assertNotSame to verify that the following ArrayLists are not the same
    @Test
    public void assSame()
    {
        List languages=new ArrayList<>();
        List moreLanguages=new ArrayList<>();
        List l1=languages;
        assertSame(languages,l1);
        assertNotSame(languages,moreLanguages);
    }
    //3.create a test method that uses assertArrayEquals to verify the following arrays are equal
    @Test
    public void assArray()
    {
        int[] numbers={1,2,3};
        int[] otherNumbers=new int[3];
        otherNumbers[0]=1;
        otherNumbers[1]=2;
        otherNumbers[2]=3;
        assertArrayEquals(numbers,otherNumbers);
    }
    //4.create a test method that uses both assertFalse and assertTrue to verify the following statements
    @Test
    public void assFalse()
    {
        String language="PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("w"));
    }
}

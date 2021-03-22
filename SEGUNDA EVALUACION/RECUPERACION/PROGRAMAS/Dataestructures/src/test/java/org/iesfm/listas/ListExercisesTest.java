package org.iesfm.listas;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercisesTest {

    @Test
    public void firstElementTest(){
        ListExercises listExercises = new ListExercises();
        ArrayList<String> listTest = new ArrayList<>(); //preparar lista
        listTest.add("1");
        listTest.add("2");
        listTest.add("8");


        String firstElement = listExercises.firstElement(listTest); //creacion de variable y invocacion del metodo
        Assert.assertEquals("1",firstElement);

    }

    @Test
    public void firstElementEmptyListTest(){
        ListExercises listExercises = new ListExercises();
        ArrayList<String> listTest = new ArrayList<>();

        String firstElement = listExercises.firstElement(listTest);

        Assert.assertNull(firstElement);
    }

    @Test
    public void lastElementTest(){
        ListExercises listExercises = new ListExercises();
        ArrayList<String> listTest = new ArrayList<>(); //preparar lista
        listTest.add("1");
        listTest.add("2");
        listTest.add("8");


        String lastElement = listExercises.lastElement(listTest); //creacion de variable y invocacion del metodo
        Assert.assertEquals("8",lastElement);

    }

    @Test
    public void lastElementEmptyListTest(){
        ListExercises listExercises = new ListExercises();
        ArrayList<String> listTest = new ArrayList<>();

        String lastElement = listExercises.lastElement(listTest);

        Assert.assertNull(lastElement);
    }

    @Test
    public void insertFirstElementPositionTest(){
        ListExercises listExercises = new ListExercises();
        List<String> listTest = new LinkedList<>();
        listTest.add("Alvaro");

        List<String> insertFirstElement = listExercises.insertFirstPosition(listTest,"Raul");

        List<String> expected = new LinkedList<>();
        expected.add("Raul");
        expected.add("Alvaro");
        Assert.assertEquals(expected, insertFirstElement);
    }

    @Test
    public void insertFirstElementInEmptyPositionTest(){
        ListExercises listExercises = new ListExercises();
        List<String> listTest = new LinkedList<>();

        List<String> insertFirstElement = listExercises.insertFirstPosition(listTest,"Alvaro");

        List<String> expected = new LinkedList<>();
        expected.add("Alvaro");
        Assert.assertEquals(expected, insertFirstElement);
    }

    @Test
    public void sustitutePositionTest(){
        ListExercises listExercises = new ListExercises();
        List<String> list = new LinkedList<>();
        list.add("Juan");
        list.add("Pedro");

        List<String> sustituteName = listExercises.sustitutePosition(list, "Raquel", 1);

        List<String> expected = new LinkedList<>();
        expected.add("Pedro");
        expected.add("Raquel");

        Assert.assertEquals(expected, sustituteName);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void sustituteInvalidPositionTest(){
        ListExercises listExercises = new ListExercises();
        List<String> list = new LinkedList<>();
        list.add("Juan");
        list.add("Pedro");

        List<String> sustituteName = listExercises.sustitutePosition(list, "Raquel", 3);
    }
}

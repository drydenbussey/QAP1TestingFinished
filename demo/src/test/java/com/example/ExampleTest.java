package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ExampleTest {
    @Mock
    private PersonDB personDB;

    @Test
    public void testIsTrue() {
        Example exampleUnderTest = new Example();

        Assertions.assertTrue(exampleUnderTest.isTrue());
    }

    @Test
    public void testIncrement() {
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(2, exampleUnderTest.incrementNumber(1));
        Assertions.assertNotEquals(3, exampleUnderTest.incrementNumber(1));
    }

    @Test
    public void testFindPersonByLastName() {
        List<Person> personList = new ArrayList<Person>();

        Person personToFind = new Person();
        personToFind.setFirstName("Dryden");
        personToFind.setLastName("Bussey");
        personList.add(personToFind);

        Mockito.when(personDB.getPeople()).thenReturn(personList);

        Example exmapleUnderTest = new Example(personDB);

        Assertions.assertNotNull(exmapleUnderTest.findPersonByLastName("C"));
    }

}

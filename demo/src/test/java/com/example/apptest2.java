package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;

import static org.junit.Assert.*;


public class apptest2{
    @Test
    public void isTrue() {
        assertTrue(true);
    }
    @Test
    public void isFalse(){assertFalse(false);}
    @Test
    public void isNull(){assertNull(null);}

}
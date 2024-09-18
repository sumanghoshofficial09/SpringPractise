package com.example.appprops.appprops.component;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyChar;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.example.appprops.appprops.calculator.Calculator;

public class CalculatorTest {
    private Calculator calculator;
    private Operation mockOperation;


    @BeforeEach
    public void setUp()
    {
        mockOperation = Mockito.mock(Operation.class);
        calculator = new Calculator(Collections.singletonList(mockOperation));
        

    }
    
    @Test
    public void throwExceptionWhenNoSuitableOperationFound()
    {

        when(mockOperation.handle(anyChar())).thenReturn(false);

        assertThrows(IllegalArgumentException.class, () -> calculator.performCalcultation(1, 2, '*'));
    }


    @Test
    public void shouldCallApplyMethodWhenSuitableOperationFound()
    {
        when(mockOperation.handle(anyChar())).thenReturn(true);
        when(mockOperation.apply(1, 2)).thenReturn(2);

        calculator.performCalcultation(1, 2, '*');

        Mockito.verify(mockOperation, Mockito.times(1)).apply(1, 2);
    }

    
    
}

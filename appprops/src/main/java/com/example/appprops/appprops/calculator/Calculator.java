package com.example.appprops.appprops.calculator;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.example.appprops.appprops.component.Operation;



/**
 * Calculator
 */
@Component
public class Calculator {

   

    public Collection<Operation> operations;

    public Calculator(Collection<Operation> operations) {
        this.operations = operations;
    }

    public int performCalcultation(int lhs, int rhs, char operator) {

      return operations.stream().filter(operation -> operation.handle(operator)).findFirst()
          .map(operation -> operation.apply(lhs, rhs))
          .orElseThrow(() -> new IllegalArgumentException("No suitable operation found"));

        
    }
        

    
}
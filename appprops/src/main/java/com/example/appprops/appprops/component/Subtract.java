
package com.example.appprops.appprops.component;

import org.springframework.stereotype.Component;

/**
 * Subtract
 */
@Component
public class Subtract  implements Operation {

    @Override
    public int apply(int lhs, int rhs) {
        return lhs - rhs;
    }

    @Override
    public boolean handle(char op) {
        return op == '-';
    }
}   
    


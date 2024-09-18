package com.example.appprops.appprops.component;

/**
 * Operation
 */
public interface Operation {

    public int apply(int lhs,int rhs);

    public boolean handle(char op);
}
package com.axceldev.design_patterns.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    Object next();
    Object current();
}

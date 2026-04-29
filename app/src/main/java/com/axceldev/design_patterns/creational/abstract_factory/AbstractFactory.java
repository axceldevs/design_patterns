package com.axceldev.design_patterns.creational.abstract_factory;

public interface AbstractFactory<T, D> {
    T create(D type);
}

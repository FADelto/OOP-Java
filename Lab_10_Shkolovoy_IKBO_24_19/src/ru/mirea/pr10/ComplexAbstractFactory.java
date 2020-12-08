package ru.mirea.pr10;

public interface ComplexAbstractFactory {
    Complex createComplex();

    Complex createComplex(int real, int image);
}
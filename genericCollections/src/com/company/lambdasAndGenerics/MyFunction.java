package com.company.lambdasAndGenerics;
@FunctionalInterface
public interface MyFunction<T,R> {
    R apply(T t );


}

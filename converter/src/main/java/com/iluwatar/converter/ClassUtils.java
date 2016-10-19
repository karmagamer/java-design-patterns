package com.iluwatar.converter;


import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by karma on 10/18/2016.
 */
public class ClassUtils {

    protected ClassUtils() { }

    public static  void setIfNotNull(final Supplier getter, final Consumer setter) {

        Object t = getter.get();

        if (null != t) {
            setter.accept(t);
        }
    }
}
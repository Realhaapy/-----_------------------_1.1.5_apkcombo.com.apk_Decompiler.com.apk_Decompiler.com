package com.google.firebase.components;

public class x extends RuntimeException {
    public x(String str) {
        super(str);
    }

    public x(String str, Throwable th) {
        super(str, th);
    }
}

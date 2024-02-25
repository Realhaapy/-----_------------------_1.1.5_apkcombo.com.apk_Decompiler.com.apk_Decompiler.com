package com.yalantis.ucrop.l;

public class c {
    private int a;
    private int b;
    private int c;

    public c(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}

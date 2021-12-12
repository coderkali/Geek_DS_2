package com.geeks.ds;

import java.util.Objects;

class Test12345678 {


    String test;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test12345678 that = (Test12345678) o;
        return Objects.equals(test, that.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test);
    }
}

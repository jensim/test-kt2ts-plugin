package se.jensim.models;

import java.util.Objects;

public class AsdfJava {

    private final String a;

    public AsdfJava(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsdfJava asdfJava = (AsdfJava) o;
        return Objects.equals(a, asdfJava.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        return "AsdfJava{" +
                "a='" + a + '\'' +
                '}';
    }
}

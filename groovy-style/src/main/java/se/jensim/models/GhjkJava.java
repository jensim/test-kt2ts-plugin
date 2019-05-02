package se.jensim.models;

import java.util.Objects;

public class GhjkJava {

    private final String g;

    public GhjkJava(String g) {
        this.g = g;
    }

    public String getG() {
        return g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GhjkJava ghjkJava = (GhjkJava) o;
        return Objects.equals(g, ghjkJava.g);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g);
    }

    @Override
    public String toString() {
        return "GhjkJava{" +
                "g='" + g + '\'' +
                '}';
    }
}

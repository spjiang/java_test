package com.spjiang.app.fanxing;

import java.util.Arrays;

public class JavaComparable {
    public static void main(String[] args) {
        Person[] ps = new Person[]{
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person> {
    String name;
    Integer score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person other) {
        //return this.name.compareTo(other.name);
        return this.score.compareTo(other.score);
    }
    public String toString() {
        return this.name + "," + this.score;
    }
}


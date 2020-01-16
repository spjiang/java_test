package com.spjiang.app.Collection;

import java.util.List;
import java.util.Objects;

public class Main {
    /*public static void main(String[] args) {
        List<String> list = List.of("apple", "pear", "banana");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }*/
    /*public static void main(String[] args) {
        List<Integer> list = List.of(12, 34, 56);
        list.add(999); // UnsupportedOperationException
    }*/
    /*public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains(new String("C"))); // true or false?
        System.out.println(list.indexOf(new String("C"))); // 2 or -1?
    }*/
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Xiao Ming"),
                new Person("Xiao Hong"),
                new Person("Bob")
        );
        System.out.println(list.contains(new Person("Bob"))); // false
    }
}

class Person {
    String name;
    public int age;

    public Person(String name) {
        this.name = name;
    }

    /*public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            boolean nameEquals = false;
            if (this.name == null && p.name == null) {
                nameEquals = true;
            }
            if (this.name != null) {
                nameEquals = this.name.equals(p.name);
            }
            return nameEquals && this.age == p.age;
        }
        return false;
    }*/

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}

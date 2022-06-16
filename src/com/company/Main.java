package com.company;

public class Main {
/**Box деген generic класс тузунуз.
 Ичинде Box деген объектти кайтарган статический generic метод болсун.**/
    public static void main(String[] args) {
            Box<Integer> a = new Box<>(1);
            System.out.println(a);
        }
    }


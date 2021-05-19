package zad3;

import java.util.stream.Stream;

public class Zad3{
    public static void main(String[] args) {
        //tru
        System.out.println(" ".isBlank());
        //false
        System.out.println(" ".isEmpty());

        //B
        //AB
        //AB
        Stream<String> lines= "B\nAB\nAB".lines();
        lines.forEach(System.out::println);

        //"DB"
        System.out.println(" DB ".strip());
        //"DB "
        System.out.println(" DB ".stripLeading());
        //" DB"
        System.out.println(" DB ".stripTrailing());
        //=====
        System.out.println("=".repeat(5));

    }

}
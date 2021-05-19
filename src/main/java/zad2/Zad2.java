package zad2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad2 {
    public static void main(String[] args) {
        var arrayOfIntegers = Arrays.asList(-22, -20, -15, -10, -5, -1, 0, 2, 3, 4, 10, 22);
        List<Integer> listUnmodifiableIntegers = List.copyOf(arrayOfIntegers);

        List<Integer> integersBiggerThanZero = listUnmodifiableIntegers.stream()
                .filter(integer -> integer > 0)
                .collect(Collectors.toUnmodifiableList());

        try{
            integersBiggerThanZero.add(45);
        }catch (Exception e){
            System.out.println("Nie można dodać do UnmodifableList");
        }

        System.out.println(integersBiggerThanZero);
    }
}
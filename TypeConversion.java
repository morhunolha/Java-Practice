package main;

public class TypeConversion {

    public static void main(String[] args) {

        var result = ((int) 2.9) + " times";
        System.out.println(result);

        var number = Integer.parseInt("345");
        System.out.println(number); // => 345
    }
}

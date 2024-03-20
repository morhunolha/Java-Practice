package main;

public class CurrencyExchange {

    /*Write a program that takes the initial number of euros written to the eurosCount variable, converts euros into dollars and displays it on the screen. Then it converts the obtained value into rubles and displays it on a new line.*/
    public static void main(String[] args) {
        var eurosCount = 100;


        var dollarsCount = 100 * 1.25; // 125
        var rublesPerDollar = 60;
        var rublesCount = dollarsCount * rublesPerDollar; // 3750

        System.out.println("Given: " + eurosCount + " euros");
        System.out.println("The price is " + dollarsCount + " dollars");
        System.out.println("The price is " + rublesCount + " rubles");

    }

}

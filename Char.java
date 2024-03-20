package main;

/*Create a variable called expectedGrade of type char.
Fill it with a single letter, representing the grade you think you would get in a graded Java course
where the grades A, B, C, D and F are possible.
*/

public class Char {
    public static void main(String[] args) {
        char expectedGrade = 'A';
        System.out.println(expectedGrade);

        var text = "Never forget what you are, for surely the world will not";
        System.out.println("First: " + text.charAt(0) + "\n" + "Last: " + text.charAt(text.length() - 1));
    }
}
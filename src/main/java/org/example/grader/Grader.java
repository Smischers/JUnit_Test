package org.example.grader;

public class Grader {
    public char getLetterGradeFromNumber(int number){
        if (number < 0){
            throw  new IllegalArgumentException("number grade cannot be negative");
        } else if (number<60) {
            return 'F';
        }else if (number<70) {
            return 'D';
        }else if (number<80) {
            return 'C';
        }else if (number<90) {
            return 'B';
        }else if (number<100) {
            return 'A';
        }else {
            throw  new IllegalArgumentException("number grade cannot be greater than 100");
        }
    }

//Unit Testklasse erstellen mit Strg + Umsch + T -> OK
//Package und Klasse können auch manuell hinzugefügt werden

}

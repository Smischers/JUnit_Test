package org.example.grader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    // Immer versuchen Grenzbereich Werte zu verwenden
    // Immer versuchen mit dem leichtesten Testcase anzufangen

    @Test
    void fiftyNine_returns_grade_F(){
        //given
        Grader grader = new Grader();
        int numberGrade = 59;

        //when
        char actual = grader.getLetterGradeFromNumber(numberGrade);

        //then
        assertEquals('F', actual);
    }

    //Testen einer exception
    @Test
    void greater_than_100_throws_exception(){
        //given
        Grader grader = new Grader();
        int numberGrade = 101;

        //when and then (kann bei exceptions nicht aufgeteilt werden)
        assertThrows(IllegalArgumentException.class, () -> grader.getLetterGradeFromNumber(numberGrade));
    }



}
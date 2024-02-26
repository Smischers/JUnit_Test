package org.example.books;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    void a_10_digit_isbn_is_not_valid_if_it_is_longer_than_10_digits(){
        //given
        Book book = new Book("title", "author", "012345678910");

        //when
        boolean actual = book.isValid10DigitISBN();

        //then
        assertFalse(actual);        //assertFalse für boolean verwenden

    }

    @Test
    void a_10_digit_isbn_is_not_valid_if_it_is_shorter_than_10_digits(){
        //given
        Book book = new Book("title", "author", "01234");

        //when
        boolean actual = book.isValid10DigitISBN();

        //then
        assertFalse(actual);        //assertFalse für boolean verwenden

    }

    @Test
    void a_10_digit_isbn_is_not_valid_if_it_contains_non_numeric_value_except_last_digit(){
        //given
        Book book = new Book("title", "author", "012A342686");

        //when
        boolean actual = book.isValid10DigitISBN();

        //then
        assertFalse(actual);
    }

    @Test
    void a_10_digit_isbn_is_vaild_if_remainder_is_0(){
        //given
        Book book = new Book("title", "author", "0198526636");

        //when
        boolean actual = book.isValid10DigitISBN();

        //then
        assertTrue(actual);
    }

    void a_10_digit_isbn_is_not_valid_if_its_last_digit_is_not_X_and_non_numeric(){
        //given
        Book book = new Book("title", "author", "012342686A");

        //when
        boolean actual = book.isValid10DigitISBN();

        //then
        assertFalse(actual);
    }


}
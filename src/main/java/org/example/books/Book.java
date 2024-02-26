package org.example.books;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book (String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    //Standard Getter und Setter müssen nicht unbedingt getestet werden (nur wenn sie komplexer werden)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    //Immer so testen, dass der Code zuerst false ist

    // Test Funktion für Test <10 und >10
    public boolean isValid10DigitISBN(){
        if(this.isbn.length() != 10){
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 9; i++){
            char c = isbn.charAt(i);
            if(!Character.isDigit(c)){
                return false;
            }
            sum += Character.getNumericValue(c) * (10 - i);
        }

        char lastChar = isbn.charAt(9);
        if (lastChar != 'X' && !Character.isDigit(lastChar)){
            return false;
        }

        int lastDigit = Character.getNumericValue(lastChar);

        return (sum + lastDigit) % 11 == 0;
    }




}

package HomeWork1.Resolves.hw1;

public class Book {
    private String title;
    private int pages;

    private String authors;
    private String genre;

    public String getTitle() {
        return title;
    }


    public String toString() {
        return STR."Book title \{title} , pages \{pages}, authors \{authors}, genre \{genre}";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

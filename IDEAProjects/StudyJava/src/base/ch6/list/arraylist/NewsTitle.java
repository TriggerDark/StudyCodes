package base.ch6.list.arraylist;

import java.util.Objects;

public class NewsTitle {
    private int id;
    private String title;
    private String author;

    public NewsTitle(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsTitle newsTitle = (NewsTitle) o;
        return id == newsTitle.id &&
                title.equals(newsTitle.title) &&
                author.equals(newsTitle.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

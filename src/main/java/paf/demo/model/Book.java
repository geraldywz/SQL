package paf.demo.model;

import java.util.Objects;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Book {

    private String bookid;
    private String title;
    private String authors;
    private String description;
    private String edition;
    private String format;
    private int pages;
    private double rating;
    private int ratingCount;
    private int reviewCount;
    private String genres;
    private String imageUrl;

    public Book() {
    }

    public Book(String bookid, String title, String authors, String description, String edition, String format,
            int pages, double rating, int ratingCount, int reviewCount, String genres, String imageUrl) {
        this.bookid = bookid;
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.edition = edition;
        this.format = format;
        this.pages = pages;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.reviewCount = reviewCount;
        this.genres = genres;
        this.imageUrl = imageUrl;
    }

    public String getBookid() {
        return this.bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return this.authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEdition() {
        return this.edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return this.ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getReviewCount() {
        return this.reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getGenres() {
        return this.genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Book bookid(String bookid) {
        setBookid(bookid);
        return this;
    }

    public Book title(String title) {
        setTitle(title);
        return this;
    }

    public Book authors(String authors) {
        setAuthors(authors);
        return this;
    }

    public Book description(String description) {
        setDescription(description);
        return this;
    }

    public Book edition(String edition) {
        setEdition(edition);
        return this;
    }

    public Book format(String format) {
        setFormat(format);
        return this;
    }

    public Book pages(int pages) {
        setPages(pages);
        return this;
    }

    public Book rating(double rating) {
        setRating(rating);
        return this;
    }

    public Book ratingCount(int ratingCount) {
        setRatingCount(ratingCount);
        return this;
    }

    public Book reviewCount(int reviewCount) {
        setReviewCount(reviewCount);
        return this;
    }

    public Book genres(String genres) {
        setGenres(genres);
        return this;
    }

    public Book imageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
                .add("bookId", this.getBookid())
                .add("title", this.getTitle())
                .add("authors", this.getAuthors())
                .add("description", this.getDescription())
                .add("edition", this.getEdition())
                .add("format", this.getFormat())
                .add("pages", this.getPages())
                .add("rating", this.getRating())
                .add("ratingCount", this.getRatingCount())
                .add("reviewcount", this.getReviewCount())
                .add("genres", this.getGenres())
                .add("imageUrl", this.getImageUrl())
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(bookid, book.bookid) && Objects.equals(title, book.title)
                && Objects.equals(authors, book.authors) && Objects.equals(description, book.description)
                && Objects.equals(edition, book.edition) && Objects.equals(format, book.format) && pages == book.pages
                && rating == book.rating && ratingCount == book.ratingCount && reviewCount == book.reviewCount
                && Objects.equals(genres, book.genres) && Objects.equals(imageUrl, book.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookid, title, authors, description, edition, format, pages, rating, ratingCount,
                reviewCount, genres, imageUrl);
    }

    @Override
    public String toString() {
        return "{" +
                " bookid='" + getBookid() + "'" +
                ", title='" + getTitle() + "'" +
                ", authors='" + getAuthors() + "'" +
                ", description='" + getDescription() + "'" +
                ", edition='" + getEdition() + "'" +
                ", format='" + getFormat() + "'" +
                ", pages='" + getPages() + "'" +
                ", rating='" + getRating() + "'" +
                ", ratingCount='" + getRatingCount() + "'" +
                ", reviewCount='" + getReviewCount() + "'" +
                ", genres='" + getGenres() + "'" +
                ", imageUrl='" + getImageUrl() + "'" +
                "}";
    }

}

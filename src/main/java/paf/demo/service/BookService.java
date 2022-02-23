package paf.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paf.demo.model.Book;
import paf.demo.repo.BookRepo;

@Service
public class BookService {

    @Autowired
    private BookRepo repo;

    public List<Book> getBooks(int limit) {
        return repo.getBooks(limit);
    }

    public List<Book> getBooks(int limit, int offset) {
        return repo.getBooks(limit, offset);
    }

    public List<Book> getBooksByTitle(String title) {
        return repo.getBooksByTitle(title);
    }

    public int getBookFormatCount(String format) {
        return repo.getBookFormatCount(format);
    }

    public List<String> getFormats() {
        return repo.getFormats();
    }

}

package paf.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import paf.demo.model.Book;
import paf.demo.service.BookService;

@RestController
@RequestMapping(path = "/api/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookRestController {

    private static final Logger logger = LoggerFactory.getLogger(BookRestController.class);

    @Autowired
    private BookService bookSvc;

    @GetMapping
    public ResponseEntity<String> getBooksByRequestParam(
            @RequestParam(defaultValue = "10") int limit,
            @RequestParam(defaultValue = "0") int offset) {
        return getBooks(limit, offset);
    }

    @GetMapping(value = "/{offset}")
    public ResponseEntity<String> getBooksByPathVariable(
            @PathVariable int offset) {
        return getBooks(10, offset);
    }

    private ResponseEntity<String> getBooks(int limit, int offset) {
        try {
            logger.info("Retrieving Page >>>>> " + offset);
            JsonArrayBuilder jab = Json.createArrayBuilder();
            List<Book> books = bookSvc.getBooks(limit, offset);
            for (Book b : books) {
                jab.add(b.toJson());
            }
            return ResponseEntity
                    .ok()
                    .body(jab.build().toString());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(
                            Json.createObjectBuilder()
                                    .add("Error", "Invalid page request.")
                                    .build()
                                    .toString());
        }
    }
}

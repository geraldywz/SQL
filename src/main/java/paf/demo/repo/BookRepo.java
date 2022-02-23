package paf.demo.repo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import paf.demo.model.Book;

@Repository
public class BookRepo {

    private final String db = "book2018";

    @Autowired
    private JdbcTemplate template;

    public List<Book> getBooks(final int limit, final int offset) {
        final List<Book> result = new LinkedList<>();
        final SqlRowSet rs = template.queryForRowSet(
                "SELECT * FROM " + db + " limit ? offset ?", limit, offset);

        while (rs.next()) {
            result.add(
                    new Book(
                            rs.getString("book_id"),
                            rs.getString("title"),
                            rs.getString("authors"),
                            rs.getString("description"),
                            rs.getString("edition"),
                            rs.getString("format"),
                            rs.getInt("pages"),
                            rs.getDouble("rating"),
                            rs.getInt("rating_count"),
                            rs.getInt("review_count"),
                            rs.getString("genres"),
                            rs.getString("image_url")));
        }

        return (Collections.unmodifiableList(result));
    }

}

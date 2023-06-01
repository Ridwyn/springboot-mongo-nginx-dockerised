package in.rai.backend.SpringBootApp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.rai.backend.SpringBootApp.model.Book;
import in.rai.backend.SpringBootApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @PostMapping("/add-book")
    public String saveBook(@RequestBody Book book) {
        bookService.saveByBook(book);
        return "added book with id: " + book.getId();
    }

    @PostMapping("kafka/add-book")
    public String saveBookToKafka(@RequestBody Book book) throws ExecutionException, InterruptedException, JsonProcessingException {

        kafkaTemplate.send("testing", new ObjectMapper().writeValueAsString(book));
        return "added book with id: " + book.getId();
    }

    @GetMapping("/find-all-books")
    public List<Book> getBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/find-by-id/{id}")
    public Optional<Book> getBook(@PathVariable Integer id) {
        return bookService.findBookByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id) {
        bookService.deleteBookByID(id);
        return "Book deleted with ID: " + id;
    }
}

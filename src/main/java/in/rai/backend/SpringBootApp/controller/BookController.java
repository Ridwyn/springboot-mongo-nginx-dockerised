package in.rai.backend.SpringBootApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.rai.backend.SpringBootApp.model.Book;
import in.rai.backend.SpringBootApp.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository repository;
	
	@PostMapping("/add-book")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "added book with id: " + book.getId();
	}
	
	@GetMapping("/find-all-books")
	public List<Book> getBooks(){
		return repository.findAll();
	}
	
	@GetMapping("/find-by-id/{id}")
	public Optional<Book> getBook(@PathVariable Integer id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		repository.deleteById(id);
		return "Book deleted with ID: " + id;
	}
}

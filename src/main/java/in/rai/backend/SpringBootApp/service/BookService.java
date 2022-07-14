package in.rai.backend.SpringBootApp.service;

import java.util.List;
import java.util.Optional;

import in.rai.backend.SpringBootApp.model.Book;

public interface BookService {

	void saveByBook(Book book);
	List<Book> findAllBooks();
	Optional<Book> findBookByID(Integer Id);
	void deleteBookByID(Integer id);
}

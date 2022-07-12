package in.rai.backend.SpringBootApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.rai.backend.SpringBootApp.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

	
}

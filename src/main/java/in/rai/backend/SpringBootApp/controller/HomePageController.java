package in.rai.backend.SpringBootApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/home")
    ResponseEntity<String> getHomePage() {
        return new ResponseEntity<>("This is our Home Page!!", HttpStatus.OK);
    }

    @GetMapping("/")
    ResponseEntity<String> getIndex() {
        return new ResponseEntity<>("Welcome to index!!", HttpStatus.OK);
    }
}

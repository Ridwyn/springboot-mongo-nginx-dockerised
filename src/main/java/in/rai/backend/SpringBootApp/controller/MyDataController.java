package in.rai.backend.SpringBootApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rai.backend.SpringBootApp.model.MyData;

@RestController
public class MyDataController {

	@RequestMapping("/my-data")
	public ResponseEntity<MyData> getMyData() {
		
		MyData myData = new MyData("Rai sahab", 27, "Male");
		return new ResponseEntity<>(myData, HttpStatus.OK);
	}
}

package com.webprojekti.webprojekti;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebprojektiApplication {

	

	@Autowired
	DataRepository dataRepo;

	public static void main(String[] args) {
		SpringApplication.run(WebprojektiApplication.class, args);
	}


	
}
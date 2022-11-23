package com.webprojekti.webprojekti;

public class PersonNotFoundException extends RuntimeException{
    PersonNotFoundException(Long id){
        super("Could not find Person "+ id);
    }
}

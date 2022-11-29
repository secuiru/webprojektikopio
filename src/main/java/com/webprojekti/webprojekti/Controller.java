package com.webprojekti.webprojekti;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

  
    private DataRepository repository2;

  
    Controller(DataRepository repository2){
        this.repository2=repository2;
    }

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/data")List<Dataset>data(){
       
     
        return repository2.findAll();

    }
  

    


}

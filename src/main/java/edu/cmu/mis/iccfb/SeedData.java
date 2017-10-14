package edu.cmu.mis.iccfb;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.mis.iccfb.model.Author;
import edu.cmu.mis.iccfb.service.AuthorService;

@Configuration
public class SeedData {

    @Autowired
    private AuthorService authorService;

    @Bean
    public SeedData getBean() throws SQLException {
    	
        
        Author a1 = new Author(1L, "Douglas Adams");
        Author a2 = new Author(2L, "Gautama Buddha");
        Author a3 = new Author(3L, "Albert Einstein");
        
        authorService.save(a1);
        authorService.save(a2);
        authorService.save(a3);
        
        return new SeedData();
    }
}

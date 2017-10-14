package edu.cmu.mis.iccfb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.mis.iccfb.model.Author;
import edu.cmu.mis.iccfb.service.AuthorService;

@RestController
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;
    
    @RequestMapping("/api/author/{authorId}")
    public Author getAuthor(@PathVariable Long authorId) {
        return authorService.findOne(authorId);
    }
    
    @RequestMapping("/api/author/byname")
    public Author getAuthorByName(@RequestParam("name") String authorName) {
        return authorService.findByName(authorName);
    }
    
    @RequestMapping(value = "/api/author", method = RequestMethod.POST)
    public Author saveAuthor(@RequestBody Author author) {
        this.authorService.save(author);
        return author;
    }
   

}

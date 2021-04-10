package com.springwebapp.spring5webapp.controllers;

import com.springwebapp.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;
    // inject instance of book repository
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(path = "/books")
    public String getBooks(Model model){
        // at run time when a request to "/books execute the get books method"
        // model object instantiated will have an attribute books that will
        // give us a list of books which
        // will get sent back to our view layer that we will return back to the client
        model.addAttribute("books", bookRepository.findAll());
        // look for the list template in the template/books directory
        return "books/list";
    }
}

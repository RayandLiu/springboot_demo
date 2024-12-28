package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getAllBooks(@PathVariable Integer id) {
        System.out.println("id==>"+id);
        return "List of one book";
    }
}

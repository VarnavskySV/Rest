package ru.haulmont.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.haulmont.demo.dto.BookDto;
import ru.haulmont.demo.service.BookResponseService;
import ru.haulmont.demo.service.BookService;
import ru.haulmont.demo.service.repository.BookRepository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookResponseService bookResponseService;
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return new ResponseEntity<>(bookResponseService.getAllBook(), HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<BookDto> create(@RequestParam String name, @RequestParam String datePublish, @RequestParam String producer) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date startDate = new Date();
        try {
            startDate = df.parse(datePublish);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        BookDto bookDto = new BookDto(name, startDate, producer);
        bookService.saveBook(bookDto);
        return new ResponseEntity<>(bookDto, HttpStatus.OK);
    }
}

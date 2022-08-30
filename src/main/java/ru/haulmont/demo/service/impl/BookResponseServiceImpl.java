package ru.haulmont.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


import ru.haulmont.demo.conditional.ProdConditional;
import ru.haulmont.demo.dto.BookDto;
import ru.haulmont.demo.entity.Book;
import ru.haulmont.demo.service.repository.BookRepository;
import ru.haulmont.demo.service.BookResponseService;

import java.util.ArrayList;
import java.util.List;

@Component
@Conditional(ProdConditional.class)
public class BookResponseServiceImpl implements BookResponseService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<BookDto> getAllBook(){

        List<Book> books =bookRepository.findAll();
        List<BookDto> bookDtos = new ArrayList<>();

        books.stream().forEach(b-> {
            BookDto bookDto = new BookDto(b.getName(), b.getDatePublish(), b.getProducer());
            bookDtos.add(bookDto);
        });
        return bookDtos;
    };


}

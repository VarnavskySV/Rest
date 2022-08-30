package ru.haulmont.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.haulmont.demo.dto.BookDto;
import ru.haulmont.demo.entity.Book;
import ru.haulmont.demo.service.repository.BookRepository;

@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void saveBook(BookDto bookDto){
        Book book = new Book(bookDto.getName(), bookDto.getDatePublish(), bookDto.getProducer());
        bookRepository.saveAndFlush(book);
    }
}

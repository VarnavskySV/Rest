package ru.haulmont.demo.service;

import ru.haulmont.demo.dto.BookDto;

import java.util.List;

public interface BookResponseService {

    public List<BookDto> getAllBook();
}

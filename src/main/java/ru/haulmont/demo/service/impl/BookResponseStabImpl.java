package ru.haulmont.demo.service.impl;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import ru.haulmont.demo.conditional.DevConditional;
import ru.haulmont.demo.dto.BookDto;
import ru.haulmont.demo.service.BookResponseService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Conditional(DevConditional.class)
public class BookResponseStabImpl  implements BookResponseService {
    @Override
    public List<BookDto> getAllBook() {
        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(new BookDto("Test", new Date(), "Hest"));
        return bookDtos;
    }
}

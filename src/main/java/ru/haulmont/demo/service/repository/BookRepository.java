package ru.haulmont.demo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.haulmont.demo.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {

    @Override
    List<Book> findAll();
}

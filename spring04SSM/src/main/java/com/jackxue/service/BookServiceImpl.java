package com.jackxue.service;

import com.jackxue.dao.BookMapper;
import com.jackxue.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBooks(Books book) {
        return bookMapper.addBooks(book);
    }

    public int deleteBooksById(int id) {
        return bookMapper.deleteBooksById(id);
    }

    public int updateBooks(Books book) {
        return bookMapper.updateBooks(book);
    }

    public List<Books> getBooks() {
        return bookMapper.getBooks();
    }
}

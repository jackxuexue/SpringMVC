package com.jackxue.service;


import com.jackxue.pojo.Books;

import java.util.List;

public interface BookService {
    public abstract int addBooks(Books book);
    public abstract int deleteBooksById(int id);
    public abstract int updateBooks(Books book);
    public abstract List<Books> getBooks();
}

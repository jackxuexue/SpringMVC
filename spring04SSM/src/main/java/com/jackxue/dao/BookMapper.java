package com.jackxue.dao;

import com.jackxue.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    public abstract int addBooks(Books book);
    public abstract int deleteBooksById(@Param("id") int id);
    public abstract int updateBooks(Books book);
    public abstract List<Books> getBooks();
}

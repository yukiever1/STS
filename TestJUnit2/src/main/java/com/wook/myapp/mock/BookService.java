package com.wook.myapp.mock;

import java.util.List;

public interface BookService {

    List<Book> findBookByAuthor(String author);

}
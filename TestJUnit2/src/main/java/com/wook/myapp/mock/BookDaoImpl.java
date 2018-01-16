package com.wook.myapp.mock;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    @Override
    public List<Book> findBookByAuthor(String name) {
		
    	Book book = new Book("wook");
    	Book book2 = new Book("wook2");
    	Book book3 = new Book("wook3");
    	List<Book> list = new ArrayList<Book>();
    	list.add(book);
    	list.add(book2);
    	list.add(book3);
    	
    	return list;
    	
    }

}
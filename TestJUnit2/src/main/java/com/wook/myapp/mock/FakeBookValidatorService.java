package com.wook.myapp.mock;

public class FakeBookValidatorService implements BookValidatorService {

    @Override
    public boolean isValid(Book book) {
        if (book == null)
            return false;

        if ("bot".equals(book.getName())) {
            return false;
        } else {
            return true;
        }

    }
}
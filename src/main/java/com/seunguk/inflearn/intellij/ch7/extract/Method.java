package com.seunguk.inflearn.intellij.ch7.extract;

import java.util.List;

public class Method {

    public void extractMethod(List<Book> books) {
        for (Book book : books) {
            for (String s : book.getAuthors()) {
                // option + command + m : extract method
                if("seunguk".equals(s)){
                    System.out.println("yes!!");
                }
            }
        }
    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}

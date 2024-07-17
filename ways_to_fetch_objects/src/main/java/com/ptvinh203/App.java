package com.ptvinh203;

import com.ptvinh203.repository.StudentRepository;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        repository.selectAllWithPaging().forEach((e) -> {
            System.out.println(e);
        });
    }
}

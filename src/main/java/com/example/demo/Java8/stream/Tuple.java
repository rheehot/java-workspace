package com.example.demo.Java8.stream;

import lombok.Data;

/**
 * @author Geonguk Han
 * @since 2020-08-28
 */
@Data
public class Tuple {
    private BlogPostType type;
    private String author;

    public Tuple(BlogPostType type, String author) {
        this.type = type;
        this.author = author;
    }
}

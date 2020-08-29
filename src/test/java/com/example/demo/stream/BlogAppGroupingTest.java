package com.example.demo.stream;

import com.example.demo.Java8.stream.BlogPost;
import com.example.demo.Java8.stream.BlogPostType;
import com.example.demo.Java8.stream.Tuple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.stream.Collectors.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author Geonguk Han
 * @since 2020-08-28
 */
public class BlogAppGroupingTest {

    private List<BlogPost> blogPosts;

    @BeforeEach
    void setUp() {
        blogPosts = Arrays.asList(
                new BlogPost("가십거리 뉴스", "앤드류", BlogPostType.NEWS, 3),
                new BlogPost("코로나 긴급 뉴스", "앤드류", BlogPostType.NEWS, 5),
                new BlogPost("스프링 튜토리얼", "케이티", BlogPostType.GUIDE, 10),
                new BlogPost("자바 리뷰", "베티", BlogPostType.REVIEW, 2)
        );
    }


    @Test
    void groupingBy_singleColumn() {
        final Map<String, List<BlogPost>> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getAuthor));

        assertThat(collect.get("앤드류").size()).isEqualTo(2);
    }

    @Test
    void groupingBy_complexMapKeyType() {
        final Map<Tuple, List<BlogPost>> collect = blogPosts.stream()
                .collect(groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));

        final Tuple key = new Tuple(BlogPostType.NEWS, "앤드류");
        assertThat(collect.containsKey(key)).isTrue();
    }

    @Test
    void groupingBy_returnedMapValueType() {
        final Map<BlogPostType, Set<BlogPost>> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getType, toSet()));

        System.out.println(collect);
    }

    @Test
    void groupingBy_multipleFields() {
        final Map<String, Map<BlogPostType, List<BlogPost>>> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getAuthor, groupingBy(BlogPost::getType)));

        System.out.println(collect);
    }

    @Test
    void groupingBy_average() {
        // toIntFunction = T타입 오브젝트 -> int형으로 변경한다.
        final Map<BlogPostType, Double> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getType, averagingInt(BlogPost::getLikes)));
    }

    @Test
    void groupingBy_sum() {
        // toIntFunction = T타입 오브젝트 -> int형으로 변경한다.
        final Map<BlogPostType, Integer> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getType, summingInt(BlogPost::getLikes)));

        System.out.println(collect);
    }

    @Test
    void groupingBy_summarizingInt() {
        final Map<BlogPostType, IntSummaryStatistics> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getType, summarizingInt(BlogPost::getLikes)));

        System.out.println(collect);
    }

    @Test
    void groupingBy_differentType() {
        final Map<BlogPostType, String> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getType, mapping(BlogPost::getTitle, joining(", ", "Post titles: [", "]"))));

        System.out.println(collect);
    }

    @Test
    void groupingBy_enumMapType() {
        final EnumMap<BlogPostType, List<BlogPost>> collect = blogPosts.stream()
                .collect(groupingBy(BlogPost::getType, () -> new EnumMap<>(BlogPostType.class), toList()));

        System.out.println(collect);
    }
}

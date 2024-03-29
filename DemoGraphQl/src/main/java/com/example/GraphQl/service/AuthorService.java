package com.example.GraphQl.service;

import com.example.GraphQl.model.Author;
import com.example.GraphQl.model.Book;
import com.example.GraphQl.repository.AuthorRepository;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Mono<String> createAuthor(String authorName, int age, UUID bookId) {
        Author author = new Author();
        author.setAge(age);
        author.setName(authorName);
        author.setBookId(bookId);
        return authorRepository.createAuthor(author).map(Object::toString);
    }

    public DataFetcher<CompletableFuture<Author>> authorDataFetcher() {
        return env -> {
            Book book = env.getSource();
            return authorRepository.getAuthor(book.getId()).toFuture();
        };
    }
}

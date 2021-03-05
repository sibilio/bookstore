package br.com.mcscloud.bookstoremanager.author.service;

import br.com.mcscloud.bookstoremanager.author.builder.AuthorDtoBuilder;
import br.com.mcscloud.bookstoremanager.author.mapper.AuthorMapper;
import br.com.mcscloud.bookstoremanager.author.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;

    private AuthorDtoBuilder authorDtoBuilder;

    @BeforeEach
    void setUp() {
        authorDtoBuilder = AuthorDtoBuilder.builder().build();
    }
}

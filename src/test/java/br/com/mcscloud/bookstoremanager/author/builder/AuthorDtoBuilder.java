package br.com.mcscloud.bookstoremanager.author.builder;

import br.com.mcscloud.bookstoremanager.author.dto.AuthorDto;
import lombok.Builder;

@Builder
public class AuthorDtoBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Marcos Sibilio";

    @Builder.Default
    private final Integer age = 46;

    public AuthorDto buildAuthorDto() {
        return new AuthorDto(id, name, age);
    }
}

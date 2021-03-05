package br.com.mcscloud.bookstoremanager.author.mapper;

import br.com.mcscloud.bookstoremanager.author.dto.AuthorDto;
import br.com.mcscloud.bookstoremanager.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDto authorDto);

    AuthorDto toDTO(Author author);
}

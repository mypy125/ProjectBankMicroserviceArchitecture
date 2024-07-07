package com.javastart.billservice.mapper;

public interface Mapper <T, D>{
    D toDto(T entity);
    T toEntity(D dto);
}

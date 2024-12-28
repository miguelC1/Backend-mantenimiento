package com.solidev.mantenimientov1.repository;

public interface CustomMap<DTO, E> {
    DTO toDto(E e);
    E toEntity(DTO dto);
}

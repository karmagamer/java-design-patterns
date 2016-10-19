package com.iluwatar.converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by karma on 10/18/2016.
 */
public interface Converter {

    E createFrom(D dto);

    D createFrom(E entity);

    E updateEntity(E entity, D dto);

    default List createFromEntities(final Collection entities) {
        return (List) entities.stream()
                .map(E::new)
                .collect(Collectors.toList());
    }



    default List createFromDtos(final Collection dtos) {
        return (List) dtos.stream()
                .map(D::new)
                .collect(Collectors.toList());
    }
}
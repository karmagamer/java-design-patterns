package com.iluwatar.converter;

/**
 * Created by karma on 10/18/2016.
 */
public interface AccountConverter {


    public Account createFrom(final AccountDto dto);
    public AccountDto createFrom(final Account entity);
    public Account updateEntity(final Account entity, final AccountDto dto);

}



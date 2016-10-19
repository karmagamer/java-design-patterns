package com.iluwatar.converter;

/**
 * Created by karma on 10/18/2016.
 */
public class AccountConverterImpl implements AccountConverter {

    @Override
    public Account createFrom(final AccountDto dto) {
        return updateEntity(new Account(), dto);
    }

    @Override
    public AccountDto createFrom(final Account entity) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountType(entity.getAccountType());
        accountDto.setActive((String) entity.getActive());
        accountDto.setEmail(entity.getUserId());
        ClassUtils.setIfNotNull(
                entity::getPassword, (password) -> accountDto.setPassword((String) password));
        return accountDto;
    }

    @Override
    public Account updateEntity(final Account entity,
                                final AccountDto dto) {
        entity.setUserId((String) dto.getEmail());
        entity.setActive((String) dto.getActive());
        ClassUtils.setIfNotNull(
                dto::getAccountType, entity::setAccountType);
        return entity;
    }
}

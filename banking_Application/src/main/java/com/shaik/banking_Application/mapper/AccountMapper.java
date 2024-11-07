package com.shaik.banking_Application.mapper;

import com.shaik.banking_Application.dto.AccountDto;
import com.shaik.banking_Application.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {

        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccount_holder_name(),
                accountDto.getBalance()

        );
        return account;

    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()

        );
        return accountDto;
    }


}

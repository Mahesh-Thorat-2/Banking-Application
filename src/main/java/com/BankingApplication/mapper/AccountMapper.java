package com.BankingApplication.mapper;

import com.BankingApplication.dto.AccountDto;
import com.BankingApplication.entity.Account;

public class AccountMapper {

	// method to convert/transfer AccountDto data into Account data
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(accountDto.getId(), accountDto.getAccountHolderName(), accountDto.getBalance());

		return account;
	}

	// method to convert/Transfer Data from Account to AccountDto
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());
		return accountDto;
	}

}

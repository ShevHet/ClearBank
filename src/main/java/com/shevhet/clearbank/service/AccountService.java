package com.shevhet.clearbank.service;

import com.shevhet.clearbank.dto.*;

import java.util.List;

public interface AccountService {

    AccountDTO createAccount(AccountRequest accountRequest);

    AccountDTO deposit(DepositRequest depositRequest);

    List<AccountDTO> getAllAccounts();

    AccountDTO withdraw(WithdrawRequest withdrawRequest);

    void transfer(TransferRequest transferRequest);
}

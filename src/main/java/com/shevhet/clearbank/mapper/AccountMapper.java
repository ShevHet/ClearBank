package com.shevhet.clearbank.mapper;

import com.shevhet.clearbank.dto.AccountDTO;
import com.shevhet.clearbank.dto.DepositRequest;
import com.shevhet.clearbank.dto.TransferRequest;
import com.shevhet.clearbank.dto.WithdrawRequest;
import com.shevhet.clearbank.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface AccountMapper {

    AccountDTO toAccountDTO(Account account);

    @Mapping(target = "id", source = "from")
    WithdrawRequest toWithdrawRequest(TransferRequest transferRequest);

    @Mapping(target = "id", source = "to")
    DepositRequest toDepositRequest(TransferRequest transferRequest);

    List<AccountDTO> toAccountsDTO(List<Account> accounts);
}

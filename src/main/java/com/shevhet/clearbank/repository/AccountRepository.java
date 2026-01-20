package com.shevhet.clearbank.repository;

import com.shevhet.clearbank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

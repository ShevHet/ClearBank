package com.shevhet.clearbank.service;

import com.shevhet.clearbank.entity.LogEntry;
import com.shevhet.clearbank.repository.LogEntryRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class AccountAuditServiceImpl implements AccountAuditService {
    private final LogEntryRepository logEntryRepository;

    public AccountAuditServiceImpl(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }

    @Override
    public void logAccountCreation(String accountName) {
        logToDatabase("INFO",
                "Created account: " + accountName);
    }

    @Override
    public void logAccountDeposit(String accountName, BigDecimal amount) {
        logToDatabase("INFO", "Deposited " + amount + " to account: " + accountName);
    }

    @Override
    public void logAccountWithdraw(String accountName, BigDecimal amount) {
        logToDatabase("INFO", "Withdrawn " + amount + " from account: " + accountName);
    }

    private void logToDatabase(String logLevel, String message) {
        LogEntry logEntry = new LogEntry();
        logEntry.setTimestamp(new Date());
        logEntry.setLogLevel(logLevel);
        logEntry.setMessage(message);
        logEntryRepository.save(logEntry);
    }
}


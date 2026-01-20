package com.shevhet.clearbank.dto;

import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record AccountDTO(Long id, String name, @Positive BigDecimal balance) {

}

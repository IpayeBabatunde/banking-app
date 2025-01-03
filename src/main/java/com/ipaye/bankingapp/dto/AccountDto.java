package com.ipaye.bankingapp.dto;

public record AccountDto(Long id,
                         String accountHolderName,
                         double balance) {
}

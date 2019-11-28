package net.msm.pfin.model.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccountType {
    DEBIT_CARD(0L, "Debit card account"),
    CREDIT_CARD(1L, "Credit Card account"),
    SAVINGS(2L, "Savings Account");
    
    private long id;
    private String name;
}

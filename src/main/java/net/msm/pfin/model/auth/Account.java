package net.msm.pfin.model.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    Long userId;
    String accountName;
    String accountNumber;
    AccountType type;
    Double balance;
    Double lastDebit;
    Double lastCredit;
    String checksum;
}

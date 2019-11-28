@Data
@Builder
@NoArgConstractor
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

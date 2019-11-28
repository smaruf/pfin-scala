@Getter
@AllArgsConstructor
public enum AccountType {
    DEBIT_CARD(0, "Debit card account"),
    CREDIT_CARD(1, "Credit Card account"),
    SAVINGS(2, "Savings Account"),
    
    private Long id;
    private String name;
}

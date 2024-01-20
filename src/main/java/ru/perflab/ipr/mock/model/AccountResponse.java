package ru.perflab.ipr.mock.model;

import java.math.BigDecimal;

public class AccountResponse {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private BigDecimal balance;
    private BigDecimal maxLimit;

    public AccountResponse(String rqUID, String clientId, String account, String currency, BigDecimal balance, BigDecimal maxLimit) {
        this.rqUID = rqUID;
        this.clientId = clientId;
        this.account = account;
        this.currency = currency;
        this.balance = balance;
        this.maxLimit = maxLimit;
    }

    public String getRqUID() {
        return rqUID;
    }

    public void setRqUID(String rqUID) {
        this.rqUID = rqUID;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(BigDecimal maxLimit) {
        this.maxLimit = maxLimit;
    }

    public String toString() {
        return "AccountResponse{\n" +
                "rqUID=" + rqUID + "\n" +
                "clientId=" + clientId + "\n" +
                "account=" + account + "\n" +
                "currency=" + currency + "\n" +
                "balance=" + balance + "\n" +
                "maxLimit=" + maxLimit + "\n}";
    }
}

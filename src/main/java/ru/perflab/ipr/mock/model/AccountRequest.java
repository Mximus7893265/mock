package ru.perflab.ipr.mock.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountRequest {
    private String clientId;
    private String account;
    private String rqUID;
    private LocalDate openDate;
    private LocalDate closeDate;

    public AccountRequest(String clientId, String account, String rqUID, LocalDate openDate, LocalDate closeDate) {
        this.clientId = clientId;
        this.account = account;
        this.rqUID = rqUID;
        this.openDate = openDate;
        this.closeDate = closeDate;
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

    public String getRqUID() {
        return rqUID;
    }

    public void setRqUID(String rqUID) {
        this.rqUID = rqUID;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    @Override
    public String toString() {
        return "AccountRequest{\n" +
                "clientId=" + clientId + "\n" +
                "account=" + account + "\n" +
                "rqUID=" + rqUID + "\n" +
                "openDate=" + openDate.toString() + "\n" +
                "closeDate=" + closeDate.toString() + "\n}";
    }
}

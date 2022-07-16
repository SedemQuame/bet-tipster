package com.vision.Tipster;

public class Payments {
    @Id private String paymentsId;
    private String paymentsDate;
    private String transactionAmount;
    private String slipId;
    private User client;
    private User vendor;

    public Payments(String paymentsId, String paymentsDate, String transactionAmount, String slipId, User client, User vendor) {
        this.paymentsId = paymentsId;
        this.paymentsDate = paymentsDate;
        this.transactionAmount = transactionAmount;
        this.slipId = slipId;
        this.client = client;
        this.vendor = vendor;
    }

    public String getPaymentsDate() {
        return paymentsDate;
    }

    public void setPaymentsDate(String paymentsDate) {
        this.paymentsDate = paymentsDate;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getSlipId() {
        return slipId;
    }

    public void setSlipId(String slipId) {
        this.slipId = slipId;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getVendor() {
        return vendor;
    }

    public void setVendor(User vendor) {
        this.vendor = vendor;
    }
}
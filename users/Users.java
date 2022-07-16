package com.vision.Tipster;

public class Users {
    @Id private String id;
    private String username;
    private String socialLoginId;
    private Payments paymentData;
    private List<String> usedSlips;
    private List<String> createdSlips;

    public Users(String id, String username, String socialLoginId, Payments paymentData, List<String> usedSlips, List<String> createdSlips) {
        this.id = id;
        this.username = username;
        this.socialLoginId = socialLoginId;
        this.paymentData = paymentData;
        this.usedSlips = usedSlips;
        this.createdSlips = createdSlips;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSocialLoginId() {
        return socialLoginId;
    }

    public void setSocialLoginId(String socialLoginId) {
        this.socialLoginId = socialLoginId;
    }

    public Payments getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(Payments paymentData) {
        this.paymentData = paymentData;
    }

    public List<String> getUsedSlips() {
        return usedSlips;
    }

    public void setUsedSlips(List<String> usedSlips) {
        this.usedSlips = usedSlips;
    }

    public List<String> getCreatedSlips() {
        return createdSlips;
    }

    public void setCreatedSlips(List<String> createdSlips) {
        this.createdSlips = createdSlips;
    }
}
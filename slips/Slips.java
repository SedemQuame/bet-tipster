package com.vision.Tipster;

public class Slips {
    @Id private String slipId;
    private String creatorId;
    private String dateCreated;
    private String category;
    private String status;
    private String slipImageUrl;
    private String betBookingWebsiteURL;
    private String betBookingCode;
    private String linkToSlipOnBookingWebsite;
    private double price;
    private boolean isPaid;

    public Slips(String slipId, String creatorId, String dateCreated, String category, String status, String slipImageUrl, String betBookingWebsiteURL, String betBookingCode, String linkToSlipOnBookingWebsite, double price, boolean isPaid) {
        this.slipId = slipId;
        this.creatorId = creatorId;
        this.dateCreated = dateCreated;
        this.category = category;
        this.status = status;
        this.slipImageUrl = slipImageUrl;
        this.betBookingWebsiteURL = betBookingWebsiteURL;
        this.betBookingCode = betBookingCode;
        this.linkToSlipOnBookingWebsite = linkToSlipOnBookingWebsite;
        this.price = price;
        this.isPaid = isPaid;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSlipImageUrl() {
        return slipImageUrl;
    }

    public void setSlipImageUrl(String slipImageUrl) {
        this.slipImageUrl = slipImageUrl;
    }

    public String getBetBookingWebsiteURL() {
        return betBookingWebsiteURL;
    }

    public void setBetBookingWebsiteURL(String betBookingWebsiteURL) {
        this.betBookingWebsiteURL = betBookingWebsiteURL;
    }

    public String getBetBookingCode() {
        return betBookingCode;
    }

    public void setBetBookingCode(String betBookingCode) {
        this.betBookingCode = betBookingCode;
    }

    public String getLinkToSlipOnBookingWebsite() {
        return linkToSlipOnBookingWebsite;
    }

    public void setLinkToSlipOnBookingWebsite(String linkToSlipOnBookingWebsite) {
        this.linkToSlipOnBookingWebsite = linkToSlipOnBookingWebsite;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
package com.example.cs445_project;

/**
 * The PaymentMethod class is used to add credit and debit card information to users.
 */
public class PaymentMethod {
    private String cardType;
    private String cardNumber;
    private String expirationDate;

    public PaymentMethod(String cardType, String cardNumber, String expirationDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    // Getters and Setters

    public String getType() {
        return cardType;
    }

    public void setType(String type) {
        this.cardType = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
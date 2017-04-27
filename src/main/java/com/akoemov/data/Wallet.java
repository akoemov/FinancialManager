package com.akoemov.data;


import java.io.Serializable;

public class Wallet implements Serializable {

    public enum TYPE {
        CASH, CARD
    }

    public enum CURRENCY {
        RUB, EUR, USD
    }

    private Wallet.TYPE type;

    private Double balance;

    private String name;

    private Wallet.CURRENCY currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CURRENCY getCurrency() {
        return currency;
    }

    public void setCurrency(CURRENCY currency) {
        this.currency = currency;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Wallet(TYPE type, Double balance) {
        this.type = type;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "type=" + type +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wallet wallet = (Wallet) o;

        if (type != wallet.type) return false;
        if (balance != null ? !balance.equals(wallet.balance) : wallet.balance != null) return false;
        if (name != null ? !name.equals(wallet.name) : wallet.name != null) return false;
        return currency == wallet.currency;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}

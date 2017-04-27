package com.akoemov.data;


import java.io.Serializable;
import java.util.Date;

public class Action implements Serializable {

    public enum TYPE {
        INCOME, COSTS, TRANSFER
    }

    private Action.TYPE type;

    private Date executionDate;

    private Wallet wallet;

    private Double summ;

    private String category;

    private String description;

    @Override
    public String toString() {
        return "Action{" +
                "type=" + type +
                ", executionDate=" + executionDate +
                ", wallet=" + wallet +
                ", summ=" + summ +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Double getSumm() {
        return summ;
    }

    public void setSumm(Double summ) {
        this.summ = summ;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Action action = (Action) o;

        if (type != action.type) return false;
        if (executionDate != null ? !executionDate.equals(action.executionDate) : action.executionDate != null)
            return false;
        if (wallet != null ? !wallet.equals(action.wallet) : action.wallet != null) return false;
        if (summ != null ? !summ.equals(action.summ) : action.summ != null) return false;
        if (category != null ? !category.equals(action.category) : action.category != null) return false;
        return description != null ? description.equals(action.description) : action.description == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (executionDate != null ? executionDate.hashCode() : 0);
        result = 31 * result + (wallet != null ? wallet.hashCode() : 0);
        result = 31 * result + (summ != null ? summ.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}

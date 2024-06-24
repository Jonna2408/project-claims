package com.claimservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "reserve")
public class Reserve {

    @Id
    @Column(name = "id_reserve")
    private int idReserve;

    @Column(name = "sinister_date")
    private String sinisterDate;

    @Column(name = "value")
    private String value;

    @Column(name = "expenses_incurred")
    private String expensesIncurred;

    @Column(name = "uncovered_expenses")
    private String uncoveredExpenses;

    @Column(name = "coinsurance")
    private String coinsurance;

    @Column(name = "deductible")
    private String deductible;

    @Column(name = "refund")
    private String refund;

    @Column(name = "claim_id")
    private int claimId;

    public int getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(int idReserve) {
        this.idReserve = idReserve;
    }

    public String getSinisterDate() {
        return sinisterDate;
    }

    public void setSinisterDate(String sinisterDate) {
        this.sinisterDate = sinisterDate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExpensesIncurred() {
        return expensesIncurred;
    }

    public void setExpensesIncurred(String expensesIncurred) {
        this.expensesIncurred = expensesIncurred;
    }

    public String getUncoveredExpenses() {
        return uncoveredExpenses;
    }

    public void setUncoveredExpenses(String uncoveredExpenses) {
        this.uncoveredExpenses = uncoveredExpenses;
    }

    public String getCoinsurance() {
        return coinsurance;
    }

    public void setCoinsurance(String coinsurance) {
        this.coinsurance = coinsurance;
    }

    public String getDeductible() {
        return deductible;
    }

    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }
}

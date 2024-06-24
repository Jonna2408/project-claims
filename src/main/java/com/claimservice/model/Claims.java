package com.claimservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="claims")
public class Claims {


    @Id
    @Column(name ="id_claim")
    private int idClaim;

    @Column(name ="cod")
    private int cod;

    @Column(name = "description")
    private String description;

    @Column(name = "state")
    private String state;

    @Column(name ="creation_date")
    private String creationDate;

    @Column(name ="sinister_date")
    private String sinisterDate;

    @Column(name = "insured_id")
    private int insuredId;

    @Column(name = "beneficiary_id")
    private int beneficiaryId;

    @Column(name = "diagnostic_id")
    private String diagnosticId;

    @Column(name = "analyst_id")
    private int analystId;

    @Column(name = "canceled_date")
    private String canceledDate;

    public int getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getSinisterDate() {
        return sinisterDate;
    }

    public void setSinisterDate(String sinisterDate) {
        this.sinisterDate = sinisterDate;
    }

    public int getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(int insuredId) {
        this.insuredId = insuredId;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(int beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(String diagnosticId) {
        this.diagnosticId = diagnosticId;
    }

    public int getAnalystId() {
        return analystId;
    }

    public void setAnalystId(int analystId) {
        this.analystId = analystId;
    }

    public String getCanceledDate() {
        return canceledDate;
    }

    public void setCanceledDate(String canceledDate) {
        this.canceledDate = canceledDate;
    }
}

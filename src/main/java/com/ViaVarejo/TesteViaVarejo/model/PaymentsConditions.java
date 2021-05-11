package com.ViaVarejo.TesteViaVarejo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

public class PaymentsConditions {

    @JsonProperty("valorEntrada")
    private Double downPayment;

    @JsonProperty("qtdeParcelas")
    private Integer parcels;

    public Double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    public Integer getParcels() {
        return parcels;
    }

    public void setParcels(Integer parcels) {
        this.parcels = parcels;
    }

    @Override
    public String toString() {
        return "PaymentsConditions{" +
                "downPayment=" + downPayment +
                ", parcels=" + parcels +
                '}';
    }
}

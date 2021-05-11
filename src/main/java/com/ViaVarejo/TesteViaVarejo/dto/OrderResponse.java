package com.ViaVarejo.TesteViaVarejo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javafx.scene.layout.BorderRepeat;

import java.util.ArrayList;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class OrderResponse {

    @JsonProperty("numeroParcela")
    private Integer parcelNumber;

    @JsonProperty("valor")
    private Double value;

    @JsonProperty("taxaJurosAoMes")
    private Double interestRate;

    public OrderResponse(Integer parcelNumber, Double value, Double interestRate){
        this.parcelNumber = parcelNumber;
        this.value = value;
        this.interestRate = interestRate;
    }



    public Integer getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelNumber(Integer parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}

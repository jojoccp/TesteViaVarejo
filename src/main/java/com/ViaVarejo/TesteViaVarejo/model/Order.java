package com.ViaVarejo.TesteViaVarejo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;


public class Order {
    @JsonProperty("condicaoPagamento")
    private PaymentsConditions paymentsConditions;

    @JsonProperty("produto")
    private Product product;

    public PaymentsConditions getPaymentsConditions() {
        return this.paymentsConditions;
    }

    public void setPaymentsConditions(PaymentsConditions paymentsConditions) {
        this.paymentsConditions = paymentsConditions;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "Order{" +
                "paymentsConditions=" + paymentsConditions +
                ", product=" + product +
                '}';
    }
}

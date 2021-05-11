package com.ViaVarejo.TesteViaVarejo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;


public class Product {

    @JsonProperty("codigo")
    private Integer code;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("valor")
    private Double value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

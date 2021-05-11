package com.ViaVarejo.TesteViaVarejo.service;


import com.ViaVarejo.TesteViaVarejo.dto.OrderResponse;
import com.ViaVarejo.TesteViaVarejo.model.Order;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {


//    public OrderResponse create(Order order) {
//
//        int parcels = order.getPaymentsConditions().getParcels();
//        double value = order.getProduct().getValue();
//        double downPayment = order.getPaymentsConditions().getDownPayment();
//        double selicRate = 0.0115;
//
//        double parcelValue = (value-downPayment)/parcels;
//
//        order.setProduct(order.getProduct());
//        order.setPaymentsConditions(order.getPaymentsConditions());
//
////        return new OrderResponse(order.getPaymentsConditions().getParcels(), order.getProduct().getValue(), selicRate);
//
//
//        if(parcels >= 6){
//            parcelValue += parcelValue *= selicRate;
//        } else {
//            selicRate = 0;
//        }
//
//        System.out.println(parcelValue);
//
//        return new OrderResponse(parcels, parcelValue, selicRate);
//
//    }




    public List<OrderResponse> create(Order order) {

        DecimalFormat df = new DecimalFormat("#,###.00");
        List<OrderResponse> listar = new ArrayList<>();

        int parcels = order.getPaymentsConditions().getParcels();
        double value = order.getProduct().getValue();
        double downPayment = order.getPaymentsConditions().getDownPayment();
        double selicRate = 0.0115;
        double parceledValue = value - downPayment;

        double interestedRate =  parceledValue + (parceledValue * selicRate);
        double parcelValue = 0;

        order.setProduct(order.getProduct());
        order.setPaymentsConditions(order.getPaymentsConditions());



        for(int i = 1; i <= parcels; i++){

            if(parcels >= 6){
                parcelValue = interestedRate/parcels;
            } else {
                selicRate = 0;
            }

            OrderResponse novo = new OrderResponse(i, Double.parseDouble(df.format(parcelValue)), selicRate);

            listar.add(novo);

//            parcelValue = (value-downPayment)/parcels;

        }



        return listar;

    }



}

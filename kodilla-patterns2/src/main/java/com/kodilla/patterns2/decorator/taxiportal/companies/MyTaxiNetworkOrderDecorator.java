package com.kodilla.patterns2.decorator.taxiportal.companies;

import com.kodilla.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost(){
        //hardcoded stub cost = 35
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " by MyTaxi Network";
    }

}

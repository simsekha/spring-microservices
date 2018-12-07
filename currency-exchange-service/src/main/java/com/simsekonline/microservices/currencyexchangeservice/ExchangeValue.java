package com.simsekonline.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {

    public ExchangeValue() {
    }

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private int port;

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return this.conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

}
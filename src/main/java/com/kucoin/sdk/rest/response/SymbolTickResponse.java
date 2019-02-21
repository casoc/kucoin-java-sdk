/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.response;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author: yi.yang
 * @date: Created by yi.yang on 2018/12/26.
 * @Description:
 */
@Data
public class SymbolTickResponse {

    private String symbol;

    private BigDecimal changeRate;

    private BigDecimal changePrice;

    private BigDecimal open;

    private BigDecimal close;

    private BigDecimal high;

    private BigDecimal low;

    private BigDecimal vol;

    private BigDecimal volValue;

    private BigDecimal last;

    private BigDecimal buy;

    private BigDecimal sell;

    private long time;

}

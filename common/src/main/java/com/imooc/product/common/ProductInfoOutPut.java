package com.imooc.product.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author bizy
 * @date 2020/5/5 17:58
 */
@Data
public class ProductInfoOutPut {

    private String productId;

    /*商品名称*/
    private String productName;

    /*单价*/
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 商品状态 0正常 1下架 */
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;
}

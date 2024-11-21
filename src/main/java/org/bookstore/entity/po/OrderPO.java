package org.bookstore.entity.po;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tb_order")
public class OrderPO extends BasePO {

    /**
     * 用户Id
     */
    private Integer userId;

    /**
     * 订单状态，待支付、已支付、已发货、已签收
     */
    private Integer status;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

}

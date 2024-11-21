package org.bookstore.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tb_order")
public class OrderDetailPO extends BasePO {

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 书本Id
     */
    private Integer bookId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 价格
     */
    private BigDecimal price;

}

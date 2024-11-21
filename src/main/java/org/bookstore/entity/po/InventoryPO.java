package org.bookstore.entity.po;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tb_inventory")
public class InventoryPO extends BasePO {

    /**
     * 书籍ID
     */
    private Integer bookId;

    /**
     * 库存
     */
    private Integer stock;

}

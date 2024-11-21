package org.bookstore.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tb_book")
public class BookPO extends BasePO {

    /**
     * 书名
     */
    private String bookName;

    /**
     * 作者
     */
    private String author;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 出版时间
     */
    private String publicationDate;

    /**
     * 类别
     */
    private String category;

}

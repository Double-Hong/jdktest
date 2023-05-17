package com.example.jdktest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Double-Hong
 * @since 2023-05-17 17:21:18
 */
@Data
@Getter
@Setter
@Accessors(chain = true)
@TableName("financial_management")
@ApiModel(value = "FinancialManagementEntity对象", description = "")
public class FinancialManagementEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("my_time")
    private LocalDateTime myTime;

    @TableField("my_event")
    private String myEvent;

    @TableField("consume_type")
    private String consumeType;

    @TableField("consume_money")
    private Double consumeMoney;

    @TableField("consume_status")
    private Boolean consumeStatus;


}

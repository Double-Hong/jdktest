package com.example.jdktest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@TableName("user")
@ApiModel(value = "UserEntity对象", description = "")
public class UserEntity {

    @TableId(value = "user_name", type = IdType.AUTO)
    private String userName;

    @TableField("my_name")
    private String myName;

    @TableField("sex")
    private String sex;

    @TableField("age")
    private Integer age;

    @TableField("birthday")
    private LocalDate birthday;

    @TableField("address")
    private String address;

    @TableField("phone")
    private BigDecimal phone;

    @TableField("Q_Q")
    private BigDecimal qQ;

    @TableField("profession")
    private String profession;

    @TableField("`password`")
    private String password;


}

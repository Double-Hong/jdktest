package com.example.jdktest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("address_book")
@ApiModel(value = "AddressBookEntity对象", description = "")
public class AddressBookEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("contact_person_name")
    private String contactPersonName;

    @TableField("relation")
    private String relation;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @TableField("remark")
    private String remark;

    @TableField("qq")
    private String qq;


}

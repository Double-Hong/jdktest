package com.example.jdktest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalTime;
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
@TableName("memo_of_schedule")
@ApiModel(value = "MemoOfScheduleEntity对象", description = "")
public class MemoOfScheduleEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("begin_time")
    private LocalTime beginTime;

    @TableField("end_time")
    private LocalTime endTime;

    @TableField("address")
    private String address;

    @TableField("my_event")
    private String myEvent;

    @TableField("completion_status")
    private Boolean completionStatus;

    @TableField("event_date")
    private LocalDate eventDate;

    @TableField("event_describe")
    private String eventDescribe;


}

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
@TableName("personal_mission_plan")
@ApiModel(value = "PersonalMissionPlanEntity对象", description = "")
public class PersonalMissionPlanEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("my_event_name")
    private String myEventName;

    @TableField("event_describe")
    private String eventDescribe;

    @TableField("end_time")
    private LocalDateTime endTime;

    @TableField("completion_status")
    private Boolean completionStatus;


}

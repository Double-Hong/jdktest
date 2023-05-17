package com.example.jdktest.mapper;

import com.example.jdktest.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Double-Hong
 * @since 2023-05-17 17:21:18
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}

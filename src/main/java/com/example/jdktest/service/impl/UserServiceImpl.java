package com.example.jdktest.service.impl;

import com.example.jdktest.entity.UserEntity;
import com.example.jdktest.mapper.UserMapper;
import com.example.jdktest.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Double-Hong
 * @since 2023-05-17 17:21:18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}

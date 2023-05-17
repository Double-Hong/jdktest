package com.example.jdktest.service.impl;

import com.example.jdktest.entity.AddressBookEntity;
import com.example.jdktest.mapper.AddressBookMapper;
import com.example.jdktest.service.AddressBookService;
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
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBookEntity> implements AddressBookService {

}

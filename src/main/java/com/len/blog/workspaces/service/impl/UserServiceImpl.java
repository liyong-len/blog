package com.len.blog.workspaces.service.impl;

import com.len.blog.workspaces.entity.User;
import com.len.blog.workspaces.mapper.UserMapper;
import com.len.blog.workspaces.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liyong
 * @since 2020-09-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

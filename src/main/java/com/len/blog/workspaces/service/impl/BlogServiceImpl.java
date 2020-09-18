package com.len.blog.workspaces.service.impl;

import com.len.blog.workspaces.entity.Blog;
import com.len.blog.workspaces.mapper.BlogMapper;
import com.len.blog.workspaces.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}

package com.len.blog.workspaces.controller;


import com.google.common.collect.Lists;
import com.len.blog.annotation.log.RequsetLog;
import com.len.blog.core.Result;
import com.len.blog.workspaces.entity.User;
import com.len.blog.workspaces.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liyong
 * @since 2020-09-18
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户控制器")
public class UserController {

    @Resource
    IUserService userService;

    @RequsetLog(description = "新增用户信息")
    @ApiOperation(value = "新增用户信息", notes = "返回新增对象")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Result save(@RequestBody User user) {
        return Result.ok(userService.save(user));
    }

    @RequsetLog(description = "根据Id删除用户信息")
    @ApiOperation(value = "根据Id删除用户信息", notes = "返回查询对象")
    @RequestMapping(value = "delete/{ids}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String[] ids) {
        return Result.ok(userService.removeByIds(Lists.newArrayList(ids)));
    }

    @RequsetLog(description = "修改用户信息")
    @ApiOperation(value = "修改用户信息", notes = "返回修改后对象")
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public Result update(@RequestBody User user) {
        return Result.ok(userService.updateById(user));
    }

    @RequsetLog(description = "根据Id获取用户信息")
    @ApiOperation(value = "根据Id获取用户信息", notes = "返回查询对象")
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Result getById(@RequestParam String id) {
        return Result.ok(userService.getById(id));
    }

    @RequsetLog(description = "获取用户信息列表")
    @ApiOperation(value = "获取用户信息列表", notes = "返回查询对象集合")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Result list() {
        return Result.ok(userService.list());
    }

}

package com.len.blog.workspaces.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author liyong
 * @since 2020-09-18
 */
@Data
@Accessors(chain = true)
@TableName("m_user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String username;

//    private String avatar;

    private String email;

    private String password;

    private Integer status;

    private Date created;

//    private LocalDateTime lastLogin;


}

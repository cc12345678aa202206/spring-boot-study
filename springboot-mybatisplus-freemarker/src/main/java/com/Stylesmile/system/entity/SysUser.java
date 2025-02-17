package com.Stylesmile.system.entity;

import com.Stylesmile.common.entity.BaseEntity;
import lombok.Data;
import org.w3c.dom.Entity;

import javax.validation.constraints.NotEmpty;

/**
 * @author chenye
 * @date 2018/12/10
 */
@Data
public class SysUser extends BaseEntity {

    private String id;
    @NotEmpty(message = "登录名不能为空")
    private String username;
    @NotEmpty(message = "用户名称不能为空")
    private String nickname;
    @NotEmpty(message = "密码不能为空")
    //@Length(min = 6, message = "密码长度不能小于6位")
    private String password;
    private String phone;
    private String email;
    public SysUser(){}
    public SysUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

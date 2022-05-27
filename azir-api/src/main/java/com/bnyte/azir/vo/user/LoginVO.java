package com.bnyte.azir.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author bnyte
 * @since 2022/5/27 16:31
 */
@ApiModel("登录")
public class LoginVO {

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty("登录用户名")
    private String account;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码不能为空")
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

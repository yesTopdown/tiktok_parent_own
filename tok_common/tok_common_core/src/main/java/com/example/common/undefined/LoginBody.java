package com.example.common.undefined;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * title: LoginBody
 * description: TODO
 * 用户登录对象
 * @author iok_own
 * date 2023/10/18 11:04
 */
@Data
public class LoginBody {
    /**
     * 租户ID
     */
    @NotBlank(message = "{tenant.number.not.blank}")
    private String tenantId;

    /**
     * 用户名
     */
    @NotBlank(message = "{user.username.not.blank}")
    private String username;

    /**
     * 用户密码
     */
    @NotBlank(message = "{user.password.not.blank}")
    private String password;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid;
}

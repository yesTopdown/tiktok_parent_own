package com.example.common.undefined;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * title: EmailLoginBody
 * description: TODO
 * 短信登录对象
 * @author iok_own
 * date 2023/10/18 11:03
 */
@Data
public class EmailLoginBody {
    /**
     * 租户ID
     */
    @NotBlank(message = "{tenant.number.not.blank}")
    private String tenantId;

    /**
     * 邮箱
     */
    @NotBlank(message = "{user.email.not.blank}")
    @Email(message = "{user.email.not.valid}")
    private String email;

    /**
     * 邮箱code
     */
    @NotBlank(message = "{email.code.not.blank}")
    private String emailCode;

}

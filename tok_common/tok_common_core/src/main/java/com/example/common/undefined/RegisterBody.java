package com.example.common.undefined;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户注册对象
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RegisterBody extends LoginBody {

    private String userType;

}

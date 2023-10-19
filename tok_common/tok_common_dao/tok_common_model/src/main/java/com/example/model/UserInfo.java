package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * title: UserInfo
 * description:
 *
 * @author iok_own
 * date 2023/10/19 10:11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo implements Id<Long>{
    public static final int USER_TYPE_PLATFORM = 0;
    public static final int USER_TYPE_CLIENT = 1;

    private Long id;

    /**
     * 用户账号
     */
    private String uid;

    /**
     * 归属账号
     */
    private String ownerId;

    /**
     * 密钥（密码加密后的内容）
     */
    private String secret;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 性别 0-未知 1-male,2-female
     */
    private Integer gender;

    /**
     * 头像地址
     */
    private String avatarUrl;

    private String email;

    private String address;

    /**
     * 当前家庭Id
     */
    private String currHomeId;

    /**
     * 用户类型
     * 0:平台用户
     * 1:终端用户
     */
    private Integer type;

    /**
     * 角色
     */
    private List<String> roles = new ArrayList<>();

    /**
     * 权限
     */
    private List<String> permissions = new ArrayList<>();

    /**
     * 用户使用的平台
     * 见:Constants.THIRD_PLATFORM
     */
    private List<String> usePlatforms = new ArrayList<>();

    private Long createAt;
}

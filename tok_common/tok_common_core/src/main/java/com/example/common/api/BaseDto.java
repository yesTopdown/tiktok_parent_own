package com.example.common.api;

import com.example.common.utils.MapstructUtils;

import java.util.Date;

/**
 * title: BaseDto
 * description: TODO Entity 基类
 * @author iok_own
 * date 2023/10/18 9:38
 */
public class BaseDto {
    /**
     * 创建部门
     */

    private Long createDept;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    public <T> T to(Class<T> tClass) {
        return MapstructUtils.convert(this, tClass);
    }
}

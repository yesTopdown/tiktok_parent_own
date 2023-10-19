package com.example.model;

import com.example.common.utils.MapstructUtils;
import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * title: BaseModel
 * description: TODO
 * Entity 基类
 * @author iok_own
 * date 2023/10/19 9:39
 */
@Data
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

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
    public <T> T to(Class<T> tClass){
        return MapstructUtils.convert(this,tClass);
    }

}

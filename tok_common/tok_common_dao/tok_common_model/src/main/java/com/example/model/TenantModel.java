package com.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * title: TenantModel
 * description:
 *
 * @author iok_own
 * date 2023/10/19 10:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantModel extends BaseModel{
    /**
     * 租户编号
     */
    private String tenantId;
}

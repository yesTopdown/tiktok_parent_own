package com.example.common.utils.ip;

import cn.hutool.core.net.NetUtil;
import cn.hutool.http.HtmlUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * title: AddressUtils
 * description: TODO
 * 获取地址工具类
 * @author iok_own
 * date 2023/10/18 9:46
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AddressUtils {
    //未知地址
    public static final String UNKNOWN="XX XX";

    public static String getRealAddressByIP(String ip){
        if(StringUtils.isBlank(ip)){
            return UNKNOWN;
        }
        //内网不查询
        ip= "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : HtmlUtil.cleanHtmlTag(ip);
        if(NetUtil.isInnerIP(ip)){
            return "内网IP";
        }
       return RegionUtils.getCityInfo(ip);
    }

}

package com.example.common.utils.ip;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.ObjectUtil;
import com.example.common.exception.BizException;
import com.example.common.utils.file.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.lionsoul.ip2region.xdb.Searcher;

import java.io.File;

/**
 * title: RegionUtils
 * description: TODO
 * 根据ip地址定位工具类，离线方式
 * @author iok_own
 * date 2023/10/18 9:52
 */
@Slf4j
public class RegionUtils {
    private static final Searcher SEARCHER;
    static {
        String fileName = "/ip2region.xdb";
        File existFile = FileUtils.file(FileUtil.getTmpDir() + FileUtil.FILE_SEPARATOR + fileName);
        if(!FileUtils.exist(existFile)){
            ClassPathResource fileStream = new ClassPathResource(fileName);
            if(ObjectUtil.isEmpty(fileStream.getStream())){
                throw new BizException("RegionUtils初始化失败，原因：IP地址库数据不存在！");
            }
            FileUtils.writeFromStream(fileStream.getStream(),existFile);
        }
        String dbPath = existFile.getPath();
        // 1.从dbPath 加载整个xdb到内存
        byte[] cBuff;
        try{
            cBuff = Searcher.loadContentFromFile(dbPath);
        }catch(Exception e){
            throw new BizException("RegionUtils初始化失败，原因：从ip2region.xdb文件加载内容失败！" + e.getMessage());
        }
        // 2、使用上述的 cBuff 创建一个完全基于内存的查询对象。
        try{
            SEARCHER=Searcher.newWithBuffer(cBuff);
        }catch(Exception e){
            throw new BizException("RegionUtils初始化失败，原因：" + e.getMessage());
        }
    }
    /**
     * 根据IP地址离线获取城市
     */
    public static String getCityInfo(String ip) {
        try{
            ip = ip.trim();
            // 3 执行查询
            String region = SEARCHER.search(ip);
            return region.replace("0|", "").replace("|0", "");
        }catch(Exception e){
            log.error("IP地址离线获取城市异常 {}", ip);
            return "未知";
        }
    }
}

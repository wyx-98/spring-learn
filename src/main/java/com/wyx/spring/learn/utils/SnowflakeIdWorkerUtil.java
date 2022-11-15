package com.wyx.spring.learn.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author wyx
 * 雪花算法
 */
public class SnowflakeIdWorkerUtil {

    /**
     * 雪花算法生成唯一Id
     * @return 唯一Id
     */
    public static long nextId() {
        long workerId = 1L;
        long datacenterId = 2L;
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }
}

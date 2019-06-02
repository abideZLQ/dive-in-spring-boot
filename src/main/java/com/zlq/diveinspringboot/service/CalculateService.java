package com.zlq.diveinspringboot.service;

/**
 * 计算服务
 *
 * @author zlq
 * @since 2019/6/2
 */
public interface CalculateService {

    /**
     * 从多个整数 sum 求和
     * @param values 多个整数
     * @return sum 累加值
     */
    Integer sum(Integer... values);

}

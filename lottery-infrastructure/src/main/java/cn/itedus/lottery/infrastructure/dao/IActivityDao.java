package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: lixianglong
 * @Date: 2023/3/9 - 03 -09 - 16:42
 * @Description: cn.itedus.lottery.infrastructure.dao
 * @version: 1.0
 */
@Mapper
public interface IActivityDao {
    void insert(Activity req);
    Activity queryActivityById(Long activityId);
}

package cn.itedus.lottery.rpc;

import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;

/**
 * @Author: lixianglong
 * @Date: 2023/3/9 - 03 -09 - 18:45
 * @Description: cn.itedus.lottery.rpc
 * @version: 1.0
 * 活动展台
 * rpc定义接口
 */
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}

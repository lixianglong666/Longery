package cn.itedus.lottery.rpc.req;

import java.io.Serializable;

/**
 * @Author: lixianglong
 * @Date: 2023/3/9 - 03 -09 - 18:43
 * @Description: cn.itedus.lottery.rpc.req
 * @version: 1.0
 */
public class ActivityReq implements Serializable {
    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}

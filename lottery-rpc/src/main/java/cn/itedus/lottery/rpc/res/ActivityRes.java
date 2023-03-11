package cn.itedus.lottery.rpc.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.rpc.dto.ActivityDto;

import java.io.Serializable;

/**
 * @Author: lixianglong
 * @Date: 2023/3/9 - 03 -09 - 18:44
 * @Description: cn.itedus.lottery.rpc.res
 * @version: 1.0
 */
public class ActivityRes implements Serializable {
    private Result result;
    private ActivityDto activity;
    public ActivityRes() {
    }

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}

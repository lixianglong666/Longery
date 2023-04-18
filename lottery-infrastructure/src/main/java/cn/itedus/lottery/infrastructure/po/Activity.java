package cn.itedus.lottery.infrastructure.po;

import java.util.Date;

/**
 * @Author: lixianglong
 * @Date: 2023/3/9 - 03 -09 - 16:43
 * @Description: 活动基础信息表
 * @version: 1.0
 * 活动基本信息表
 */
public class Activity {
    //自增ID
    private Long id;

    //活动ID
    private Long activityId;

    //活动名称
    private String activityName;

    //活动描述
    private String activityDesc;

    //开始时间
    private Date beginDateTime;

    /**
     * 库存剩余
     */
    private Integer stockSurplusCount;
    /**
     * 策略ID
     */
    private Long strategyId;

    //结束时间
    private Date endDateTime;

    //库存
    private Integer stockCount;

    //每人可参与次数
    private Integer takeCount;

    //活动状态 编辑，提审，撤身，通过、运行、拒绝、关闭、开启
    private Integer state;

    //创建人
    private String creator;

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public Date getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getTakeCount() {
        return takeCount;
    }

    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStockSurplusCount() {
        return stockSurplusCount;
    }

    public void setStockSurplusCount(Integer stockSurplusCount) {
        this.stockSurplusCount = stockSurplusCount;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}

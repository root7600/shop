package com.yan.shop.dao;

import java.io.Serializable;
import java.util.Date;

public class AppraisalItem implements Serializable {
    private Long id;

    /**
     * 商品Id
     *
     * @mbggenerated
     */
    private Long itemId;

    /**
     * 商品类目
     *
     * @mbggenerated
     */
    private Long categoryId;

    /**
     * 估计最低价格
     *
     * @mbggenerated
     */
    private Long evaluateLowPrice;

    /**
     * 估计最高价格
     *
     * @mbggenerated
     */
    private Long evaluateHighPrice;

    /**
     * 收取商家的鉴别费用
     *
     * @mbggenerated
     */
    private Long appraisalFee;

    /**
     * 期望售假
     *
     * @mbggenerated
     */
    private Long exceptSalePrice;

    /**
     * 用户的id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 是否补充过资料
     *
     * @mbggenerated
     */
    private Boolean isAddMaterial;

    /**
     * 原因
     *
     * @mbggenerated
     */
    private Integer reason;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * 商品类型
     *
     * @mbggenerated
     */
    private Integer itemType;

    /**
     * 商品名称
     *
     * @mbggenerated
     */
    private String itemName;

    /**
     * 稀缺性 10：普品 11：稀缺品
     *
     * @mbggenerated
     */
    private Integer scarcity;

    /**
     * 鉴别等级:0正常,1可以申诉
     *
     * @mbggenerated
     */
    private Integer appraisalLevel;

    /**
     * 102, "客服审查待派单"103, "客服审查待鉴别"104, "客服审查完成"
     *
     * @mbggenerated
     */
    private Integer staffReviewStatus;

    /**
     * 派单优先级
     *
     * @mbggenerated
     */
    private Integer dispatchPriority;

    private Boolean isHighQuality;

    /**
     * 商品状态
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 支付时间
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * 鉴别时间
     *
     * @mbggenerated
     */
    private Date appraisalTime;

    /**
     * 级别结果
     *
     * @mbggenerated
     */
    private Integer result;

    private Date updateTime;

    private Date createTime;

    private Boolean isDeleted;

    /**
     * 是否是同图估价，0不是，1是
     *
     * @mbggenerated
     */
    private Integer isSameAppraisal;

    private String lockId;

    /**
     * 商品模版id
     *
     * @mbggenerated
     */
    private Long templateId;

    /**
     * 估计ToB最低价格
     *
     * @mbggenerated
     */
    private Long evaluateToBLowPrice;

    /**
     * 估计toB最高价格
     *
     * @mbggenerated
     */
    private Long evaluateToBHighPrice;

    /**
     * 版本id
     *
     * @mbggenerated
     */
    private Long versionId;

    /**
     * 扩展字段
     *
     * @mbggenerated
     */
    private String extra;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getEvaluateLowPrice() {
        return evaluateLowPrice;
    }

    public void setEvaluateLowPrice(Long evaluateLowPrice) {
        this.evaluateLowPrice = evaluateLowPrice;
    }

    public Long getEvaluateHighPrice() {
        return evaluateHighPrice;
    }

    public void setEvaluateHighPrice(Long evaluateHighPrice) {
        this.evaluateHighPrice = evaluateHighPrice;
    }

    public Long getAppraisalFee() {
        return appraisalFee;
    }

    public void setAppraisalFee(Long appraisalFee) {
        this.appraisalFee = appraisalFee;
    }

    public Long getExceptSalePrice() {
        return exceptSalePrice;
    }

    public void setExceptSalePrice(Long exceptSalePrice) {
        this.exceptSalePrice = exceptSalePrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getIsAddMaterial() {
        return isAddMaterial;
    }

    public void setIsAddMaterial(Boolean isAddMaterial) {
        this.isAddMaterial = isAddMaterial;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getScarcity() {
        return scarcity;
    }

    public void setScarcity(Integer scarcity) {
        this.scarcity = scarcity;
    }

    public Integer getAppraisalLevel() {
        return appraisalLevel;
    }

    public void setAppraisalLevel(Integer appraisalLevel) {
        this.appraisalLevel = appraisalLevel;
    }

    public Integer getStaffReviewStatus() {
        return staffReviewStatus;
    }

    public void setStaffReviewStatus(Integer staffReviewStatus) {
        this.staffReviewStatus = staffReviewStatus;
    }

    public Integer getDispatchPriority() {
        return dispatchPriority;
    }

    public void setDispatchPriority(Integer dispatchPriority) {
        this.dispatchPriority = dispatchPriority;
    }

    public Boolean getIsHighQuality() {
        return isHighQuality;
    }

    public void setIsHighQuality(Boolean isHighQuality) {
        this.isHighQuality = isHighQuality;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getAppraisalTime() {
        return appraisalTime;
    }

    public void setAppraisalTime(Date appraisalTime) {
        this.appraisalTime = appraisalTime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsSameAppraisal() {
        return isSameAppraisal;
    }

    public void setIsSameAppraisal(Integer isSameAppraisal) {
        this.isSameAppraisal = isSameAppraisal;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getEvaluateToBLowPrice() {
        return evaluateToBLowPrice;
    }

    public void setEvaluateToBLowPrice(Long evaluateToBLowPrice) {
        this.evaluateToBLowPrice = evaluateToBLowPrice;
    }

    public Long getEvaluateToBHighPrice() {
        return evaluateToBHighPrice;
    }

    public void setEvaluateToBHighPrice(Long evaluateToBHighPrice) {
        this.evaluateToBHighPrice = evaluateToBHighPrice;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", evaluateLowPrice=").append(evaluateLowPrice);
        sb.append(", evaluateHighPrice=").append(evaluateHighPrice);
        sb.append(", appraisalFee=").append(appraisalFee);
        sb.append(", exceptSalePrice=").append(exceptSalePrice);
        sb.append(", userId=").append(userId);
        sb.append(", isAddMaterial=").append(isAddMaterial);
        sb.append(", reason=").append(reason);
        sb.append(", remark=").append(remark);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemName=").append(itemName);
        sb.append(", scarcity=").append(scarcity);
        sb.append(", appraisalLevel=").append(appraisalLevel);
        sb.append(", staffReviewStatus=").append(staffReviewStatus);
        sb.append(", dispatchPriority=").append(dispatchPriority);
        sb.append(", isHighQuality=").append(isHighQuality);
        sb.append(", status=").append(status);
        sb.append(", payTime=").append(payTime);
        sb.append(", appraisalTime=").append(appraisalTime);
        sb.append(", result=").append(result);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isSameAppraisal=").append(isSameAppraisal);
        sb.append(", lockId=").append(lockId);
        sb.append(", templateId=").append(templateId);
        sb.append(", evaluateToBLowPrice=").append(evaluateToBLowPrice);
        sb.append(", evaluateToBHighPrice=").append(evaluateToBHighPrice);
        sb.append(", versionId=").append(versionId);
        sb.append(", extra=").append(extra);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
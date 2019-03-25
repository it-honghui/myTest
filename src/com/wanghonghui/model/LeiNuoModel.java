package com.wanghonghui.model;

public class LeiNuoModel {

    private Integer userId; // 用户id
    private String surveyFormId; // 问卷id
    private String email; // 序号
    private String userClass; // 分类
    private String uniqueId; // 经销商编号
    private String officeId; // 专营店名称		经销商名称
    private String office; // 品牌
    private String typeId; // VIN码
    private String customerName; // 车牌号
    private String contactOrder; // 客户姓名	车主姓名
    private String contact; // 客户电话	车主联系电话
    private String postTitle; // 大区
    private String tel; // 小区
    private String mobile; // 车系名称
    private String language; // 交车时间
    private String localContact;
    private String cardId;
    private String contactEmail;
    private String contactTel;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String fillStart; // 答题开始时间
    private String fillFinish; // 答题结束时间	问卷结束时间

    private String startDate; // 查询开始结束时间
    private String endDate; // 查询结束时间

    private int status; // 答题状态
    private int rowNumStart; // （第n页-1）*10
    private int pageSize; // 每页大小

    private String type; // 0是销售 1是售后
    private String contactParty; // 联系方
    private String indDisplayId;    // 低分题目编号
    private String questionTitle;    // 低分题目(indDisplayId + questionTitle)
    private String answerRecord;    // 低分原因


    public String getIndDisplayId() {
        return indDisplayId;
    }

    public void setIndDisplayId(String indDisplayId) {
        this.indDisplayId = indDisplayId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContactParty() {
        return contactParty;
    }

    public void setContactParty(String contactParty) {
        this.contactParty = contactParty;
    }

    public String getAnswerRecord() {
        return answerRecord;
    }

    public void setAnswerRecord(String answerRecord) {
        this.answerRecord = answerRecord;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSurveyFormId() {
        return surveyFormId;
    }

    public void setSurveyFormId(String surveyFormId) {
        this.surveyFormId = surveyFormId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactOrder() {
        return contactOrder;
    }

    public void setContactOrder(String contactOrder) {
        this.contactOrder = contactOrder;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocalContact() {
        return localContact;
    }

    public void setLocalContact(String localContact) {
        this.localContact = localContact;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

    public String getFillStart() {
        return fillStart;
    }

    public void setFillStart(String fillStart) {
        this.fillStart = fillStart;
    }

    public String getFillFinish() {
        return fillFinish;
    }

    public void setFillFinish(String fillFinish) {
        this.fillFinish = fillFinish;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRowNumStart() {
        return rowNumStart;
    }

    public void setRowNumStart(int rowNumStart) {
        this.rowNumStart = rowNumStart;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "LeiNuoModel{" +
                "userId=" + userId +
                ", surveyFormId='" + surveyFormId + '\'' +
                ", email='" + email + '\'' +
                ", userClass='" + userClass + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                ", officeId='" + officeId + '\'' +
                ", office='" + office + '\'' +
                ", typeId='" + typeId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", contactOrder='" + contactOrder + '\'' +
                ", contact='" + contact + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", tel='" + tel + '\'' +
                ", mobile='" + mobile + '\'' +
                ", language='" + language + '\'' +
                ", localContact='" + localContact + '\'' +
                ", cardId='" + cardId + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactTel='" + contactTel + '\'' +
                ", remark1='" + remark1 + '\'' +
                ", remark2='" + remark2 + '\'' +
                ", remark3='" + remark3 + '\'' +
                ", remark4='" + remark4 + '\'' +
                ", remark5='" + remark5 + '\'' +
                ", fillStart='" + fillStart + '\'' +
                ", fillFinish='" + fillFinish + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status=" + status +
                ", rowNumStart=" + rowNumStart +
                ", pageSize=" + pageSize +
                ", type='" + type + '\'' +
                ", contactParty='" + contactParty + '\'' +
                ", indDisplayId='" + indDisplayId + '\'' +
                ", questionTitle='" + questionTitle + '\'' +
                ", answerRecord='" + answerRecord + '\'' +
                '}';
    }
}

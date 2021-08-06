package com.nxzzld.nothingappication.net.api.entity;

import java.util.List;

public class NewsDataEntity {

    /**
     * author : 管理员
     * category : null
     * categoryId : 1245745321518100482
     * content : <div style="width:980px;margin-left:auto;margin-right:auto;line-height:30px;margin-top:10px;margin-bottom:10px;">
     *
     * </div>
     * coverImage : /upload/liiker/full/96f8f0e730df2e67c21ad9f1f39d2a799303f7a5.jpg
     * id : 1248622220628983809
     * intro : null
     * isHomepage : null
     * isPublish : 1
     * isTop : null
     * publishedAt : 2020-04-02 08:00:00
     * showOrder : null
     * source : null
     * status : 1
     * template : null
     * tenementCode : null
     * tenementId : null
     * title : 关于“五四”期间集中开展  “青春心向党·建功新时代”  系列主题活动的通知
     * visits : 712
     */

    private String author;
    private String category;
    private String categoryId;
    private String content;
    private String coverImage;
    private String id;
    private String intro;
    private String isHomepage;
    private int isPublish;
    private String isTop;
    private String publishedAt;
    private String showOrder;
    private String source;
    private String status;
    private String template;
    private String tenementCode;
    private String tenementId;
    private String title;
    private int visits;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIsHomepage() {
        return isHomepage;
    }

    public void setIsHomepage(String isHomepage) {
        this.isHomepage = isHomepage;
    }

    public int getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(int isPublish) {
        this.isPublish = isPublish;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(String showOrder) {
        this.showOrder = showOrder;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTenementCode() {
        return tenementCode;
    }

    public void setTenementCode(String tenementCode) {
        this.tenementCode = tenementCode;
    }

    public String getTenementId() {
        return tenementId;
    }

    public void setTenementId(String tenementId) {
        this.tenementId = tenementId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
}

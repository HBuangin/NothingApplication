package com.nxzzld.nothingappication.net.api.entity;

public class NewDetailEntity {

    /**
     * author : 宁夏共青团
     * authorUserId :
     * category : {"code":"notice","createdAt":"2020-04-03 08:10:04","deleted":0,"icon":"","id":"1245745321518100482","level":null,"name":"通知公告","orgCode":"","parentId":null,"showOrder":0,"status":"1","style":"","tenementCode":"","tenementId":"00000001"}
     * categoryId : 1245745321518100482
     * code : notice
     * content : <p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;根据《关于做好中国少年先锋队第八次全国代表大会代表人选推荐和第八届全国工作委员会委员候选人人选提名工作的通知》（中青明电〔2020〕13号）文件要求，经基层推选和自治区团委书记办公会研究，现将中国少年先锋队第八次全国代表大会代表候选人初步人选进行公示，公示时间为2020年5月8日至5月13日（5个工作日）。公示期间，如反映公示对象存在任何不符合候选人要求的情况，可采取写信、打电话或来访等方式，向自治区少工委办公室举报。来信请寄：宁夏银川市正源北街135号自治区少工委办公室<span style="color:black;">，邮编：750001。举报电话：0951-</span>2090261<span style="color:black;">。来访举报接待室设在自治区团委学校部（少年部）。接受电话举报和来访举报时间为公示期间每天上午8：30—12：00，下午14：30—18：30。</span>若所反映或举报的问题调查属实，自治区团委、少工委将取消被举报人的候选人资格。</p><p style="text-align:right;">共青团宁夏回族自治区委员会&nbsp; &nbsp;中国少年先锋队宁夏回族自治区工作委员会</p><p style="text-align:right;">2020年5月8日</p><p style="text-align:center;">中国少年先锋队第八次全国代表大会代表</p><p style="text-align:center;">候选人初步人选名单</p><p style="text-align:center;"><strong>（共16名，按姓氏笔画排序）</strong></p><p style="text-align:center;">王芝兰，女，回族，中共党员，吴忠市利通区团委书记。</p><p style="text-align:center;">王欢欢，女，回族，群众，银川市兴庆区第六小学碱富桥分校大队辅导员。</p><p style="text-align:center;">王富国，男，汉族，中共党员，石嘴山市第十五小学校外辅导员。</p><p style="text-align:center;">白佳霖，男，汉族，银川市金凤区丰登回民中学五（2）中队大队宣传委员。</p><p style="text-align:center;">朱帅，男，汉族，吴忠市盐池县大水坑第一小学五（2）中队大队长。</p><p style="text-align:center;">仲凯博，男，汉族，石嘴山市第十五小学五（4）中队大队长。</p><p style="text-align:center;">刘品序，女，回族，吴忠市利通街第一小学六（3）中队大队长。</p><p style="text-align:center;">杨静，女，回族，中共党员，自治区团委学校部（少年部）部长。</p><p style="text-align:center;">张梦琪，女，汉族，中共党员，宁夏长庆小学大队辅导员。</p><p style="text-align:center;">郑涵斐，女，汉族，银川市西夏区第十小学五（2）中队大队委员。</p><p style="text-align:center;">孟煜杰，男，汉族，固原市原州区第十一小学六（2）中队少先队员。</p><p style="text-align:center;">高家楠，女，汉族，固原市西吉县将台堡镇中心小学第三中队中队委员。</p><p style="text-align:center;">黄依然，女，汉族，中卫市沙坡头区镇罗中学七年级中队少先队员。</p><p style="text-align:center;">龚雪飞，男，汉族，中共党员，自治区教育工委副书记、自治区团委副书记、自治区少工委主任。</p><p style="text-align:center;">遇旻，女，汉族，中共党员，银川市实验小学发展共同体党委书记、校长。</p><p style="text-align:center;">路卿洁，女，汉族，中共党员，宁夏少先队总辅导员。</p>
     * coverImage :
     * createdAt : 2020-05-08 18:53:50
     * deleted : 0
     * id : 1258711701164130305
     * intro :
     * isHomepage : 0
     * isPublish : 1
     * isTop : 0
     * orgCode : 1254688974160617460
     * publishedAt : 2020-05-08 18:53:50
     * showOrder : 0
     * source :
     * status : 1
     * template : null
     * tenementCode :
     * tenementId :
     * title : 中国少年先锋队第八次全国代表大会代表 候选人初步人选公示
     * visits : 259
     */

    private String author;
    private String authorUserId;
    private CategoryBean category;
    private String categoryId;
    private String code;
    private String content;
    private String coverImage;
    private String createdAt;
    private int deleted;
    private String id;
    private String intro;
    private int isHomepage;
    private int isPublish;
    private int isTop;
    private String orgCode;
    private String publishedAt;
    private int showOrder;
    private String source;
    private String status;
    private Object template;
    private String tenementCode;
    private String tenementId;
    private String title;
    private int isLink;
    private String linkUrl;
    private int visits;

    public int getIsLink() {
        return isLink;
    }

    public void setIsLink(int isLink) {
        this.isLink = isLink;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorUserId() {
        return authorUserId;
    }

    public void setAuthorUserId(String authorUserId) {
        this.authorUserId = authorUserId;
    }

    public CategoryBean getCategory() {
        return category;
    }

    public void setCategory(CategoryBean category) {
        this.category = category;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
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

    public int getIsHomepage() {
        return isHomepage;
    }

    public void setIsHomepage(int isHomepage) {
        this.isHomepage = isHomepage;
    }

    public int getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(int isPublish) {
        this.isPublish = isPublish;
    }

    public int getIsTop() {
        return isTop;
    }

    public void setIsTop(int isTop) {
        this.isTop = isTop;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(int showOrder) {
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

    public Object getTemplate() {
        return template;
    }

    public void setTemplate(Object template) {
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

    public static class CategoryBean {
        /**
         * code : notice
         * createdAt : 2020-04-03 08:10:04
         * deleted : 0
         * icon :
         * id : 1245745321518100482
         * level : null
         * name : 通知公告
         * orgCode :
         * parentId : null
         * showOrder : 0
         * status : 1
         * style :
         * tenementCode :
         * tenementId : 00000001
         */

        private String code;
        private String createdAt;
        private int deleted;
        private String icon;
        private String id;
        private Object level;
        private String name;
        private String orgCode;
        private Object parentId;
        private int showOrder;
        private String status;
        private String style;
        private String tenementCode;
        private String tenementId;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getLevel() {
            return level;
        }

        public void setLevel(Object level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOrgCode() {
            return orgCode;
        }

        public void setOrgCode(String orgCode) {
            this.orgCode = orgCode;
        }

        public Object getParentId() {
            return parentId;
        }

        public void setParentId(Object parentId) {
            this.parentId = parentId;
        }

        public int getShowOrder() {
            return showOrder;
        }

        public void setShowOrder(int showOrder) {
            this.showOrder = showOrder;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
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
    }
}

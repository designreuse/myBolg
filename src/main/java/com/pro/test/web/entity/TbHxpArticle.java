package com.pro.test.web.entity;

import com.pro.test.core.common.annotation.*;

import java.io.Serializable;
import java.util.Date;

public class TbHxpArticle implements Serializable {

    private static final long serialVersionUID = 2718384724784571908L;

    @TableId
    private String id;

    private String articleId;

    private String articleTitle;

    private String articleIntroduced;

    private String articleRange;

    private String articleAuthorId;

    private String articleAuthorName;

    private String articleTags;

    private Integer isPublic;

    private String aboutArticleId;

    private Integer onTop;

    private String keyWords;

    private String articleRights;

    private String articleStatus;

    @CreateDate
    private Date createDate;

    @CreateBy
    private String createBy;

    @LastUpdateDate
    private Date updateDate;

    @LastUpdateBy
    private String updateBy;

    private String remark;

    private Integer isDeleted = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleIntroduced() {
        return articleIntroduced;
    }

    public void setArticleIntroduced(String articleIntroduced) {
        this.articleIntroduced = articleIntroduced == null ? null : articleIntroduced.trim();
    }

    public String getArticleRange() {
        return articleRange;
    }

    public void setArticleRange(String articleRange) {
        this.articleRange = articleRange == null ? null : articleRange.trim();
    }

    public String getArticleAuthorId() {
        return articleAuthorId;
    }

    public void setArticleAuthorId(String articleAuthorId) {
        this.articleAuthorId = articleAuthorId == null ? null : articleAuthorId.trim();
    }

    public String getArticleAuthorName() {
        return articleAuthorName;
    }

    public void setArticleAuthorName(String articleAuthorName) {
        this.articleAuthorName = articleAuthorName == null ? null : articleAuthorName.trim();
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags == null ? null : articleTags.trim();
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public String getAboutArticleId() {
        return aboutArticleId;
    }

    public void setAboutArticleId(String aboutArticleId) {
        this.aboutArticleId = aboutArticleId == null ? null : aboutArticleId.trim();
    }

    public Integer getOnTop() {
        return onTop;
    }

    public void setOnTop(Integer onTop) {
        this.onTop = onTop;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    public String getArticleRights() {
        return articleRights;
    }

    public void setArticleRights(String articleRights) {
        this.articleRights = articleRights == null ? null : articleRights.trim();
    }

    public String getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(String articleStatus) {
        this.articleStatus = articleStatus == null ? null : articleStatus.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
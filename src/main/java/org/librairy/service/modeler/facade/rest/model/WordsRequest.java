package org.librairy.service.modeler.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class WordsRequest {

    @ApiModelProperty(notes="max number of words")
    private Integer max;

    @ApiModelProperty(notes="first word to be returned")
    private Integer offset;

    @ApiModelProperty(notes="dimension identifier")
    private Integer topicId;

    @ApiModelProperty(notes="tf/ifd as sorting criteria")
    private Boolean tfidf;

    public WordsRequest(Integer topicId, Integer max, Integer offset, Boolean tfidf) {
        this.topicId = topicId;
        this.max = max;
        this.offset = offset;
        this.tfidf = tfidf;
    }

    public WordsRequest(){}

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Boolean getTfidf() {
        return tfidf;
    }

    public void setTfidf(Boolean tfidf) {
        this.tfidf = tfidf;
    }
}

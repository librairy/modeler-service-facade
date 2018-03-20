package org.librairy.service.modeler.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class ElementsRequest {

    @ApiModelProperty(notes="maxWords number of words")
    private Integer maxWords;

    @ApiModelProperty(notes="topic identifier")
    private Integer topicId;

    public ElementsRequest(Integer topicId, Integer maxWords) {

        this.topicId= topicId;
        this.maxWords = maxWords;
    }

    public ElementsRequest(){};

    public Integer getMaxWords() {
        return maxWords;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setMaxWords(Integer maxWords) {
        this.maxWords = maxWords;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
}

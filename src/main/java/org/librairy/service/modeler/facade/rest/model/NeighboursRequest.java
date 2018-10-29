package org.librairy.service.modeler.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class NeighboursRequest {

    @ApiModelProperty(notes="max number of neighbours")
    private Integer max;

    @ApiModelProperty(notes="dimension identifier")
    private Integer topicId;

    @ApiModelProperty(notes="similarity criteria")
    private String criteria;

    public NeighboursRequest(Integer topicId, Integer max, String criteria) {
        this.topicId = topicId;
        this.max = max;
        this.criteria = criteria;
    }

    public NeighboursRequest(){}

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
}

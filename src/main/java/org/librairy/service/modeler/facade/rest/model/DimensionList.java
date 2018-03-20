package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class DimensionList {

    private List<Topic> topics;

    public DimensionList(List<Topic> topics) {
        this.topics = topics;
    }

    public DimensionList(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of topics handled by the model", required = true)
    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}

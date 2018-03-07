package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.librairy.service.modeler.facade.model.TopicDistribution;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Inference {

    private List<TopicDistribution> topics;

    public Inference(List<TopicDistribution> topics) {
        this.topics = topics;
    }

    public Inference(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "topics distribution", required = true)
    public List<TopicDistribution> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicDistribution> topics) {
        this.topics = topics;
    }
}

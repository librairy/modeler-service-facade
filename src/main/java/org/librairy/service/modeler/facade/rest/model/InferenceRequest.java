package org.librairy.service.modeler.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class InferenceRequest {

    @ApiModelProperty(notes="Unstructured text")
    private String text;

    @ApiModelProperty(notes="short description for each dimension")
    private Boolean topics;

    public InferenceRequest(String text, Boolean topics) {
        this.topics = topics;
        this.text = text;
    }

    public InferenceRequest(){};

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getTopics() {
        return topics;
    }

    public void setTopics(Boolean topics) {
        this.topics = topics;
    }
}

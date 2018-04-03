package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Inference {

    private List<Relevance> relevanceList;

    public Inference(List<Relevance> dimensions) {
        this.relevanceList = dimensions;
    }

    public Inference(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of dimension relevance", required = true)
    public List<Relevance> getDimensions() {
        return relevanceList;
    }

    public void setRelevance(List<Relevance> relevanceList) {
        this.relevanceList = relevanceList;
    }
}

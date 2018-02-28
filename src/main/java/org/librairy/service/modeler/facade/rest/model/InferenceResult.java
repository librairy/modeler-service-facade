package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class InferenceResult {

    private List<Double> shape;

    public InferenceResult(List<Double> shape) {
        this.shape = shape;
    }

    public InferenceResult(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "topics distribution", required = true)
    public List<Double> getShape() {
        return shape;
    }

    public void setShape(List<Double> shape) {
        this.shape = shape;
    }
}

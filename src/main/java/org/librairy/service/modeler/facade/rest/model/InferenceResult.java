package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class InferenceResult {

    private final List<Double> shape;

    public InferenceResult(List<Double> shape) {
        this.shape = shape;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "topic distribution of the text", required = true)
    public List<Double> getShape() {
        return shape;
    }
}

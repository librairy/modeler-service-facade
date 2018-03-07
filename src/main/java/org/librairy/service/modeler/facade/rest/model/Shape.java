package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class Shape {

    private List<Double> vector;

    public Shape(List<Double> shape) {
        this.vector = shape;
    }

    public Shape(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "topics vector", required = true)
    public List<Double> getVector() {
        return vector;
    }

    public void setVector(List<Double> vector) {
        this.vector = vector;
    }
}

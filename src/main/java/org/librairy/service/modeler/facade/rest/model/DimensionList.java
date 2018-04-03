package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class DimensionList {

    private List<Dimension> dimensions;

    public DimensionList(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    public DimensionList(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of dimensions handled by the model", required = true)
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setTopics(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }
}

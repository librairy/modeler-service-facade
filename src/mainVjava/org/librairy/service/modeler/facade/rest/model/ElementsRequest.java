package org.librairy.service.modeler.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class ElementsRequest {

    @ApiModelProperty(notes="max number of elements")
    private Integer maxElements;

    @ApiModelProperty(notes="dimension identifier")
    private Integer dimensionId;

    public ElementsRequest(Integer dimensionId, Integer maxElements) {

        this.dimensionId = dimensionId;
        this.maxElements = maxElements;
    }

    public ElementsRequest(){};

    public Integer getMaxElements() {
        return maxElements;
    }

    public Integer getDimensionId() {
        return dimensionId;
    }

    public void setMaxElements(Integer maxElements) {
        this.maxElements = maxElements;
    }

    public void setDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
    }
}

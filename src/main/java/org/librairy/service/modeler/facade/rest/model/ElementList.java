package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class ElementList {

    private List<Element> elements;

    public ElementList(List<Element> elements) {
        this.elements = elements;
    }

    public ElementList(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of elements describing the dimension", required = true)
    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}

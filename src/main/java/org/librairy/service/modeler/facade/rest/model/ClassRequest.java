package org.librairy.service.modeler.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class ClassRequest {

    @ApiModelProperty(notes="Unstructured text")
    private String text;


    public ClassRequest(String text) {
        this.text = text;
    }

    public ClassRequest(){};

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

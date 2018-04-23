package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Relevance extends org.librairy.service.modeler.facade.model.Relevance {

    public Relevance(org.librairy.service.modeler.facade.model.Relevance relevance){
        try {
            BeanUtils.copyProperties(this,relevance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Relevance() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "dimension")
    public Dimension getDimension() { return new Dimension(super.getDimension());
    }

    @Override
    @ApiModelProperty(value = "score")
    public Double getScore() {
        return super.getScore();
    }


}

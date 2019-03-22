package es.upm.oeg.librairy.service.modeler.facade.rest.model;

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
public class Topic extends es.upm.oeg.librairy.service.modeler.facade.model.Topic {

    public Topic(es.upm.oeg.librairy.service.modeler.facade.model.Topic topic){
        try {
            BeanUtils.copyProperties(this,topic);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Topic() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "id")
    public Integer getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "label")
    public String getName() {
        return super.getName();
    }

    @Override
    @ApiModelProperty(value = "short representative text of its content")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "entropy")
    public Double getEntropy() {
        return super.getEntropy();
    }
}

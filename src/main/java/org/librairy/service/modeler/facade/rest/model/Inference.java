package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inference extends org.librairy.service.modeler.facade.model.Inference {

    public Inference(org.librairy.service.modeler.facade.model.Inference inference){
        try {
            BeanUtils.copyProperties(this,inference);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Inference() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "topics distribution")
    public List<Double> getVector() {
        return super.getVector();
    }

    @Override
    @ApiModelProperty(value = "topics description")
    public List<org.librairy.service.modeler.facade.model.TopicSummary> getTopics() {
        return super.getTopics();
    }

}

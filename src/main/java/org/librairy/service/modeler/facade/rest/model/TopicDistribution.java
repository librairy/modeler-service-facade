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
public class TopicDistribution extends org.librairy.service.modeler.facade.model.TopicDistribution {

    public TopicDistribution(org.librairy.service.modeler.facade.model.TopicDistribution topicDistribution){
        try {
            BeanUtils.copyProperties(this,topicDistribution);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "topic")
    public org.librairy.service.modeler.facade.model.Topic getTopic() {
        return super.getTopic();
    }

    @Override
    @ApiModelProperty(value = "score")
    public Double getScore() {
        return super.getScore();
    }

}

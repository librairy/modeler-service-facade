package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.modeler.facade.model.Similarity;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicNeighbour extends org.librairy.service.modeler.facade.model.TopicNeighbour {

    public TopicNeighbour(org.librairy.service.modeler.facade.model.TopicNeighbour topicNeighbour){
        try {
            BeanUtils.copyProperties(this,topicNeighbour);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TopicNeighbour() {
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
    @ApiModelProperty(value = "short representative text of its content")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "relevance")
    public Double getScore() {
        return super.getScore();
    }

    @Override
    //@ApiModelProperty(value = "proximity function")
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Similarity getSimilarity() {
        return super.getSimilarity();
    }


}

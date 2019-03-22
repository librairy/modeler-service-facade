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
public class TopicWord extends es.upm.oeg.librairy.service.modeler.facade.model.TopicWord {

    public TopicWord(es.upm.oeg.librairy.service.modeler.facade.model.TopicWord word){
        try {
            BeanUtils.copyProperties(this,word);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TopicWord() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "characters")
    public String getValue() {
        return super.getValue();
    }

    @Override
    @ApiModelProperty(value = "relevance")
    public Double getScore() {
        return super.getScore();
    }


}

package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inference  {

    List<Double> vector;

    List<TopicSummary> topics;


    public Inference(org.librairy.service.modeler.facade.model.Inference inference){
//        try {
//            BeanUtils.copyProperties(this,inference);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }

        this.vector = inference.getVector();
        if ((inference.getTopics() != null) && (!inference.getTopics().isEmpty()))
            this.topics = inference.getTopics().stream().map(t -> new TopicSummary(t)).collect(Collectors.toList());
    }

    public Inference() {
    }

    @ApiModelProperty(value = "topics distribution")
    public List<Double> getVector() {
        return this.vector;
    }

    @ApiModelProperty(value = "topics description")
    public List<TopicSummary> getTopics() {
        return this.topics;
    }

    public void setVector(List<Double> vector) {
        this.vector = vector;
    }

    public void setTopics(List<TopicSummary> topics) {
        this.topics = topics;
    }
}

package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Model extends org.librairy.service.modeler.facade.model.Model {

    public Model(org.librairy.service.modeler.facade.model.Model model){
        try {
            BeanUtils.copyProperties(this,model);
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
    @ApiModelProperty(value = "algorithm")
    public String getAlgorithm() {
        return super.getAlgorithm();
    }

    @Override
    @ApiModelProperty(value = "creation date")
    public String getDate() {
        return super.getDate();
    }

    @Override
    @ApiModelProperty(value = "settings")
    public Map<String,String> getParams() {
        return super.getParams();
    }

    @Override
    @ApiModelProperty(value = "details")
    public Map<String,String> getStats() {return super.getStats();}
}

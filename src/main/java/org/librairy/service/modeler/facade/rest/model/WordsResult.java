package org.librairy.service.modeler.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class WordsResult {

    private List<Word> words;

    public WordsResult(List<Word> words) {
        this.words = words;
    }

    public WordsResult(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "top words of the topic", required = true)
    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}

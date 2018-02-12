/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.modeler.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Word extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Word\",\"namespace\":\"org.librairy.service.modeler.facade.model\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"score\",\"type\":\"double\",\"default\":0.0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String value;
   private double score;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Word() {}

  /**
   * All-args constructor.
   */
  public Word(java.lang.String value, java.lang.Double score) {
    this.value = value;
    this.score = score;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return score;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.String)value$; break;
    case 1: score = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'score' field.
   */
  public java.lang.Double getScore() {
    return score;
  }

  /**
   * Sets the value of the 'score' field.
   * @param value the value to set.
   */
  public void setScore(java.lang.Double value) {
    this.score = value;
  }

  /** Creates a new Word RecordBuilder */
  public static org.librairy.service.modeler.facade.model.Word.Builder newBuilder() {
    return new org.librairy.service.modeler.facade.model.Word.Builder();
  }
  
  /** Creates a new Word RecordBuilder by copying an existing Builder */
  public static org.librairy.service.modeler.facade.model.Word.Builder newBuilder(org.librairy.service.modeler.facade.model.Word.Builder other) {
    return new org.librairy.service.modeler.facade.model.Word.Builder(other);
  }
  
  /** Creates a new Word RecordBuilder by copying an existing Word instance */
  public static org.librairy.service.modeler.facade.model.Word.Builder newBuilder(org.librairy.service.modeler.facade.model.Word other) {
    return new org.librairy.service.modeler.facade.model.Word.Builder(other);
  }
  
  /**
   * RecordBuilder for Word instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Word>
    implements org.apache.avro.data.RecordBuilder<Word> {

    private java.lang.String value;
    private double score;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.modeler.facade.model.Word.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.modeler.facade.model.Word.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Word instance */
    private Builder(org.librairy.service.modeler.facade.model.Word other) {
            super(org.librairy.service.modeler.facade.model.Word.SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'value' field */
    public java.lang.String getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public org.librairy.service.modeler.facade.model.Word.Builder setValue(java.lang.String value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'value' field */
    public org.librairy.service.modeler.facade.model.Word.Builder clearValue() {
      value = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'score' field */
    public java.lang.Double getScore() {
      return score;
    }
    
    /** Sets the value of the 'score' field */
    public org.librairy.service.modeler.facade.model.Word.Builder setScore(double value) {
      validate(fields()[1], value);
      this.score = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'score' field has been set */
    public boolean hasScore() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'score' field */
    public org.librairy.service.modeler.facade.model.Word.Builder clearScore() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Word build() {
      try {
        Word record = new Word();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.String) defaultValue(fields()[0]);
        record.score = fieldSetFlags()[1] ? this.score : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

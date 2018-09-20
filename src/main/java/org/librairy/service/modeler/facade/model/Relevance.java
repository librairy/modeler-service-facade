/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.modeler.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Relevance extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Relevance\",\"namespace\":\"org.librairy.service.modeler.facade.model\",\"fields\":[{\"name\":\"dimension\",\"type\":{\"type\":\"record\",\"name\":\"Dimension\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"default\":-1},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"entropy\",\"type\":\"double\",\"default\":0.0}]}},{\"name\":\"score\",\"type\":\"double\",\"default\":0.0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.librairy.service.modeler.facade.model.Dimension dimension;
   private double score;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Relevance() {}

  /**
   * All-args constructor.
   */
  public Relevance(org.librairy.service.modeler.facade.model.Dimension dimension, java.lang.Double score) {
    this.dimension = dimension;
    this.score = score;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dimension;
    case 1: return score;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dimension = (org.librairy.service.modeler.facade.model.Dimension)value$; break;
    case 1: score = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dimension' field.
   */
  public org.librairy.service.modeler.facade.model.Dimension getDimension() {
    return dimension;
  }

  /**
   * Sets the value of the 'dimension' field.
   * @param value the value to set.
   */
  public void setDimension(org.librairy.service.modeler.facade.model.Dimension value) {
    this.dimension = value;
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

  /** Creates a new Relevance RecordBuilder */
  public static org.librairy.service.modeler.facade.model.Relevance.Builder newBuilder() {
    return new org.librairy.service.modeler.facade.model.Relevance.Builder();
  }
  
  /** Creates a new Relevance RecordBuilder by copying an existing Builder */
  public static org.librairy.service.modeler.facade.model.Relevance.Builder newBuilder(org.librairy.service.modeler.facade.model.Relevance.Builder other) {
    return new org.librairy.service.modeler.facade.model.Relevance.Builder(other);
  }
  
  /** Creates a new Relevance RecordBuilder by copying an existing Relevance instance */
  public static org.librairy.service.modeler.facade.model.Relevance.Builder newBuilder(org.librairy.service.modeler.facade.model.Relevance other) {
    return new org.librairy.service.modeler.facade.model.Relevance.Builder(other);
  }
  
  /**
   * RecordBuilder for Relevance instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Relevance>
    implements org.apache.avro.data.RecordBuilder<Relevance> {

    private org.librairy.service.modeler.facade.model.Dimension dimension;
    private double score;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.modeler.facade.model.Relevance.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.modeler.facade.model.Relevance.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dimension)) {
        this.dimension = data().deepCopy(fields()[0].schema(), other.dimension);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Relevance instance */
    private Builder(org.librairy.service.modeler.facade.model.Relevance other) {
            super(org.librairy.service.modeler.facade.model.Relevance.SCHEMA$);
      if (isValidValue(fields()[0], other.dimension)) {
        this.dimension = data().deepCopy(fields()[0].schema(), other.dimension);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.score)) {
        this.score = data().deepCopy(fields()[1].schema(), other.score);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'dimension' field */
    public org.librairy.service.modeler.facade.model.Dimension getDimension() {
      return dimension;
    }
    
    /** Sets the value of the 'dimension' field */
    public org.librairy.service.modeler.facade.model.Relevance.Builder setDimension(org.librairy.service.modeler.facade.model.Dimension value) {
      validate(fields()[0], value);
      this.dimension = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'dimension' field has been set */
    public boolean hasDimension() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'dimension' field */
    public org.librairy.service.modeler.facade.model.Relevance.Builder clearDimension() {
      dimension = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'score' field */
    public java.lang.Double getScore() {
      return score;
    }
    
    /** Sets the value of the 'score' field */
    public org.librairy.service.modeler.facade.model.Relevance.Builder setScore(double value) {
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
    public org.librairy.service.modeler.facade.model.Relevance.Builder clearScore() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Relevance build() {
      try {
        Relevance record = new Relevance();
        record.dimension = fieldSetFlags()[0] ? this.dimension : (org.librairy.service.modeler.facade.model.Dimension) defaultValue(fields()[0]);
        record.score = fieldSetFlags()[1] ? this.score : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

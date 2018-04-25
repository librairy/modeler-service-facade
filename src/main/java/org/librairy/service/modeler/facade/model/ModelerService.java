/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.modeler.facade.model;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface ModelerService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"ModelerService\",\"namespace\":\"org.librairy.service.modeler.facade.model\",\"types\":[{\"type\":\"record\",\"name\":\"Element\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"score\",\"type\":\"double\",\"default\":0.0}]},{\"type\":\"record\",\"name\":\"Dimension\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"default\":-1},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"}]},{\"type\":\"record\",\"name\":\"Relevance\",\"fields\":[{\"name\":\"dimension\",\"type\":\"Dimension\"},{\"name\":\"score\",\"type\":\"double\",\"default\":0.0}]},{\"type\":\"record\",\"name\":\"Model\",\"fields\":[{\"name\":\"algorithm\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"date\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"default\":{}},{\"name\":\"stats\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"default\":{}}]}],\"messages\":{\"inference\":{\"request\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"Relevance\"}},\"shape\":{\"request\":[{\"name\":\"text\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"response\":{\"type\":\"array\",\"items\":\"double\"}},\"dimensions\":{\"request\":[],\"response\":{\"type\":\"array\",\"items\":\"Dimension\"}},\"elements\":{\"request\":[{\"name\":\"dimensionId\",\"type\":\"int\"},{\"name\":\"maxElements\",\"type\":\"int\"}],\"response\":{\"type\":\"array\",\"items\":\"Element\"}},\"model\":{\"request\":[],\"response\":\"Model\"}}}");
  java.util.List<org.librairy.service.modeler.facade.model.Relevance> inference(java.lang.String text) throws org.apache.avro.AvroRemoteException;
  java.util.List<java.lang.Double> shape(java.lang.String text) throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.modeler.facade.model.Dimension> dimensions() throws org.apache.avro.AvroRemoteException;
  java.util.List<org.librairy.service.modeler.facade.model.Element> elements(int dimensionId, int maxElements) throws org.apache.avro.AvroRemoteException;
  org.librairy.service.modeler.facade.model.Model model() throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends ModelerService {
    public static final org.apache.avro.Protocol PROTOCOL = org.librairy.service.modeler.facade.model.ModelerService.PROTOCOL;
    void inference(java.lang.String text, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.modeler.facade.model.Relevance>> callback) throws java.io.IOException;
    void shape(java.lang.String text, org.apache.avro.ipc.Callback<java.util.List<java.lang.Double>> callback) throws java.io.IOException;
    void dimensions(org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.modeler.facade.model.Dimension>> callback) throws java.io.IOException;
    void elements(int dimensionId, int maxElements, org.apache.avro.ipc.Callback<java.util.List<org.librairy.service.modeler.facade.model.Element>> callback) throws java.io.IOException;
    void model(org.apache.avro.ipc.Callback<org.librairy.service.modeler.facade.model.Model> callback) throws java.io.IOException;
  }
}
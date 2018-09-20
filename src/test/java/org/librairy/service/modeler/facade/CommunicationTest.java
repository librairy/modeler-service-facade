package org.librairy.service.modeler.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.modeler.facade.model.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    @Test
    public void exchange() throws InterruptedException, IOException {


        ModelerService customService = new ModelerService() {

            @Override
            public List<Relevance> inference(String text) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Double> shape(String text) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Dimension> dimensions() throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Element> elements(int dimensionId, int maxElements, int offset, boolean tfidf) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public Model model() throws AvroRemoteException {
                return Model.newBuilder().build();
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        try {

            client.inference("sample text");

            client.dimensions();

            client.elements(0,5,0,false);

            client.model();

        } catch (AvroRemoteException e) {
            e.printStackTrace();
        }

        client.close();
        server.close();
    }

}

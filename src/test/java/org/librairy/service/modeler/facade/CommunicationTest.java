package org.librairy.service.modeler.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.modeler.facade.model.Dimension;
import org.librairy.service.modeler.facade.model.Element;
import org.librairy.service.modeler.facade.model.ModelerService;
import org.librairy.service.modeler.facade.model.Relevance;

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
            public List<Element> elements(int topicId, int maxWords) throws AvroRemoteException {
                return Collections.emptyList();
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

            client.elements(0,5);
        } catch (AvroRemoteException e) {
            e.printStackTrace();
        }

        client.close();
        server.close();
    }

}

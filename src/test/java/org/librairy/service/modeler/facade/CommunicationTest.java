package org.librairy.service.modeler.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.modeler.facade.model.ModelerService;
import org.librairy.service.modeler.facade.model.Topic;
import org.librairy.service.modeler.facade.model.Word;

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
            public List<Double> inference(String text) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Topic> topics() throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<Word> words(int topicId, int maxWords) throws AvroRemoteException {
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

            client.topics();

            client.words(0,5);
        } catch (AvroRemoteException e) {
            e.printStackTrace();
        }

        client.close();
        server.close();
    }

}

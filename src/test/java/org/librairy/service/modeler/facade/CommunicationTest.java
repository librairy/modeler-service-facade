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
            public Inference createInference(String text) throws AvroRemoteException {
                return Inference.newBuilder().build();
            }

            @Override
            public List<TopicSummary> getTopics() throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public Topic getTopic(int id) throws AvroRemoteException {
                return Topic.newBuilder().build();
            }

            @Override
            public List<TopicWord> getTopicWords(int id, int max, int offset, boolean tfidf) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public List<TopicNeighbour> getTopicNeighbours(int id, int max, Similarity similarity) throws AvroRemoteException {
                return Collections.emptyList();
            }

            @Override
            public Settings getSettings() throws AvroRemoteException {
                return Settings.newBuilder().build();
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        try {

            client.createInference("sample text");

            client.getTopics();

            client.getTopic(0);

            client.getTopicWords(0,5,0,false);

            client.getTopicNeighbours(0,5,Similarity.CONCURRENCE);

            client.getSettings();

        } catch (AvroRemoteException e) {
            e.printStackTrace();
        }

        client.close();
        server.close();
    }

}

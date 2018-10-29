package org.librairy.service.modeler.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.modeler.facade.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroClient {

    private static final Logger LOG = LoggerFactory.getLogger(AvroClient.class);

    NettyTransceiver client;
    ModelerService proxy;

    public void open(String host, Integer port) throws IOException {
        this.client = new NettyTransceiver(new InetSocketAddress(InetAddress.getByName(host),port));
        // client code - attach to the server and send a message
        this.proxy = (ModelerService) SpecificRequestor.getClient(ModelerService.class, client);
        LOG.info("Client built to " + host+":"+port+", got proxy");
    }

    public void close(){
        if (client != null) client.close();
    }

    public Inference createInference(String text) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.createInference");
        Inference result = proxy.createInference(text);
        LOG.debug("Result: " + result);
        return result;
    }


    public List<TopicSummary> getTopics() throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.getTopics");
        List<TopicSummary> result = proxy.getTopics();
        LOG.debug("Result: " + result);
        return result;
    }

    public Topic getTopic(int id) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.getTopic");
        Topic result = proxy.getTopic(id);
        LOG.debug("Result: " + result);
        return result;
    }

    public List<Word> getTopicWords(Integer topicId, Integer max, Integer offset, Boolean tfidf) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.getTopicWords");
        List<Word> result = proxy.getTopicWords(topicId, max, offset, tfidf);
        LOG.debug("Result: " + result);
        return result;
    }

    public List<TopicNeighbour> getTopicNeighbours(Integer topicId, Integer max, Similarity similarity) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.getTopicNeighbours");
        List<TopicNeighbour> result = proxy.getTopicNeighbours(topicId, max, similarity);
        LOG.debug("Result: " + result);
        return result;
    }

    public Settings getSettings() throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.getSettings");
        Settings result = proxy.getSettings();
        LOG.debug("Result: " + result);
        return result;
    }


}

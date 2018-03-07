package org.librairy.service.modeler.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.modeler.facade.model.ModelerService;
import org.librairy.service.modeler.facade.model.Topic;
import org.librairy.service.modeler.facade.model.TopicDistribution;
import org.librairy.service.modeler.facade.model.Word;
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

    public List<TopicDistribution> inference(String text) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.inference");
        List<TopicDistribution> result = proxy.inference(text);
        LOG.debug("Result: " + result);
        return result;
    }

    public List<Double> shape(String text) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.shape");
        List<Double> result = proxy.shape(text);
        LOG.debug("Result: " + result);
        return result;
    }


    public List<Topic> topics() throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.topics");
        List<Topic> result = proxy.topics();
        LOG.debug("Result: " + result);
        return result;
    }

    public List<Word> words(Integer topicId, Integer maxWords) throws AvroRemoteException {
        // fill in the Message record and send it
        LOG.debug("Calling proxy.words");
        List<Word> result = proxy.words(topicId, maxWords);
        LOG.debug("Result: " + result);
        return result;
    }


}

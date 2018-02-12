package org.librairy.service.modeler.facade;

import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.librairy.service.modeler.facade.model.ModelerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroServer {

    private static final Logger LOG = LoggerFactory.getLogger(AvroServer.class);

    private Server server;
    private final ModelerService service;

    public AvroServer(ModelerService service){
        this.service = service;
    }



    public void open(String host, Integer port) throws IOException {
        LOG.debug("Trying to start a Model service at "+host+":"+port);
        server = new NettyServer(new SpecificResponder(ModelerService.class, service), new InetSocketAddress(InetAddress.getByName(host),port));
        LOG.info("Avro server listening at: "+host+":"+port);
    }

    public void close(){
        if (server != null) server.close();
        LOG.info("Avro server stopped");
    }

}

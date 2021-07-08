package com.reactivegroup.capa.rpc.client;

import java.util.Map;

public interface RpcServiceAdaptor<Client> {

    String getServiceAppId();

    Map<String, RpcMethodAdaptor> getServiceMethodMap();

    Client getServiceClient();
}
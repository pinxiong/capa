package com.reactivegroup.capa.domain;

/**
 * A request to invoke a service.
 */
public class InvokeMethodRequest {

    private String appId;

    private String method;

    private Object body;

    private HttpExtension httpExtension;

    private String contentType;

    public String getAppId() {
        return appId;
    }

    void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMethod() {
        return method;
    }

    void setMethod(String method) {
        this.method = method;
    }

    public Object getBody() {
        return body;
    }

    void setBody(Object body) {
        this.body = body;
    }

    public HttpExtension getHttpExtension() {
        return httpExtension;
    }

    void setHttpExtension(HttpExtension httpExtension) {
        this.httpExtension = httpExtension;
    }

    public String getContentType() {
        return contentType;
    }

    void setContentType(String contentType) {
        this.contentType = contentType;
    }
}

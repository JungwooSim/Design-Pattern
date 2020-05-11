package me.study.proxy.virtual;

public class VirtualProxy implements VirtualProxyInterface{
    VirtualProxyImpl virtualProxy;

    public VirtualProxy() {
    }

    @Override
    public void action() throws InterruptedException {
        System.out.println("Proxy Start - 0 seconds loading");
        virtualProxy = new VirtualProxyImpl();
    }
}

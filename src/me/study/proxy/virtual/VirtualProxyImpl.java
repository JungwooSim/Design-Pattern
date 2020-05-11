package me.study.proxy.virtual;

public class VirtualProxyImpl implements VirtualProxyInterface{

    public VirtualProxyImpl() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Override
    public void action(){
        System.out.println("Proxy Impl Start - 2 seconds loading");
    }
}

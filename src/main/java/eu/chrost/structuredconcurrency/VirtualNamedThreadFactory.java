package eu.chrost.structuredconcurrency;

import java.util.concurrent.ThreadFactory;

class VirtualNamedThreadFactory {
    private static volatile ThreadFactory instance;

    public static ThreadFactory getInstance() {
        ThreadFactory localRef = instance;
        if (null == localRef) {
            synchronized (VirtualNamedThreadFactory.class) {
                localRef = instance;
                if (null == localRef) {
                    instance = localRef = Thread.ofVirtual().name("virtual-", 0).factory();
                }
            }
        }
        return localRef;
    }
}

package dev.webfx.platform.shutdown.spi.impl.java;

import dev.webfx.platform.shutdown.spi.impl.ShutdownProviderBase;

/**
 * @author Bruno Salmon
 */
public final class JavaShutdownProvider extends ShutdownProviderBase<Thread> {

    @Override
    protected Thread createPlatformShutdownHook(Runnable hook) {
        return new Thread(hook);
    }

    @Override
    protected void addPlatformShutdownHook(Thread platformHook) {
        Runtime.getRuntime().addShutdownHook(platformHook);
    }

    @Override
    protected void removePlatformShutdownHook(Thread platformHook) {
        Runtime.getRuntime().removeShutdownHook(platformHook);
    }

    @Override
    protected void exit(int exitStatus) {
        System.exit(exitStatus);
    }
}

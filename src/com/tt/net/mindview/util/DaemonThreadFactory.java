package com.tt.net.mindview.util;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        //将线程r设置为后台线程
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}

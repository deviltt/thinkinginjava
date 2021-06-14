package com.netty.fileupload;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;

public class Pipeline extends ChannelInitializer {

    private EventExecutorGroup businessEventExecutorGroup = new DefaultEventExecutorGroup(10);
    @Override
    protected void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        /**
         * http服务器端对response编码
         */
        pipeline.addLast("encoder", new HttpResponseEncoder());

        /**
         * http服务器端对request解码3.
         */
        pipeline.addLast("decoder", new HttpRequestDecoder());

        /**
         * 合并请求
         */
        pipeline.addLast("aggregator", new HttpObjectAggregator(655300000));

        /**
         * 正常业务逻辑处理
         */
        pipeline.addLast(businessEventExecutorGroup, new FileServerHandle());
    }
}

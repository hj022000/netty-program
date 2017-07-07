package com.taomee.bigdata.opensource;


import io.netty.buffer.*;
import io.netty.util.CharsetUtil;
import org.junit.Test;

import java.nio.CharBuffer;

/**
 * Author looper.
 * Company  TaoMee.Inc, ShangHai.
 * Date  2017/7/7.
 */
public class TestByteBuf {

    public static void main(String[] args) {
      /* *//* //System.out.println(Integer.MAX_VALUE);
        ByteBuf byteBuf;*//*
        Object msg = "abc";
        ByteBuf byteBuf = (ByteBuf) msg ;
       // System.out.println(byteBuf);*/
        //副本和源共享，对其中之一修改，都会被修改
        System.out.println("共享copy修改");
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks", CharsetUtil.UTF_8);
        ByteBuf sliced = buf.slice(0, 15);
        System.out.println(sliced.toString(CharsetUtil.UTF_8));
        buf.setByte(0, (byte) 'J');
        System.out.println(buf.toString(CharsetUtil.UTF_8));
        System.out.println(sliced.toString(CharsetUtil.UTF_8));
        //System.out.println();

        System.out.println("非共享copy修改");
        ByteBuf buf2 = Unpooled.copiedBuffer("Netty in Action rocks", CharsetUtil.UTF_8);
        Byte byte2 = buf2.getByte(2);
        System.out.println("byte2:" + byte2);
        ByteBuf sliced2 = buf2.copy(0, 15);
        System.out.println(sliced2.toString(CharsetUtil.UTF_8));
        buf2.setByte(0, (byte) 'J');
        System.out.println(buf2.toString(CharsetUtil.UTF_8));
        System.out.println(sliced2.toString(CharsetUtil.UTF_8));

    }

    @Test
    public void test1() {
        ByteBuf buf = Unpooled.buffer(10);//ByteBuf会在write时内部实现当字节容量不足时
        buf.writeBytes("1".getBytes());
        //System.out.println(buf.maxCapacity());

        int readerIndex = buf.readerIndex();
        int writerIndex = buf.writerIndex();
        System.out.println("readIndex:"+readerIndex+",writerIndex:"+writerIndex);
        /*String abc = ByteBufUtil.hexDump(buf.array());
        System.out.println(abc);*/
        ByteBufAllocator byteBufAllocator = new PooledByteBufAllocator();

        //CharBuffer charBuffer =new StringCharBuffer("abc",1,2);
       // CharBuffer charBuffer;
       // ByteBufUtil.encodeString(byteBufAllocator,"abc".,CharsetUtil.UTF_8);

    }
}

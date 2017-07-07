package com.taomee.bigdata.opensource;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

/**
 * Author looper.
 * Company  TaoMee.Inc, ShangHai.
 * Date  2017/7/7.
 */
public class TestByteBuf2 {

    public static void main(String[] args) {
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks", CharsetUtil.UTF_8);
        //System.out.println(buf.readBytes(21));

        int readerIndex = buf.readerIndex();
        int writerIndex = buf.writerIndex();
        System.out.println("readerIndex:"+readerIndex+",writerIndex:"+writerIndex);
       // System.out.println(buf.toString(CharsetUtil.UTF_8));
        //buf.clear();
        //System.out.println(buf.toString(CharsetUtil.UTF_8));
      //  buf.discardReadBytes();

        int readerIndex2 = buf.readerIndex();
        int writerIndex2 = buf.writerIndex();
        System.out.println("readerIndex2:"+readerIndex2+",writerIndex2:"+writerIndex2);
        System.out.println(buf.isWritable());
        System.out.println(buf.maxCapacity());
        System.out.println(buf.hasArray());

    }
}

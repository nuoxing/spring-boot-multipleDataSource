/*
 * 文件名：FastDfsUtilTest.java 版权：Copyright by www.chinauip.com 描述： 修改人：Administrator 修改时间：2017年11月14日
 * 跟踪单号： 修改单号： 修改内容：
 */

package com.work.fastdfs;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.apache.commons.io.IOUtils;
import org.csource.common.MyException;
import org.junit.Test;

import com.work.util.FastDfsUtil;

import sun.misc.BASE64Encoder;



public class FastDfsUtilTest2
{

    //@Test
    public void test1()
        throws IOException, MyException
    {
        byte[] b = FastDfsUtil.downLoadFile("group1/M00/00/00/rBD8aVq0bRGAL__0AAAFrIbv1XQ92.conf");
       
        
        IOUtils.write(b, new FileOutputStream("F:/2.conf"));
    }

   // @Test
    public void test11()
        throws IOException, MyException
    {
        File file = new File("F:/1.png");
        FileInputStream filein = new FileInputStream(file);
        FileChannel channel = null;
        channel = filein.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)channel.size());
        while ((channel.read(byteBuffer)) > 0)
        {
            
        }
        String str = FastDfsUtil.uploadFile(byteBuffer.array(), "png", null);
        BASE64Encoder encoder = new BASE64Encoder();
        System.out.println("base64=" + encoder.encode(byteBuffer.array()));
        System.out.println(str);
    }
    
   
}

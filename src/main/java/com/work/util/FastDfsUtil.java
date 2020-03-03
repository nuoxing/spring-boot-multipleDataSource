/*
 * 文件名：FastDfsUtil.java 版权：Copyright by www.chinauip.com 描述： 修改人：Administrator 修改时间：2017年11月14日
 * 跟踪单号： 修改单号： 修改内容：
 */

package com.work.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

/**
 * 分布式文件系统 fastdfs工具类 〈功能详细描述〉
 * 
 * @author suwy
 * @version 2017年11月14日
 * @see FastDfsUtil
 * @since
 */
public class FastDfsUtil {

	private static String path;
	static TrackerClient trackerClient;
	static TrackerServer trackerServer; 

	static {
		try {

			String os = System.getProperty("os.name");
			if (os.toLowerCase().startsWith("win")) { // window系统
				path = FastDfsUtil.class.getClassLoader().getResource("").toString() + "fdfs_client.conf";
				path = path.replace("file:/", "");

			} else { // linux系统
				path = FastDfsUtil.class.getClassLoader().getResource("").toString() + "fdfs_client.conf";
			}

			System.out.println(path);
			ClientGlobal.init(path);

		} catch (IOException e) {
			StringWriter out = new StringWriter();
			e.printStackTrace(new PrintWriter(out, true));
			e.printStackTrace();
		} catch (MyException e) {
			StringWriter out = new StringWriter();
			e.printStackTrace(new PrintWriter(out, true));
			e.printStackTrace();
		}

	}

	/**
	 * 描述:上传文件，返回结果是文件系统中的路径例如
	 * group1/M00/00/00/wKjI61oK0eOAFlxdAAAHK7YQrBQ863.png <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 实现: <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 
	 * @param file_buff
	 *            文件字节数组
	 * @param file_ext_name
	 *            文件类型 例如 doc pdf png
	 * @param meta_list
	 *            文件属性
	 * @return
	 * @throws IOException
	 * @throws MyException
	 * @see
	 */
	public static String uploadFile(byte[] file_buff, String file_ext_name, NameValuePair[] meta_list)
			throws IOException, MyException {
		
		trackerClient = new TrackerClient();
		trackerServer = trackerClient.getConnection();
		StorageClient1 storageClient;
		StorageServer storageServer;
		// System.out.println("path="+path);
		System.out.println("fastdfs文件上传");
		/** 下面两个步骤会建立一个新的TCP连接,可以通过建立多个连接,也就是多个storageClient来实现连接池的功能,加速操作效率 */
		storageServer = trackerClient.getStoreStorage(trackerServer);
		storageClient = new StorageClient1(trackerServer, storageServer);
		String res = storageClient.upload_file1(file_buff, file_ext_name, meta_list);

		storageServer.close();
		trackerServer.close();
		return res;

	}

	/**
	 * 描述: 下载文件<br>
	 * 1、…<br>
	 * 2、…<br>
	 * 实现: <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 
	 * @param file_id
	 *            需要下载的文件路径id 例如
	 *            group1/M00/00/00/wKjI61oK0eOAFlxdAAAHK7YQrBQ863.png
	 * @return
	 * @throws IOException
	 * @throws MyException
	 * @see
	 */
	public static byte[] downLoadFile(String file_id) throws IOException, MyException {
		// System.out.println("path="+path);
		System.out.println("下载文件，file_id=" + file_id);
		TrackerClient trackerClient;
		TrackerServer trackerServer;
		trackerClient = new TrackerClient();
		trackerServer = trackerClient.getConnection();
		StorageClient1 storageClient;
		StorageServer storageServer;
		// System.out.println("path="+path);
		/** 下面两个步骤会建立一个新的TCP连接,可以通过建立多个连接,也就是多个storageClient来实现连接池的功能,加速操作效率 */
		storageServer = trackerClient.getStoreStorage(trackerServer);
		storageClient = new StorageClient1(trackerServer, storageServer);
		byte[] bs = storageClient.download_file1(file_id);

		storageServer.close();
		trackerServer.close();
		return bs;

	}

	/**
	 * 描述: 删除文件<br>
	 * 1、…<br>
	 * 2、…<br>
	 * 实现: <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 
	 * @param file_id
	 *            需要删除的文件路径id 例如
	 *            group1/M00/00/00/wKjI61oK0eOAFlxdAAAHK7YQrBQ863.png
	 * @throws IOException
	 * @throws MyException
	 * @see
	 */
	public static void deleteFile(String file_id) throws IOException, MyException {
		// System.out.println("path="+path);
		System.out.println("删除文件，file_id=" + file_id);
		TrackerClient trackerClient;
		TrackerServer trackerServer;
		trackerClient = new TrackerClient();
		trackerServer = trackerClient.getConnection();
		StorageClient1 storageClient;
		StorageServer storageServer;
		// System.out.println("path="+path);
		/** 下面两个步骤会建立一个新的TCP连接,可以通过建立多个连接,也就是多个storageClient来实现连接池的功能,加速操作效率 */
		storageServer = trackerClient.getStoreStorage(trackerServer);
		storageClient = new StorageClient1(trackerServer, storageServer);
		storageClient.delete_file1(file_id);

		storageServer.close();
		trackerServer.close();
	}

	/**
	 * 描述:删除文件 <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 实现: <br>
	 * 1、…<br>
	 * 2、…<br>
	 * 
	 * @param file_id
	 *            需要删除的文件路径id数组 例如
	 *            group1/M00/00/00/wKjI61oK0eOAFlxdAAAHK7YQrBQ863.png
	 * @throws IOException
	 * @throws MyException
	 * @see
	 */
	public static void deleteFile(List<String> file_id) throws IOException, MyException {
		for (String str : file_id) {
			TrackerClient trackerClient;
			TrackerServer trackerServer;
			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
			StorageClient1 storageClient;
			StorageServer storageServer;
			storageServer = trackerClient.getStoreStorage(trackerServer);
			storageClient = new StorageClient1(trackerServer, storageServer);
			storageClient.delete_file1(str);

			storageServer.close();
			trackerServer.close();
		}
	}

}

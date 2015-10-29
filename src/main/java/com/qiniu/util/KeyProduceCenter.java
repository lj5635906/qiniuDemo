package com.qiniu.util;

import java.lang.management.ManagementFactory;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;
import com.qiniu.constant.Constant;

/**
 * 生成表主键
 * 
 * @author Leon
 * @version 1.0
 */
public class KeyProduceCenter {

	// 初始化流水号
	private static AtomicInteger SERIAL_NUMBER = new AtomicInteger(1);

	/**
	 * 生成新的主键值
	 * 
	 * 生成规则： 时间（17位） + 流水号（8位）
	 * 
	 * @return 新主键
	 */
	public String creatKeyId() {

		// 获取服务器时间
		String gmtTime = getGmtTime();
		System.out.println("服务器时间: " + gmtTime);
		// 获取流水号
		int serialNo = getNewSerialNumber();
		System.out.println("获取流水号: " + serialNo);

		// 获取补足8位的流水号
		String serialNumber = StringUtil.leftPad(String.valueOf(serialNo),
				Constant.PAD_SIZE_8, Constant.DEFAULT_0);
		System.out.println("补足8位的流水号 : " + serialNumber);
		// 获取进程ID
		String processId = getProgressId();
		System.out.println("进程ID : " + processId);
		// 生成主键ID
		String keyId = gmtTime + processId + serialNumber;

		return keyId;
	}

	/**
	 * 获取系统的GMT时间
	 * 
	 * @return GMT时间
	 */
	private static String getGmtTime() {
		return DateUtil.getDateMilliFormat();
	}

	/**
	 * 流水号自增1，如果达到99999999
	 */
	private static Integer getNewSerialNumber() {
		Integer x = SERIAL_NUMBER.getAndIncrement();
		if (x > Constant.MAX_SERIAL_NUMBER) {
			SERIAL_NUMBER = new AtomicInteger(1);
			x = SERIAL_NUMBER.intValue();
		}
		return x;
		
	}

	/**
	 * 获取当前bean使用的进程号
	 * 
	 * @return 进程ID
	 */
	private static String getProgressId() {
		String name = ManagementFactory.getRuntimeMXBean().getName();
		String pid = name.split("@")[0];
		return StringUtil.leftPad(pid, Constant.PAD_SIZE_5,
				Constant.DEFAULT_0);
	}

	public static void main(String[] args) throws SocketException {
		KeyProduceCenter keyProduceCenter = new KeyProduceCenter();

		String rst = keyProduceCenter.creatKeyId();
//		System.out.println(rst);
 
		String jp="agfe442qw"; 
		for(int i=0;i<jp.length();i++){ 
		    int temp=(int)jp.charAt(i); //得到当前字符的ascii
		    System.out.println(temp);
		}
 	}
	 /**
     * 字符转ASC
     * 
     * @param st
     * @return
     */
    public static int getAsc(String st) {
        byte[] gc = st.getBytes();
        return (int) gc[0];
        
    }
}

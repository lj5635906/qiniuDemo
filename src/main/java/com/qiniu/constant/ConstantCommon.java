package com.qiniu.constant;

/**
 * 系统共通常量
 * 
 * @author Leon
 *
 */
public class ConstantCommon {
	// 系统application
	public static final String APPLICATION_CONTEXT = "applicationContext";
	/*
	 * -----------------------------主键生成参数Start----------------------------------
	 */
	/** 补充长度位数为3位 */
	public static final int PAD_SIZE_3 = 3;
	/** 补充长度位数为5位 */
	public static final int PAD_SIZE_5 = 5;
	/** 补充长度位数为5位 */
	public static final int PAD_SIZE_8 = 8;

	/** 补充用字符 */
	public static final String DEFAULT_0 = "0";
	/** 流水号名称 */
	public static final String SERIAL_NUMBER = "serial_number";
	/** 初始化流水号 */
	public static final int DEFAULT_SERIAL_NUMBER = 1;
	/** 获取服务器IP后三位 */
	public static final String SERVER_IP_LAST_3_NUM = "server_ip";
	/** 流水号最大值 */
	public static final int MAX_SERIAL_NUMBER = 99999999;
	/*
	 * -------------------------------主键生成参数End----------------------------------
	 */
	
	/*
	 * -----------------------------业务数据格式化参数Start----------------------------------
	 */
	/** 价格操作位数 */
	public static final int DATA_FORMAT_PRICE_DIGIT = 100;
	/** 个数操作位数 */
	public static final int DATA_FORMAT_VOLUME_DIGIT = 10000;
	/** 价格格式化模板 */
	public static final String DATA_FORMAT_PRICE_TEMPLATE = "#.00";
	/** 个数格式化模板 */
	public static final String DATA_FORMAT_VOLUME_TEMPLATE = "#.0000";
	
	
	/*
	 * -------------------------------业务数据格式化参数End----------------------------------
	 */
}

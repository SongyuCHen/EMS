package nju.software.appraisal.util;
import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

/**
 * 配置文件（*.properties）工具类
 * 
 * @author wzq
 */
/**
 * @author wzq
 *
 */
public class PropertiesUtil {
	
	public static boolean setProperty(String key, String value) {
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
			return false;
		}
		pros.setProperty(key, value);
		String tempValue = pros.getProperty(key);
		if(value.equals(tempValue))
			return true;
		else
			return false;
	}
	
	/**
	 * 获取电子档案目录
	 * @return
	 */
	public static String getDzdaDir(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
		}
		String dzdaDir = pros.getProperty("dzdaDir");
		return dzdaDir;
	}
	
	/**
	 * 获取当前法院代码
	 * @return
	 */
	public static String getCurrentFydm(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
		}
		String fydm = pros.getProperty("currentFydm");
		return fydm;
	}
	
	public static String getQrcodeWidth(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
		}
		String width = pros.getProperty("qrcodeWidth");
		return width;
	}
	
	public static String getQrcodeHeight(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
		}
		String height = pros.getProperty("qrcodeHeight");
		return height;
	}
	
	/**
	 * 电子档案上传目录中每个文件夹中最大图片个数
	 */
	public static int getMaxNumPerFolder(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
		}
		String num = pros.getProperty("maxNumPerFolder");
		return Integer.parseInt(num);
	}
	
	/**
	 * 获取评查案件审批部门编号
	 */
	public static String getPcajSpbmbh(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties文件不存在！";
			System.out.println(errorMessage);
		}
		String num = pros.getProperty("pcajSpbmbh");
		return num.trim();
	}
	
}

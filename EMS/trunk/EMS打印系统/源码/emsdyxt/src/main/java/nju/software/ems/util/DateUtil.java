package nju.software.ems.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 * 
 */
public class DateUtil {
	public final static String shortFormat = "yyyyMMdd";
	public final static String longFormat = "yyyyMMddHHmmss";
	public final static String webFormat = "yyyy-MM-dd";
	public final static String timeFormat = "HHmmss";
	public final static String monthFormat = "yyyyMM";
	public final static String chineseDtFormat = "yyyy年MM月dd日";
	/**
	 * 最高院使用日期格式YYYY-MM-DD
	 */
	public final static String newFormat = "yyyy-MM-dd";
	public final static String zbFormat = "yyyy/MM/dd";
	public final static String tsfxFormat = "yyyy.MM.dd";
	public final static String noSecondFormat = "yyyy-MM-dd HH:mm";
	public final static String secondFormat = "yyyy-MM-dd HH:mm:ss";
	public final static long ONE_DAY_MILL_SECONDS = 86400000;

	// -----------------------------------------------------------------------
	/**
	 * Adds to a date returning a new object. The original date object is
	 * unchanged.
	 * 
	 * @param date
	 *            the date, not null
	 * @param calendarField
	 *            the calendar field to add to
	 * @param amount
	 *            the amount to add, may be negative
	 * @return the new date object with the amount added
	 * @throws IllegalArgumentException
	 *             if the date is null
	 */
	public static Date add(Date date, int calendarField, int amount) {
		if (date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(calendarField, amount);
		return c.getTime();
	}

	public static Date addYears(Date date, int amount) {
		return add(date, Calendar.YEAR, amount);
	}

	public static Date addMonths(Date date, int amount) {
		return add(date, Calendar.MONTH, amount);
	}

	public static Date addWeeks(Date date, int amount) {
		return add(date, Calendar.WEEK_OF_YEAR, amount);
	}

	public static Date addDays(Date date, int amount) {
		return add(date, Calendar.DAY_OF_MONTH, amount);
	}

	public static Date addHours(Date date, int amount) {
		return add(date, Calendar.HOUR_OF_DAY, amount);
	}

	/**
	 * 标准化输出
	 * 
	 * @param date
	 *            日期对象
	 * @param format
	 *            日期输出格式
	 * @return 按照指定格式输出的字符串
	 */
	public static String format(Date date, String format) {
		if (date == null) {
			return null;
		}
		return new SimpleDateFormat(format).format(date);
	}

	/**
	 * 获得一个时间的年份数
	 * 
	 * @param date
	 * @return
	 */
	public static int getYear(Date date) {
		if (date == null) {
			return -1;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.YEAR);
	}

	/**
	 * 获得一个时间的月份数
	 * 
	 * @param date
	 * @return
	 */
	public static int getMonth(Date date) {
		if (date == null) {
			return -1;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH) + 1;
	}

	/**
	 * 获得一个时间在一个月中的天数
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayOfMonth(Date date) {
		if (date == null) {
			return -1;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 标准化输出
	 * 
	 * @param s_date
	 * @param format
	 * @return
	 */
	public static Date parse(String s_date, String format) {
		if (s_date == null)
			return null;
		try {
			return new SimpleDateFormat(format).parse(s_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 取得两个日期间隔秒数（日期1-日期2）
	 * 
	 * @param one
	 *            日期1
	 * @param two
	 *            日期2
	 * 
	 * @return 间隔秒数
	 */
	public static long getDiffSeconds(Date one, Date two) {
		Calendar sysDate = new GregorianCalendar();

		sysDate.setTime(one);

		Calendar failDate = new GregorianCalendar();

		failDate.setTime(two);
		return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / 1000;
	}

	/**
	 * 取得两个日期间隔分钟数（日期1-日期2）
	 * 
	 * @param one
	 * @param two
	 * @return
	 */
	public static long getDiffMinutes(Date one, Date two) {
		Calendar sysDate = new GregorianCalendar();

		sysDate.setTime(one);

		Calendar failDate = new GregorianCalendar();

		failDate.setTime(two);
		return (sysDate.getTimeInMillis() - failDate.getTimeInMillis())
				/ (60 * 1000);
	}

	/**
	 * 取得两个日期的间隔天数
	 * 
	 * @param one
	 * @param two
	 * 
	 * @return 间隔天数
	 */
	public static long getDiffDays(Date one, Date two) {
		Calendar sysDate = new GregorianCalendar();

		sysDate.setTime(one);

		Calendar failDate = new GregorianCalendar();

		failDate.setTime(two);
		return (sysDate.getTimeInMillis() - failDate.getTimeInMillis())
				/ (24 * 60 * 60 * 1000);
	}

	/**
	 * 判断是否是正确的日期格式
	 * 
	 * @param str_date
	 *            日期字符串
	 * @param format
	 *            日期格式
	 * @return
	 */
	public static boolean isValidDateFormat(String strDate, String format) {
		// 检查长度
		if (strDate.length() != longFormat.length()) {
			return false;
		}
		// 检查格式是否正确
		DateFormat df = new SimpleDateFormat(format);
		df.setLenient(false);
		try {
			df.parse(strDate);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * 获得当天的开始时间
	 * 
	 * @return
	 */
	public static Date today() {
		return parse(format(new Date(), webFormat), webFormat);
	}

	/**
	 * 获得本周一的日期
	 * 
	 * @return
	 */
	public String getMondayOFWeek() {
		int mondayPlus = this.getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, mondayPlus);
		Date monday = currentDate.getTime();

		DateFormat df = DateFormat.getDateInstance();
		String preMonday = df.format(monday);
		return preMonday;
	}
	
	/**
	 * 获取某个日期所在周的周一日期
	 * @param date
	 * @return
	 */
	public static Date getMondayOfWeek(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1;
		int mondayPlus;
		if (dayOfWeek == 1) {
			mondayPlus = 0;
		} else if (dayOfWeek == 0) {
			mondayPlus = -6;
		} else {
			mondayPlus = 1 - dayOfWeek;
		}
		Date monday = DateUtil.addDays(date, mondayPlus);
		return monday;
	}

	/**
	 * 获取距离某个日期几天的日期
	 * 
	 * @param date
	 *            选取的基础日期
	 * @param diff
	 *            负数表示向前，正数表示向后
	 * @return
	 */
	public String getCertainDay(Date date, int diff) {
		GregorianCalendar baseDate = new GregorianCalendar();
		baseDate.setTime(date);
		baseDate.add(GregorianCalendar.DATE, diff);
		Date monday = baseDate.getTime();
		DateFormat df = DateFormat.getDateInstance();
		String certainDay = df.format(monday);
		return certainDay;
	}

	/**
	 * 获得本周星期日的日期
	 * 
	 * @return
	 */
	public String getCurrentWeekday() {
		int mondayPlus = this.getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
		Date monday = currentDate.getTime();

		DateFormat df = DateFormat.getDateInstance();
		String preMonday = df.format(monday);
		return preMonday;
	}

	/**
	 * 获取当月第一天
	 * 
	 * @return
	 */
	public String getFirstDayOfMonth() {
		String str = "";
		SimpleDateFormat sdf = new SimpleDateFormat(webFormat);

		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
		str = sdf.format(lastDate.getTime());
		return str;
	}
	
	/**
	 * 获得某个日期所在月的第一天
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfMonth(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		cd.set(Calendar.DATE, 1);
		return cd.getTime();
	}
	
	/**
	 * 获得一个月中统计周期第一天
	 * @param date
	 * @return 上月21日
	 */
	public static Date getStatisticStart(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		cd.add(Calendar.MONTH, -1);
		cd.set(Calendar.DATE, 21);
		return cd.getTime();
	}
	
	/**
	 * 获得一个月中统计周期最后一天
	 * @param date
	 * @return
	 */
	public static Date getStatisticEnd(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		cd.set(Calendar.DATE, 20);
		return cd.getTime();
	}
	
	/**
	 * 获取某个日期的下个月的第一天
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfNextMonth(Date date){
		return DateUtil.addMonths(getFirstDayOfMonth(date), 1);
	}
	
	/**
	 * 获取当月最后一天
	 * 
	 * @return
	 */
	public String getDefaultDay() {
		String str = "";
		SimpleDateFormat sdf = new SimpleDateFormat(webFormat);

		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
		lastDate.add(Calendar.MONTH, 1);// 加一个月，变为下月的1号
		lastDate.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天

		str = sdf.format(lastDate.getTime());
		return str;
	}

	/**
	 * 获得本年第一天的日期
	 * 
	 * @return
	 */
	public String getCurrentYearFirst() {
		int yearPlus = this.getYearPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, yearPlus);
		Date yearDay = currentDate.getTime();
		DateFormat df = DateFormat.getDateInstance();
		String preYearDay = df.format(yearDay);
		return preYearDay;
	}

	/**
	 * 获取某日期所在年的第一天
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfYear(Date date){
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		cd.set(Calendar.DAY_OF_YEAR, 1);
		return cd.getTime();
	}
	
	/**
	 * 获得本年最后一天的日期
	 * 
	 * @return
	 */
	public String getCurrentYearEnd() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");// 可以方便地修改日期格式
		String years = dateFormat.format(date);
		return years + "-12-31";
	}

	/**
	 * 获取本季度开始（或结束）日期
	 * @param month 
	 * @param bs 0:季度开始日期，1:季度结束日期
	 * @return
	 */
	public String getThisSeasonTime(int month,String bs) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int season = 1;
		if (month >= 1 && month <= 3) {
			season = 1;
		}
		if (month >= 4 && month <= 6) {
			season = 2;
		}
		if (month >= 7 && month <= 9) {
			season = 3;
		}
		if (month >= 10 && month <= 12) {
			season = 4;
		}
		int start_month = array[season - 1][0];
		int end_month = array[season - 1][2];

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");// 可以方便地修改日期格式
		String years = dateFormat.format(date);
		int years_value = Integer.parseInt(years);
		int start_days = 1;
		int end_days = getLastDayOfMonth(years_value, end_month);
		String seasonStartDate=years_value + "-" + start_month + "-" + start_days;
		String seasonEndDate = years_value + "-" + end_month + "-" + end_days;
		return bs=="0"?seasonStartDate:seasonEndDate;

	}
	
	/**
	 * 获取日期所在季度的第一天
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfQuarter(Date date){
		int month = 0;
		Calendar cd = Calendar.getInstance();
		cd.setTime(date);
		switch (cd.get(Calendar.MONTH)) {
		case 0:
		case 1:
		case 2:
			month = 0;
			break;
		case 3:
		case 4:
		case 5:
			month = 3;
			break;
		case 6:
		case 7:
		case 8:
			month = 6;
			break;
		case 9:			
		case 10:
		case 11:
			month = 9;
			break;
		default:
			month = 0;
			break;
		}
		cd.set(Calendar.MONTH, month);
		return getFirstDayOfMonth(cd.getTime());
	}

	/**
	 * 得到二个日期间的间隔天数
	 */
	public static String getTwoDay(String sj1, String sj2) {
		SimpleDateFormat myFormatter = new SimpleDateFormat(webFormat);
		long day = 0;
		try {
			Date date = myFormatter.parse(sj1);
			Date mydate = myFormatter.parse(sj2);
			day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
		} catch (Exception e) {
			return "";
		}
		return day + "";
	}

	/**
	 *  获得当前日期与本周日相差的天数
	 * @return
	 */
	private int getMondayPlus() {
		Calendar cd = Calendar.getInstance();
		// 获得今天是一周的第几天，星期日是第一天，星期二是第二天......
		int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1; // 因为按中国礼拜一作为第一天所以这里减1
		if (dayOfWeek == 1) {
			return 0;
		} else if (dayOfWeek == 0) {
			return -6;
		} else {
			return 1 - dayOfWeek;
		}
	}

	private int getYearPlus() {
		Calendar cd = Calendar.getInstance();
		int yearOfNumber = cd.get(Calendar.DAY_OF_YEAR);// 获得当天是一年中的第几天
		cd.set(Calendar.DAY_OF_YEAR, 1);// 把日期设为当年第一天
		cd.roll(Calendar.DAY_OF_YEAR, -1);// 把日期回滚一天。
		int MaxYear = cd.get(Calendar.DAY_OF_YEAR);
		if (yearOfNumber == 1) {
			return -MaxYear;
		} else {
			return 1 - yearOfNumber;
		}
	}

	/**
	 * 获取某年某月的天数
	 * @param year
	 * @param month
	 * @return
	 */
	private int getLastDayOfMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12) {
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		return 0;
	}

	/**
	 * 是否闰年
	 * 
	 * @param year
	 *            年
	 * @return
	 */
	public boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}
package com.bei.tally.util.g;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO(日期转换工具类) 
 * @author 技术部--徐周环   -.- 
 * @date 2018年11月29日 下午2:59:32 
 *
 */
public class DateUtil {

	/**
	 * 根据传入的字符串日期和格式，转换成Date类型
	 * 
	 * 
	 * @param sDate
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static Date parse(String sDate, String pattern) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.parse(sDate);
	}
	
	/**
	 * 根据传入的日期类型和格式，将日期格式化成字符串
	 * @param sDate
	 * @param pattern
	 * @return
	 */
	public static String format(Date sDate, String pattern){
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(sDate);
	}
	
	/**
     * 
     * @param datetime
     * @return
     */
    public  String dateToWeek(String datetime) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        Date datet = null;
        try {
            datet = f.parse(datetime);
            cal.setTime(datet);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
}

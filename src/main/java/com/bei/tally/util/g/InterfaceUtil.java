package com.bei.tally.util.g;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * 调用远程接口工具类
 * 
 * @author 徐周环
 *
 */
public class InterfaceUtil {
	/**
	 * 
	 * @param url需要调用的目标地址
	 * @param query
	 * @return
	 * @throws Exception
	 */
	public static void interfaceUtil(String path, String data) {
		try {
			URL url = new URL(path);
			// 打开和url之间的连接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			PrintWriter out = null;
			// OutputStreamWriter out1 = null;
			// 请求方式
			// conn.setRequestMethod("POST");
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
			// 设置是否向httpUrlConnection输出，设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
			// 最常用的Http请求无非是get和post，get请求可以获取静态页面，也可以把参数放在URL字串后面，传递给servlet，
			// post与get的 不同之处在于post的参数不是放在URL字串里面，而是放在http请求的正文内。
			conn.setConnectTimeout(30000);
			conn.setReadTimeout(30000);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// out1 = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
			// 发送请求参数即数据
			out.print(data);
			// out1.write(data);
			System.out.println(data);
			// 缓冲数据
			out.flush();

			// 解决方法：想判断返回值，在获取相应流
			InputStream is;
			int code = conn.getResponseCode();
			System.out.println("code:" + code);
//            if (code == 200) {
//            	is = conn.getInputStream(); // 得到网络返回的输入流
//            } else {
//            	is = conn.getErrorStream(); // 得到网络返回的输入流
//            }
			// 获取URLConnection对象对应的输入流
			// InputStream is = conn.getInputStream();
			is = conn.getInputStream();

			// 构造一个字符流缓存
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = "";
			while ((str = br.readLine()) != null) {
				str = new String(str.getBytes(), "utf-8");
				System.out.println(str);
			}
			// 关闭流
			is.close();
			// 断开连接，最好写上，disconnect是在底层tcp socket链接空闲时才切断。如果正在被其他线程使用就不切断。
			// 固定多线程的话，如果不disconnect，链接会增多，直到收发不出信息。写上disconnect后正常一些。
			conn.disconnect();
			System.out.println("完整结束");
			// System.exit(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.exit(0);
	}
	/*
	 * public static Map<String , Object> jsonToMap(String json){ Map<String,Object>
	 * map = new HashMap<> ( ); JSONObject jsonObject = new JSONObject ( ); map.put
	 * ( "name" , jsonObject.getString ( "name" ) ); map.put ( "age" ,
	 * jsonObject.getInt ( "age" ) ); return map ; }
	 */

	public static void main(String[] args) throws InterruptedException, ParseException, IOException {
		// interfaceUtil("http://1916d24n68.imwork.net/ZHWL/port/testk?user_openid=2","333");
		// Thread t = new Thread();
		// t.start();
		// Thread.sleep(5500);

		
		
		
		
		
		
		
		
		
		
		
		
		String alert = "dd都會發生";

		alert = URLEncoder.encode(alert, "UTF-8");
String url = "http://zhwl.yinshangjituan.com/aa/api/sys/sms/send?sign=0268e46ccaa1680c2fdfc8426f018138";
		String json = "{\"action_name\":\"QR_LIMIT_SCENE\",\"action_info\":{\"scene\":{\"scene_id\":234}}}";
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		StringEntity postingString = new StringEntity(json);// json传递
		post.setEntity(postingString);
		post.setHeader("Content-type", "application/json");
		HttpResponse response = httpClient.execute(post);
		String content = EntityUtils.toString(response.getEntity());
		// Log.i("test",content);
		System.out.println(content);
		
		//interfaceUtil("https://www.beixiaomu.com/family/jump/toPush?alias=" + "0820031248" + "&alert=" + alert, "1");
		interfaceUtil(url , "1");

		// 使用stop()方法，强制停止线程
		// t.stop();
	}

}

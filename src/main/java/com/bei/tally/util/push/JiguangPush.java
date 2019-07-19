package com.bei.tally.util.push;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

/**
 * java后台极光推送方式二：使用Java SDK
 */
//@SuppressWarnings({ "deprecation", "restriction" })
public class JiguangPush {
    private static final Logger log = LoggerFactory.getLogger(JiguangPush.class);
    //private static String masterSecret = "d299be00c27064769389d01c";//极光的secret
   // private static String appKey = "ce4fbdb0ddf6004cb8e0d21b";//极光推送的appkey
    
    
    private static String masterSecret = "5f327c6b060a872658e9e15b ";//极光的secret
    private static String appKey = "34774bfc1a22b1affd4db37f";//极光推送的appkey
    
    
    private static final String ALERT = "推送信息，金额：1230.5，时间：2018-11-05 15：56 联社：碎片联社";    
    //字段  交易人，交易金额，交易状态，付款方式，备注，账单分类，创建时间，订单号
    /**
     * 极光推送
     */
    public void jiguangPush(){
    	System.out.println("对别名的用户推送！");
    	log.info("对别名的用户推送信息");
        String alias = "111222333";//声明别名
        log.info("对别名" + alias + "的用户推送信息");
        System.out.println("对别名的用户推送！");
        PushResult result = push(String.valueOf(alias),ALERT);
        if(result != null && result.isResultOK()){
            log.info("针对别名" + alias + "的信息推送成功！");
            System.out.println("信息推动成功！");
        }else{
            log.info("针对别名" + alias + "的信息推送失败！");
            System.out.println("信息推动失败！");
        }
    }
    
    /**
     * 生成极光推送对象PushPayload（采用java SDK）
     * @param alias
     * @param alert
     * @return PushPayload
     */
    public static PushPayload buildPushObject_android_ios_alias_alert(String alias,String alert){
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.alias(alias))
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(AndroidNotification.newBuilder()
                                .addExtra("type", "infomation")
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()
                                .addExtra("type", "infomation")
                                .setAlert(alert)
                                .build())
                        .build())
                .setOptions(Options.newBuilder()
                        .setApnsProduction(false)//true-推送生产环境 false-推送开发环境（测试使用参数）
                        .setTimeToLive(90)//消息在JPush服务器的失效时间（测试使用参数）
                        .build())
                .build();
    }
    /**
     * 极光推送方法(采用java SDK)
     * @param alias
     * @param alert
     * @return PushResult
     */
    public static PushResult push(String alias,String alert){
        ClientConfig clientConfig = ClientConfig.getInstance();
        JPushClient jpushClient = new JPushClient(masterSecret, appKey, null, clientConfig);
        PushPayload payload = buildPushObject_android_ios_alias_alert(alias,alert);
        try {
            return jpushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            log.error("Connection error. Should retry later. ", e);
            return null;
        } catch (APIRequestException e) {
            log.error("Error response from JPush server. Should review and fix it. ", e);
            log.info("HTTP Status: " + e.getStatus());
            log.info("Error Code: " + e.getErrorCode());
            log.info("Error Message: " + e.getErrorMessage());
            log.info("Msg ID: " + e.getMsgId());
            return null;
        }    
    }
}

//package com.family.utils;
//
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import net.minidev.json.JSONArray;
//import net.minidev.json.JSONObject;
//import sun.misc.BASE64Encoder;
//import sun.net.www.http.HttpClient;
//
//
///**
// * java后台极光推送方式一：使用Http API
// * 此种方式需要自定义http请求发送客户端:HttpClient
// */
//@SuppressWarnings({ "deprecation", "restriction" })
//public class JiguangPush {
//
//	 private static final Logger log = LoggerFactory.getLogger(JiguangPush.class);
//	    private String masterSecret = "xxxxxxxxxxxxxxxxxxxx";
//	    private String appKey = "xxxxxxxxxxxxxxxxxxx";
//	    private String pushUrl = "https://api.jpush.cn/v3/push";    
//	    private boolean apns_production = true;    
//	    private int time_to_live = 86400;
//	    private static final String ALERT = "推送信息";    
//	    /**
//	     * 极光推送
//	     */
//	    public void jiguangPush(){
//	        String alias = "123456";//声明别名
//	        try{
//	            String result = push(pushUrl,alias,ALERT,appKey,masterSecret,apns_production,time_to_live);
//	            JSONObject resData = JSONObject.fromObject(result);
//	                if(resData.containsKey("error")){
//	                    log.info("针对别名为" + alias + "的信息推送失败！");
//	                    JSONObject error = JSONObject.fromObject(resData.get("error"));
//	                    log.info("错误信息为：" + error.get("message").toString());
//	                }
//	            log.info("针对别名为" + alias + "的信息推送成功！");
//	        }catch(Exception e){
//	            log.error("针对别名为" + alias + "的信息推送失败！",e);
//	        }
//	    }
//	    
//	    /**
//	     * 组装极光推送专用json串
//	     * @param alias
//	     * @param alert
//	     * @return json
//	     */
//	    public static JSONObject generateJson(String alias,String alert,boolean apns_production,int time_to_live){
//	        JSONObject json = new JSONObject();
//	        JSONArray platform = new JSONArray();//平台
//	        platform.add("android");
//	        platform.add("ios");
//	        
//	        JSONObject audience = new JSONObject();//推送目标
//	        JSONArray alias1 = new JSONArray();
//	        alias1.add(alias);
//	        audience.put("alias", alias1);
//	        
//	        JSONObject notification = new JSONObject();//通知内容
//	        JSONObject android = new JSONObject();//android通知内容
//	        android.put("alert", alert);
//	        android.put("builder_id", 1);
//	        JSONObject android_extras = new JSONObject();//android额外参数
//	        android_extras.put("type", "infomation");
//	        android.put("extras", android_extras);
//	        
//	        JSONObject ios = new JSONObject();//ios通知内容
//	        ios.put("alert", alert);
//	        ios.put("sound", "default");
//	        ios.put("badge", "+1");
//	        JSONObject ios_extras = new JSONObject();//ios额外参数
//	        ios_extras.put("type", "infomation");
//	        ios.put("extras", ios_extras);
//	        notification.put("android", android);
//	        notification.put("ios", ios);
//	        
//	        JSONObject options = new JSONObject();//设置参数
//	        options.put("time_to_live", Integer.valueOf(time_to_live));
//	        options.put("apns_production", apns_production);
//	        
//	        json.put("platform", platform);
//	        json.put("audience", audience);
//	        json.put("notification", notification);
//	        json.put("options", options);
//	        return json;
//	        
//	    }
//	    
//	    /**
//	     * 推送方法-调用极光API
//	     * @param reqUrl
//	     * @param alias
//	     * @param alert
//	     * @return result
//	     */
//	    public static String push(String reqUrl,String alias,String alert,String appKey,String masterSecret,boolean apns_production,int time_to_live){
//	        String base64_auth_string = encryptBASE64(appKey + ":" + masterSecret);
//	        String authorization = "Basic " + base64_auth_string;
//	        return sendPostRequest(reqUrl,generateJson(alias,alert,apns_production,time_to_live).toString(),"UTF-8",authorization);
//	    }
//	    
//	    /**
//	     * 发送Post请求（json格式）
//	     * @param reqURL
//	     * @param data
//	     * @param encodeCharset
//	     * @param authorization
//	     * @return result
//	     */
//	    @SuppressWarnings({ "resource" })
//	    public static String sendPostRequest(String reqURL, String data, String encodeCharset,String authorization){
//	        HttpPost httpPost = new HttpPost(reqURL);
//	        HttpClient client = new DefaultHttpClient();
//	        HttpResponse response = null;
//	        String result = "";
//	        try {
//	             StringEntity entity = new StringEntity(data, encodeCharset);
//	             entity.setContentType("application/json");
//	             httpPost.setEntity(entity);
//	             httpPost.setHeader("Authorization",authorization.trim());
//	             response = client.execute(httpPost);
//	             result = EntityUtils.toString(response.getEntity(), encodeCharset);
//	        } catch (Exception e) {
//	            log.error("请求通信[" + reqURL + "]时偶遇异常,堆栈轨迹如下", e);  
//	        }finally{
//	            client.getConnectionManager().shutdown();
//	        }
//	        return result;
//	    }
//	     /** 
//	　　　　* BASE64加密工具
//	　　　　*/
//	     public static String encryptBASE64(String str) {
//	         byte[] key = str.getBytes();
//	       BASE64Encoder base64Encoder = new BASE64Encoder();
//	       String strs = base64Encoder.encodeBuffer(key);
//	         return strs;
//	     }
//}

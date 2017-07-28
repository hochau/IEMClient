package com.xiaolin.http;

/**
 * Created by sjy on 2017/7/28.
 */

public class URLUtils {
    //URL根目录
    //    public static final String API_BASE_URL = "http://192.168.1.245:1132/openapi/";//局域网测试
    //    public final static String API_BASE_URL = "http://101.201.72.112:7016/openapi/";//阿里云测试
    public final static String API_BASE_URL = "https://iemapi.yuevision.com/openapi/";//阿里云正式

    //登录
    public static final String LOGIN = "User/AppDeviceLoginByPassword";

    //访客
    public static final String VISITOR = "Main/GetVisitorRecordsByPage";

    //地图考勤
    public static final String LOCATION = "Attend/AddOneMapAttendanceRecord";
}
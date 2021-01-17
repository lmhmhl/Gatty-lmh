package cn.sp.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created  on 2020/12/22
 */
public class IpUtil {

    /**
     * 获取ip地址
     *
     * @return
     */
    public static String getLocalIpAddress() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return address.getHostAddress();
    }
}

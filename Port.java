package com.atypon.com.atypon.utils;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;

public class Port {
    public static int findAvailableTcpPort()
    {
        ServerSocket socket=null;
        int port=-1;
        try{
            socket=new ServerSocket(0);
            socket.setReuseAddress(true);
            port=socket.getLocalPort();
            try{
                socket.close();
            }catch (IOException e)
            {

            }
            return port;

        }catch (Exception e)
        {
        }

        return port;
    }
    public static String findIp_Address()
    {
        try {
            return Inet4Address.getLocalHost().getHostAddress().trim();
        }catch (Exception e)
        {

        }
        return null;
    }

}

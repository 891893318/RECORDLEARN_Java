网络通信的两个问题：
*     如何准确的定位网络上的一台或多台主机；定位主机上特定的应用
*     找到主机后如何进行高效的数据传输？
网络编程的两个要素：
*      对应问题一：提供IP和端口号
*      对应问题二：提供网络通信协议（TCP/IP参考模型：应用层、传输层、网络层、物理加数据链路层）
### InetAddress类
1.Internet上的主机有两种方式表示地址：
*     域名(hostName)：www.****.com
*     IP 地址(hostAddress)：202.108.35.210
2.InetAddress类主要表示IP地址，两个子类：Inet4Address、Inet6Address。\
3.InetAddress类对象含有一个Internet主机地址的域名和IP地址: www.*****.com 和 202.108.35.210。\
4.域名容易记忆，当在连接网络时输入一个主机的域名后，域名服务器(DNS)负责将域名转化成IP地址，这样才能和主机建立连接。 -------域名解析\
5.InetAddress类没有提供公共的构造器，而是提供了如下几个静态方法来获取\
&emsp;&emsp;InetAddress实例
*      public static InetAddress getLocalHost()
*      public static InetAddress getByName(String host)
6.InetAddress提供了如下几个常用的方法
*      public String getHostAddress()：返回 IP 地址字符串（以文本表现形式）。
*      public String getHostName()：获取此 IP 地址的主机名
*      public boolean isReachable(int timeout)：测试是否可以达到该地址
网络编程：服务器端，客户端\
步骤：（客户端）
*     创建Socket对象，指明服务器的ip和端口号
*     获取输出流，用于输出数据
*     写出数据
*     资源关闭
步骤：（服务器端）
*     创建ServerSocket对象，指明自己的端口号
*     调用accept方法表示接收来自客户端的socket
*     获取输入流
*     读取输入流的数据
*     资源关闭
# MavenSSM2
任务15：402-测试整合后的SSM框架 任务16：403-读取数据库显示游戏列表

一.清理并重新部署

1.mvn clean tomcat7:redeploy

二.如果将login.jsp放入webapp/WEB-INF下，就不能直接访问到了，要放在webapp下。

三.测试：访问：http://localhost:8080/MavenSSM2/login.jsp

随意输入用户名，密码，登录后显示刚刚的用户名和密码。


=============================================================
1.从数据库运行item_info.sql，恢复数据库maven

2.打开src/main/resources/db.properties

jdbc.driverClass=com.mysql.jdbc.Driver
jdbc.jdbcUrl=jdbc:mysql://localhost:3306/maven
jdbc.user=root
jdbc.password=root

3.测试：进入“http://localhost:8080/MavenSSM2/login.jsp”，点游戏列表，显示“王者荣耀 MOBA 极品飞车20 竞速 守望先锋 射击 吃鸡 射击 魔兽世界 MMORPG 保卫萝卜 休闲”

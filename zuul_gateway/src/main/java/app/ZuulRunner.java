package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2019/4/22/022.
 */

@SpringBootApplication
//开启网关的功能
@EnableZuulProxy
//开启注册中心连接客户端
@EnableEurekaClient
public class ZuulRunner
{
    public static void main(String[] args) {
        SpringApplication.run(ZuulRunner.class,args);
    }
}

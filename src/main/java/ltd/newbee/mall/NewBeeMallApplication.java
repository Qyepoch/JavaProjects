/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@MapperScan("ltd.newbee.mall.dao")// 在启动类中增加对Mapper包的扫描@MapperScan,Spring Boot在启动的时候会自动加载包路径下的Mapper接口；当然，也可以直接在每个Mapper接口上面添加@Mapper注解。但是如果Mapper接口数量较多，在每个Mapper接口上添加注解是比较烦琐的，建议扫描注解。
@SpringBootApplication
public class NewBeeMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewBeeMallApplication.class, args);
    }
}

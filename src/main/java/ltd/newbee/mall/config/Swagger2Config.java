//package ltd.newbee.mall.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration // 启动时加载此类
//@EnableSwagger2 // 表示此项目启动Swagger API文档
//public class Swagger2Config {
//
//    @Bean
//    public Docket api() { // 返回实例Docket，指定需要扫描的控制器包路径
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("ltd.newbee.mall.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//    private ApiInfo apiInfo() { // 配置基本显示信息
//        return new ApiInfoBuilder()
//                .title("Swagger APi 文档")
//                .description("swagger 文档 by Jan")
//                .version("1.0")
//                .build();
//    }
//}

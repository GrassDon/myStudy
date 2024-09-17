package com.study.config;

import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/25 16:48
 */
// 让Spring来加载本配置
@Configuration
// 启用Swagger
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select()
                // 指定扫描的包结构
                .apis(RequestHandlerSelectors.basePackage("com.study"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 你的文档标题
                .title("Swagger2文档生成使用")
                // 你的描述
                .description("对接文档,查看方法")
                // 服务条款的网址
                .termsOfServiceUrl("http://www.baidu.com/about/about.html")
                // 联系信息
                .contact(new Contact("董做正","www.baidu.com","2235889787@qq.com"))
                // 文档版本
                .version("1.0")
                .build();
    }

}
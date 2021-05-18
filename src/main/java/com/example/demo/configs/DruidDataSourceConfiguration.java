package com.example.demo.configs;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/*
    使用 @Configuration 表明这是一个配置文件 等价于加载了一个 xml 的配置文件
    一般使用spring的依赖注入，向spring容器注入一个配置实体类bean对象；
    一般在配置类中会使用 @Bean注解，向spring容器注入实体类

    另外，可以使用 @value 给配置类的一些属性变量注入初始化值；
          注入的值直接使用类似于 ${属性名} 的方法加载配置文件的指定属性名的属性值

 */
@Configuration
public class DruidDataSourceConfiguration {
    @Bean   // 表是该方法的返回值会作为 spring容器中的一个bean进行管理
    @Primary // 如果存在类型相同的数据源对象，则有限使用本springbean
    @ConfigurationProperties(prefix = "spring.datasource") // 自动读取springboot框架的application.properties文件中的配置信息的值
    // 要求制定前缀
    public DataSource initDruidDataSource(){
        return new DruidDataSource();
    }
}
package com.jz.configure;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;

 /**
 *
 * @author lee
 * @version 1.0
 * @since JDK 1.8.0
 * @create 2017-08-07 16:39:41
 * <p>Copyright: Copyrighy(c) 2017</p>
 * <p>Company: 中云远景</p>
 */
@Configuration
@ConfigurationProperties(prefix = "mybatis")
public class MybatisConfiguration   {
	private String typeAliasesPackage;
 
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
		fb.setDataSource(dataSource);
		fb.setTypeAliasesPackage(typeAliasesPackage);
		//分页拦截器
		PageInterceptor pageInterceptor = new PageInterceptor();
		Properties properties = new Properties();
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		properties.setProperty("dict", "mysql");
		pageInterceptor.setProperties(properties);
//        fb.setPlugins(new Interceptor[]{pageHelper});  
//		fb.getObject().getConfiguration().addInterceptor(pageInterceptor);
		//添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
        	fb.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
        	fb.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
            SqlSessionFactory sf =  fb.getObject();
            sf.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
            return sf;
        } catch (Exception e) {
        	
            e.printStackTrace();
            return fb.getObject();
        }
	
	}
  
	
	@Bean(name = "sqlSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
	@Bean 
	public PageHelper pageHelper() { 
		  PageHelper pageHelper = new PageHelper(); 
		  Properties p = new Properties(); 
		  p.setProperty("offsetAsPageNum", "true"); 
		  p.setProperty("rowBoundsWithCount", "true"); 
		  p.setProperty("reasonable", "true"); 
		  p.setProperty("dict", "oracle");
		  pageHelper.setProperties(p); 
		  return pageHelper; 
   }

	 
	  
}

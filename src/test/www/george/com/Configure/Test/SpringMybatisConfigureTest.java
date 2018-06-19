package www.george.com.Configure.Test;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class SpringMybatisConfigureTest {

    @Autowired
    @Qualifier("propertyConfigure")
    private PropertyPlaceholderConfigurer propertyPlaceholderConfigurer;

    @Autowired
    private BasicDataSource basicDataSource;

    @Test
    public void testSpringMybatisConfigureTest(){
        Assert.assertNotNull(propertyPlaceholderConfigurer);
    }

}

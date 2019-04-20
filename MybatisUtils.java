package utils;

import java.io.InputStream;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	public static SqlSessionFactory getFactory() {
		String conf = "conf.xml";
		InputStream inputStream = 
				MybatisUtils.class.getClassLoader().getResourceAsStream(conf);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		return factory;
	}


}

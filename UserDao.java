package dao;

import org.apache.ibatis.session.SqlSession;

import mapper.UserMapper;
import model.User;
import utils.MybatisUtils;


public class UserDao {
	public User login(User user) {
		SqlSession session = MybatisUtils.getFactory().openSession();	//获取会话
		UserMapper mapper = session.getMapper(UserMapper.class);
		//获取数据
		User user1 = mapper.login(user);
		session.close();	//关闭会话
		return user1;
	}
	
	public int register(User user) {
		SqlSession session = MybatisUtils.getFactory().openSession();	//获取会话
		UserMapper mapper = session.getMapper(UserMapper.class);
		//获取数据
		int user1 = mapper.register(user);
		session.commit();
		session.close();	//关闭会话
		return user1;
	}

}

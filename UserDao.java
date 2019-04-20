package dao;

import org.apache.ibatis.session.SqlSession;

import mapper.UserMapper;
import model.User;
import utils.MybatisUtils;


public class UserDao {
	public User login(User user) {
		SqlSession session = MybatisUtils.getFactory().openSession();	//��ȡ�Ự
		UserMapper mapper = session.getMapper(UserMapper.class);
		//��ȡ����
		User user1 = mapper.login(user);
		session.close();	//�رջỰ
		return user1;
	}
	
	public int register(User user) {
		SqlSession session = MybatisUtils.getFactory().openSession();	//��ȡ�Ự
		UserMapper mapper = session.getMapper(UserMapper.class);
		//��ȡ����
		int user1 = mapper.register(user);
		session.commit();
		session.close();	//�رջỰ
		return user1;
	}

}

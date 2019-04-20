package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import model.User;

public interface UserMapper {
	
	@Select("select * from user where username=#{username} and password=#{password}")
	public User login(User user);
	
	@Insert("insert into user(username,password)"
			+ "value(#{username},#{password})")
	public int register(User user);

}

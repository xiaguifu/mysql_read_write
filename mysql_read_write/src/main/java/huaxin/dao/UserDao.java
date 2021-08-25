package huaxin.dao;


import huaxin.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    int insert(User record);

    int insertSelective(User record);

    List<User> selectAll();
}
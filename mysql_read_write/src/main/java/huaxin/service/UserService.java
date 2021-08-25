package huaxin.service;

import huaxin.entity.User;

import java.util.List;

/**
 * @Descrition
 * @Author xiagf
 * @Date 2021/8/24 17:54
 * @Version 1.0
 */
public interface UserService {
    int insert(User record);

    int insertSelective(User record);

    List<User> selectAll();

}

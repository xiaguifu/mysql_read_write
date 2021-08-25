package huaxin.service;

import huaxin.annotation.Master;
import huaxin.dao.UserDao;
import huaxin.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Descrition
 * @Author xiagf
 * @Date 2021/8/24 17:56
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}

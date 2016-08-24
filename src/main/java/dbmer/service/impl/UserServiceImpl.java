package dbmer.service.impl;

import com.yougou.dao.UserRepository;
import com.yougou.domain.User;
import dbmer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
//@Component("userService")
@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(){

    }

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
     this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}

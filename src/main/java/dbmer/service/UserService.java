package dbmer.service;

import com.yougou.domain.User;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
public interface UserService {
    List<User> findAll();
}

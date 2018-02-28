package com.smallcorn.service;

import com.smallcorn.bean.User;
import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}

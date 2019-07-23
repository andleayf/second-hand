package com.xcy.service;

import com.xcy.pojo.Result;
import com.xcy.pojo.SearchHistory;
import com.xcy.pojo.User;


import java.util.List;

public interface UserService {

    List<SearchHistory> getUserSearchHistory(int id);

    int deleteSearchHistory(int id);

    int selectUserPhone(String phone);

    int userAdd(User user);

    int userLogin(User user);

    int userChangePassword(User user);

    int selectUserCode(User user);
}

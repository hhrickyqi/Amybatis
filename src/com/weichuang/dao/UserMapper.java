package com.weichuang.dao;

import com.weichuang.pojo.User;
import com.weichuang.vo.QueryVo;

import java.util.List;

public interface UserMapper {
    User getUserById(int id);
    User getUserByName(String name);

    void insertUser(User user);

    List<User> getUserByQueryVo(QueryVo vo);

    int getCountForUser();

    List<User> getUsersByNameAndSex(User user);

    List<User> getUserByIds(List<Integer> ids);

    List<User> getUsersByQueryVo(QueryVo vo);
}

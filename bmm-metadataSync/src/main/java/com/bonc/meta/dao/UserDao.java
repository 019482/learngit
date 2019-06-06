package com.bonc.meta.dao;

/**
 * Created by malz on 2019/5/30.
 */

import com.bonc.meta.bean.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
	public List<UserPO> findAll() ;
}

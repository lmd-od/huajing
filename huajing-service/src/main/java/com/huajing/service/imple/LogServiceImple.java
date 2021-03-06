package com.huajing.service.imple;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huajing.dao.user.UserDao;
import com.huajing.entity.User;
import com.huajing.service.LogService;

/**
 * LogService
* @Description: 登陆 Service
* @author MingDingLi
* @date 2016年2月25日 下午7:06:07
 */
@Service
public class LogServiceImple implements LogService{
	
	@Autowired
	private UserDao userDao;
	
	@Transactional(readOnly = false)
	public Map<String,Object> login(User user) {
		
		System.out.println("登陆 service");
		User userS = userDao.login(user);
		if(userS == null){
			System.out.println("用户"+user.getLoginName()+"不存在");
		}else{
			System.out.println("用户"+user.getLoginName()+"登陆成功!");
		}
		
		return null;
		
	}
	
}

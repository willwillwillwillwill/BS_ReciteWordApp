package www.george.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.george.com.dao.UserInfo;
import www.george.com.mapper.UserInfoMapper;


@Service
public class LoginService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private EmailService emailService;

    public boolean Login(final String email,
                      final String password) {
        //首先查询数据库 账号是否存在
        UserInfo userInfo = userInfoMapper.checkUser(email,password,1);
        if (userInfo != null) {
            return  true;
        }
        else
        {
            return false;
        }


    }


}

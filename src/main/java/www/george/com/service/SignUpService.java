package www.george.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.george.com.dao.UserInfo;
import www.george.com.mapper.UserInfoMapper;
//import www.george.com.myEnum.UserState;


@Service
public class SignUpService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private EmailService emailService;

    public boolean signUp(final String email,
                      final String password) {
        //首先查询数据库 账号是否存在
        UserInfo userInfo = userInfoMapper.checkUserExist(email);
        if (userInfo != null) {
            return  false;
        }

        userInfoMapper.addUser(email, password,0);
        // 发送邮件进行确认
        try {
            emailService.sendEmail(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public void activateAccount(final String email) {

        userInfoMapper.updateUser(email);

    }
}

package www.george.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.george.com.dao.UserInfo;
import www.george.com.mapper.UserInfoMapper;
import www.george.com.myEnum.UserState;


@Service
public class SignUpService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private EmailService emailService;

    public UserState signUp(final String firstName,
                      final String lastName,
                      final String emailAddr,
                      final String password) {
        //首先查询数据库 账号是否存在
        UserInfo userInfo = userInfoMapper.existAccount(emailAddr);
        if (userInfo != null) {
            if (userInfo.getEmailState().equals(1L)){
                return UserState.USER_EXIST_ACTIVE;
            } else {
                return UserState.USER_EXIST_UN_ACTIVE;
            }
        }

        userInfoMapper.addUser(firstName, lastName, emailAddr, password);
        // 发送邮件进行确认
        try {
            emailService.sendEmail(emailAddr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return UserState.USER_UN_ACTIVE;
    }

    public boolean activateAccount(final String email) {
        if(userInfoMapper.existAccount(email) == null)
            return false;
        userInfoMapper.updateAccount(email);
        return true;
    }
}

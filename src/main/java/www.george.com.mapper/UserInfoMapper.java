package www.george.com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.george.com.dao.UserInfo;

@Repository
public interface UserInfoMapper {
     int addUser(@Param("email") final String email,
                 @Param("password") final String password,
                 @Param("state")int state);

     UserInfo checkUser(@Param("email") final String email,
                        @Param("password") final String password,
                        @Param("state")int state);
     UserInfo checkUserExist(@Param("email") final String email);
     void updateUser(@Param("email") final String email);
}

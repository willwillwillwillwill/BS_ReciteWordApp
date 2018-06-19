package www.george.com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.george.com.dao.UserInfo;

@Repository
public interface UserInfoMapper {
    public int addUser(@Param("firstName") final String firstName,
                 @Param("lastName") final String lastName,
                 @Param("emailAddr") final String emailAddr,
                 @Param("password") final String password);

    public UserInfo existAccount(@Param("emailAddr") final String emailAddr);
}

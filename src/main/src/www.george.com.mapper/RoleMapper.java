package www.george.com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.george.com.dao.Role;

@Repository
public interface RoleMapper {
    public Role selectNameById(Long id);
}

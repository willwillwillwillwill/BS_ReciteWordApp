package www.george.com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.george.com.dao.UserInfo;
import www.george.com.dao.WordSet;

import java.util.List;

@Repository
public interface WordSetMapper {

     List<WordSet> getAllWord(@Param("wordSetOrder")int wordSetOrder);
     List<WordSet> getSingleWord(@Param("id") int id,@Param("wordSetOrder") int wordSetOrder);
     int getWordSetCount(@Param("wordSetOrder")int wordSetOrder);
}

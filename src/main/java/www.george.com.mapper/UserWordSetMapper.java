package www.george.com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import www.george.com.dao.MyWordBook;
import www.george.com.dao.WordSet;

import java.util.List;

@Repository
public interface UserWordSetMapper {
     List<Integer> getExistWordSet(@Param("email") final String email);
     void insertWord(@Param("email")String email,@Param("wordSetOrder")int wordSetOrder,@Param("wordList")List<WordSet> wordIdList,@Param("wordStatus") int WordStatus);
     void insertUserWordSetInfo(@Param("email") String email,@Param("wordSetOrder") int wordSetOrder);
     List<Integer> getAllWordId(@Param("wordSetOrder") int wordSetOrder, @Param("email")String email,@Param("wordStatus")int wordStatus);
     void updateWord(@Param("email")String email,@Param("wordSetOrder")int wordSetOrder,@Param("wordId")int wordId,@Param("wordStatus")int wordStatus);
     void deleteWordByWordSetOrder(@Param("wordSetOrder") int wordSetOrder,@Param("email") String email);
     void deleteWordSetInfo(@Param("email")String email,@Param("wordSetOrder")int wordSetOrder);
     int getWordCount(@Param("wordSetOrder") int wordSetOrder, @Param("email")String email,@Param("wordStatus")int wordStatus);
     void insertMyBookWord(@Param("email")String email,@Param("wordSetOrder")int wordSetOrder,@Param("wordId")int wordId);
     List<MyWordBook> selectAllWordFromMyWordBook(String email);
     void deleteMyBookWord(@Param("wordSetOrder")int wordSetOrder,@Param("email")String email,@Param("wordId")int wordId);
}

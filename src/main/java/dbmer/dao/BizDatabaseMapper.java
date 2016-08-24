package dbmer.dao;

import com.dbmer.model.BizDatabase;
import com.dbmer.model.BizDatabaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizDatabaseMapper {
    int countByExample(BizDatabaseExample example);

    int deleteByExample(BizDatabaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizDatabase record);

    int insertSelective(BizDatabase record);

    List<BizDatabase> selectByExample(BizDatabaseExample example);

    BizDatabase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizDatabase record, @Param("example") BizDatabaseExample example);

    int updateByExample(@Param("record") BizDatabase record, @Param("example") BizDatabaseExample example);

    int updateByPrimaryKeySelective(BizDatabase record);

    int updateByPrimaryKey(BizDatabase record);
}

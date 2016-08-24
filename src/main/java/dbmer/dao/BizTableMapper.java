package dbmer.dao;

import com.dbmer.model.BizTable;
import com.dbmer.model.BizTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizTableMapper {
    int countByExample(BizTableExample example);

    int deleteByExample(BizTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizTable record);

    int insertSelective(BizTable record);

    List<BizTable> selectByExample(BizTableExample example);

    BizTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizTable record, @Param("example") BizTableExample example);

    int updateByExample(@Param("record") BizTable record, @Param("example") BizTableExample example);

    int updateByPrimaryKeySelective(BizTable record);

    int updateByPrimaryKey(BizTable record);
}

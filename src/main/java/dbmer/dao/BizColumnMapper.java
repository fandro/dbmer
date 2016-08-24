package dbmer.dao;

import com.dbmer.model.BizColumn;
import com.dbmer.model.BizColumnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizColumnMapper {
    int countByExample(BizColumnExample example);

    int deleteByExample(BizColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizColumn record);

    int insertSelective(BizColumn record);

    List<BizColumn> selectByExample(BizColumnExample example);

    BizColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizColumn record, @Param("example") BizColumnExample example);

    int updateByExample(@Param("record") BizColumn record, @Param("example") BizColumnExample example);

    int updateByPrimaryKeySelective(BizColumn record);

    int updateByPrimaryKey(BizColumn record);
}

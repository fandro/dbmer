package dbmer.dao;

import com.dbmer.model.BizModule;
import com.dbmer.model.BizModuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizModuleMapper {
    int countByExample(BizModuleExample example);

    int deleteByExample(BizModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizModule record);

    int insertSelective(BizModule record);

    List<BizModule> selectByExample(BizModuleExample example);

    BizModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizModule record, @Param("example") BizModuleExample example);

    int updateByExample(@Param("record") BizModule record, @Param("example") BizModuleExample example);

    int updateByPrimaryKeySelective(BizModule record);

    int updateByPrimaryKey(BizModule record);
}

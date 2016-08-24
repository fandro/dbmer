package dbmer.dao;

import com.dbmer.model.BizModuleTableRelation;
import com.dbmer.model.BizModuleTableRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizModuleTableRelationMapper {
    int countByExample(BizModuleTableRelationExample example);

    int deleteByExample(BizModuleTableRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizModuleTableRelation record);

    int insertSelective(BizModuleTableRelation record);

    List<BizModuleTableRelation> selectByExample(BizModuleTableRelationExample example);

    BizModuleTableRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizModuleTableRelation record, @Param("example") BizModuleTableRelationExample example);

    int updateByExample(@Param("record") BizModuleTableRelation record, @Param("example") BizModuleTableRelationExample example);

    int updateByPrimaryKeySelective(BizModuleTableRelation record);

    int updateByPrimaryKey(BizModuleTableRelation record);
}

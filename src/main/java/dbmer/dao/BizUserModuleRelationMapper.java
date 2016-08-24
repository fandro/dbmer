package dbmer.dao;

import com.dbmer.model.BizUserModuleRelation;
import com.dbmer.model.BizUserModuleRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizUserModuleRelationMapper {
    int countByExample(BizUserModuleRelationExample example);

    int deleteByExample(BizUserModuleRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizUserModuleRelation record);

    int insertSelective(BizUserModuleRelation record);

    List<BizUserModuleRelation> selectByExample(BizUserModuleRelationExample example);

    BizUserModuleRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizUserModuleRelation record, @Param("example") BizUserModuleRelationExample example);

    int updateByExample(@Param("record") BizUserModuleRelation record, @Param("example") BizUserModuleRelationExample example);

    int updateByPrimaryKeySelective(BizUserModuleRelation record);

    int updateByPrimaryKey(BizUserModuleRelation record);
}

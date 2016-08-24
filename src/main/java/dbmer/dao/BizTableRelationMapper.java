package dbmer.dao;

import com.dbmer.model.BizTableRelation;
import com.dbmer.model.BizTableRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BizTableRelationMapper {
    int countByExample(BizTableRelationExample example);

    int deleteByExample(BizTableRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizTableRelation record);

    int insertSelective(BizTableRelation record);

    List<BizTableRelation> selectByExample(BizTableRelationExample example);

    BizTableRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizTableRelation record, @Param("example") BizTableRelationExample example);

    int updateByExample(@Param("record") BizTableRelation record, @Param("example") BizTableRelationExample example);

    int updateByPrimaryKeySelective(BizTableRelation record);

    int updateByPrimaryKey(BizTableRelation record);
}

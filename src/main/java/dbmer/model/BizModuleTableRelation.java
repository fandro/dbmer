package dbmer.model;

import java.util.Date;

public class BizModuleTableRelation {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 表id
     */
    private Integer bizTableId;

    /**
     * 业务模块id
     */
    private Integer bizModuleId;

    /**
     *
     */
    private Date createTime;

    public BizModuleTableRelation(Integer id, Integer bizTableId, Integer bizModuleId, Date createTime) {
        this.id = id;
        this.bizTableId = bizTableId;
        this.bizModuleId = bizModuleId;
        this.createTime = createTime;
    }

    /**
     * 自增id
     * @return id 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 表id
     * @return biz_table_id 表id
     */
    public Integer getBizTableId() {
        return bizTableId;
    }

    /**
     * 业务模块id
     * @return biz_module_id 业务模块id
     */
    public Integer getBizModuleId() {
        return bizModuleId;
    }

    /**
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }
}

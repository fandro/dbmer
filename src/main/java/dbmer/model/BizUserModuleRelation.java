package dbmer.model;

import java.util.Date;

public class BizUserModuleRelation {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer bizUserId;

    /**
     *
     */
    private Integer bizModuleId;

    /**
     *
     */
    private Date createTime;

    public BizUserModuleRelation(Integer id, Integer bizUserId, Integer bizModuleId, Date createTime) {
        this.id = id;
        this.bizUserId = bizUserId;
        this.bizModuleId = bizModuleId;
        this.createTime = createTime;
    }

    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return biz_user_id
     */
    public Integer getBizUserId() {
        return bizUserId;
    }

    /**
     *
     * @return biz_module_id
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

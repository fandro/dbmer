package dbmer.model;

import java.util.Date;

public class BizTableRelation {
    /**
     * 自增id
     */
    private Integer id;

    /**
     *
     */
    private Integer tableId;

    /**
     *
     */
    private Integer refTableId;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    public BizTableRelation(Integer id, Integer tableId, Integer refTableId, Date createTime, Date updateTime) {
        this.id = id;
        this.tableId = tableId;
        this.refTableId = refTableId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * 自增id
     * @return id 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return table_id
     */
    public Integer getTableId() {
        return tableId;
    }

    /**
     *
     * @return ref_table_id
     */
    public Integer getRefTableId() {
        return refTableId;
    }

    /**
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }
}

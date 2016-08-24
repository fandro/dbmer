package dbmer.model;

import java.util.Date;

public class BizColumn {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 列名
     */
    private String name;

    /**
     * 列注释
     */
    private String comment;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * 所属数据库id
     */
    private Integer bizDatabaseId;

    /**
     * 所属表id
     */
    private Integer bizTableId;

    /**
     * 0:不是键，1：主键，2：外键
     */
    private Byte keyType;

    /**
     * 是否允许为空
     */
    private byte[] notNull;

    /**
     * 关联表名
     */
    private Integer refTableId;

    /**
     * 关联列的id
     */
    private Integer refColumnId;

    /**
     * 是否不推荐使用
     */
    private byte[] isDeprecated;

    /**
     * 该列已经从数据库中删除
     */
    private byte[] isDeleted;

    public BizColumn(Integer id, String name, String comment, Date createTime, Date updateTime, Integer bizDatabaseId, Integer bizTableId, Byte keyType, byte[] notNull, Integer refTableId, Integer refColumnId, byte[] isDeprecated, byte[] isDeleted) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.bizDatabaseId = bizDatabaseId;
        this.bizTableId = bizTableId;
        this.keyType = keyType;
        this.notNull = notNull;
        this.refTableId = refTableId;
        this.refColumnId = refColumnId;
        this.isDeprecated = isDeprecated;
        this.isDeleted = isDeleted;
    }

    /**
     * 自增id
     * @return id 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 列名
     * @return name 列名
     */
    public String getName() {
        return name;
    }

    /**
     * 列注释
     * @return comment 列注释
     */
    public String getComment() {
        return comment;
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

    /**
     * 所属数据库id
     * @return biz_database_id 所属数据库id
     */
    public Integer getBizDatabaseId() {
        return bizDatabaseId;
    }

    /**
     * 所属表id
     * @return biz_table_id 所属表id
     */
    public Integer getBizTableId() {
        return bizTableId;
    }

    /**
     * 0:不是键，1：主键，2：外键
     * @return key_type 0:不是键，1：主键，2：外键
     */
    public Byte getKeyType() {
        return keyType;
    }

    /**
     * 是否允许为空
     * @return not_null 是否允许为空
     */
    public byte[] getNotNull() {
        return notNull;
    }

    /**
     * 关联表名
     * @return ref_table_id 关联表名
     */
    public Integer getRefTableId() {
        return refTableId;
    }

    /**
     * 关联列的id
     * @return ref_column_id 关联列的id
     */
    public Integer getRefColumnId() {
        return refColumnId;
    }

    /**
     * 是否不推荐使用
     * @return is_deprecated 是否不推荐使用
     */
    public byte[] getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * 该列已经从数据库中删除
     * @return is_deleted 该列已经从数据库中删除
     */
    public byte[] getIsDeleted() {
        return isDeleted;
    }
}

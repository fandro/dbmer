package dbmer.model;

import java.util.Date;

public class BizTable {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 表称
     */
    private String name;

    /**
     * 注释
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
     * 表的中文名称
     */
    private String cnName;

    public BizTable(Integer id, String name, String comment, Date createTime, Date updateTime, Integer bizDatabaseId, String cnName) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.bizDatabaseId = bizDatabaseId;
        this.cnName = cnName;
    }

    /**
     * 自增id
     * @return id 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 表称
     * @return name 表称
     */
    public String getName() {
        return name;
    }

    /**
     * 注释
     * @return comment 注释
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
     * 表的中文名称
     * @return cn_name 表的中文名称
     */
    public String getCnName() {
        return cnName;
    }
}

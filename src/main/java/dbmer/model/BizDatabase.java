package dbmer.model;

import java.util.Date;

public class BizDatabase {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 数据库名称
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
     * 数据库中文名称
     */
    private String cnName;

    public BizDatabase(Integer id, String name, String comment, Date createTime, Date updateTime, String cnName) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
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
     * 数据库名称
     * @return name 数据库名称
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
     * 数据库中文名称
     * @return cn_name 数据库中文名称
     */
    public String getCnName() {
        return cnName;
    }
}

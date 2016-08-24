package dbmer.model;

import java.util.Date;

public class BizModule {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 业务模块名称
     */
    private String name;

    /**
     * 业务模块说明
     */
    private String comment;

    /**
     * 创建人
     */
    private String creator;

    /**
     *
     */
    private Date createTime;

    public BizModule(Integer id, String name, String comment, String creator, Date createTime) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.creator = creator;
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
     * 业务模块名称
     * @return name 业务模块名称
     */
    public String getName() {
        return name;
    }

    /**
     * 业务模块说明
     * @return comment 业务模块说明
     */
    public String getComment() {
        return comment;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }
}

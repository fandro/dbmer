package dbmer.model;

import java.util.Date;

public class User {
    /**
     *
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 默认数据库id
     */
    private Integer defaultDatabaseId;

    /**
     *
     */
    private Date createTime;

    /**
     * 登录密码
     */
    private String passWord;

    public User(Integer id, String name, Integer defaultDatabaseId, Date createTime, String passWord) {
        this.id = id;
        this.name = name;
        this.defaultDatabaseId = defaultDatabaseId;
        this.createTime = createTime;
        this.passWord = passWord;
    }

    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 用户名
     * @return name 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 默认数据库id
     * @return default_database_id 默认数据库id
     */
    public Integer getDefaultDatabaseId() {
        return defaultDatabaseId;
    }

    /**
     *
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 登录密码
     * @return pass_word 登录密码
     */
    public String getPassWord() {
        return passWord;
    }
}

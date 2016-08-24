package dbmer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizColumnExample {
    /**
     * biz_column
     */
    protected String orderByClause;

    /**
     * biz_column
     */
    protected boolean distinct;

    /**
     * biz_column
     */
    protected List<Criteria> oredCriteria;

    public BizColumnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * biz_column 2016-08-23
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdIsNull() {
            addCriterion("biz_database_id is null");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdIsNotNull() {
            addCriterion("biz_database_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdEqualTo(Integer value) {
            addCriterion("biz_database_id =", value, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdNotEqualTo(Integer value) {
            addCriterion("biz_database_id <>", value, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdGreaterThan(Integer value) {
            addCriterion("biz_database_id >", value, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_database_id >=", value, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdLessThan(Integer value) {
            addCriterion("biz_database_id <", value, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("biz_database_id <=", value, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdIn(List<Integer> values) {
            addCriterion("biz_database_id in", values, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdNotIn(List<Integer> values) {
            addCriterion("biz_database_id not in", values, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdBetween(Integer value1, Integer value2) {
            addCriterion("biz_database_id between", value1, value2, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizDatabaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_database_id not between", value1, value2, "bizDatabaseId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdIsNull() {
            addCriterion("biz_table_id is null");
            return (Criteria) this;
        }

        public Criteria andBizTableIdIsNotNull() {
            addCriterion("biz_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizTableIdEqualTo(Integer value) {
            addCriterion("biz_table_id =", value, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdNotEqualTo(Integer value) {
            addCriterion("biz_table_id <>", value, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdGreaterThan(Integer value) {
            addCriterion("biz_table_id >", value, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_table_id >=", value, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdLessThan(Integer value) {
            addCriterion("biz_table_id <", value, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("biz_table_id <=", value, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdIn(List<Integer> values) {
            addCriterion("biz_table_id in", values, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdNotIn(List<Integer> values) {
            addCriterion("biz_table_id not in", values, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdBetween(Integer value1, Integer value2) {
            addCriterion("biz_table_id between", value1, value2, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andBizTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_table_id not between", value1, value2, "bizTableId");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIsNull() {
            addCriterion("key_type is null");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIsNotNull() {
            addCriterion("key_type is not null");
            return (Criteria) this;
        }

        public Criteria andKeyTypeEqualTo(Byte value) {
            addCriterion("key_type =", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotEqualTo(Byte value) {
            addCriterion("key_type <>", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeGreaterThan(Byte value) {
            addCriterion("key_type >", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("key_type >=", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLessThan(Byte value) {
            addCriterion("key_type <", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("key_type <=", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIn(List<Byte> values) {
            addCriterion("key_type in", values, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotIn(List<Byte> values) {
            addCriterion("key_type not in", values, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeBetween(Byte value1, Byte value2) {
            addCriterion("key_type between", value1, value2, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("key_type not between", value1, value2, "keyType");
            return (Criteria) this;
        }

        public Criteria andNotNullIsNull() {
            addCriterion("not_null is null");
            return (Criteria) this;
        }

        public Criteria andNotNullIsNotNull() {
            addCriterion("not_null is not null");
            return (Criteria) this;
        }

        public Criteria andNotNullEqualTo(byte[] value) {
            addCriterion("not_null =", value, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullNotEqualTo(byte[] value) {
            addCriterion("not_null <>", value, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullGreaterThan(byte[] value) {
            addCriterion("not_null >", value, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullGreaterThanOrEqualTo(byte[] value) {
            addCriterion("not_null >=", value, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullLessThan(byte[] value) {
            addCriterion("not_null <", value, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullLessThanOrEqualTo(byte[] value) {
            addCriterion("not_null <=", value, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullIn(List<byte[]> values) {
            addCriterion("not_null in", values, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullNotIn(List<byte[]> values) {
            addCriterion("not_null not in", values, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullBetween(byte[] value1, byte[] value2) {
            addCriterion("not_null between", value1, value2, "notNull");
            return (Criteria) this;
        }

        public Criteria andNotNullNotBetween(byte[] value1, byte[] value2) {
            addCriterion("not_null not between", value1, value2, "notNull");
            return (Criteria) this;
        }

        public Criteria andRefTableIdIsNull() {
            addCriterion("ref_table_id is null");
            return (Criteria) this;
        }

        public Criteria andRefTableIdIsNotNull() {
            addCriterion("ref_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefTableIdEqualTo(Integer value) {
            addCriterion("ref_table_id =", value, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdNotEqualTo(Integer value) {
            addCriterion("ref_table_id <>", value, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdGreaterThan(Integer value) {
            addCriterion("ref_table_id >", value, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_table_id >=", value, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdLessThan(Integer value) {
            addCriterion("ref_table_id <", value, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_table_id <=", value, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdIn(List<Integer> values) {
            addCriterion("ref_table_id in", values, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdNotIn(List<Integer> values) {
            addCriterion("ref_table_id not in", values, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_table_id between", value1, value2, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_table_id not between", value1, value2, "refTableId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdIsNull() {
            addCriterion("ref_column_id is null");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdIsNotNull() {
            addCriterion("ref_column_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdEqualTo(Integer value) {
            addCriterion("ref_column_id =", value, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdNotEqualTo(Integer value) {
            addCriterion("ref_column_id <>", value, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdGreaterThan(Integer value) {
            addCriterion("ref_column_id >", value, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_column_id >=", value, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdLessThan(Integer value) {
            addCriterion("ref_column_id <", value, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_column_id <=", value, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdIn(List<Integer> values) {
            addCriterion("ref_column_id in", values, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdNotIn(List<Integer> values) {
            addCriterion("ref_column_id not in", values, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_column_id between", value1, value2, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andRefColumnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_column_id not between", value1, value2, "refColumnId");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedIsNull() {
            addCriterion("is_deprecated is null");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedIsNotNull() {
            addCriterion("is_deprecated is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedEqualTo(byte[] value) {
            addCriterion("is_deprecated =", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedNotEqualTo(byte[] value) {
            addCriterion("is_deprecated <>", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedGreaterThan(byte[] value) {
            addCriterion("is_deprecated >", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedGreaterThanOrEqualTo(byte[] value) {
            addCriterion("is_deprecated >=", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedLessThan(byte[] value) {
            addCriterion("is_deprecated <", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedLessThanOrEqualTo(byte[] value) {
            addCriterion("is_deprecated <=", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedIn(List<byte[]> values) {
            addCriterion("is_deprecated in", values, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedNotIn(List<byte[]> values) {
            addCriterion("is_deprecated not in", values, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedBetween(byte[] value1, byte[] value2) {
            addCriterion("is_deprecated between", value1, value2, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedNotBetween(byte[] value1, byte[] value2) {
            addCriterion("is_deprecated not between", value1, value2, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(byte[] value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(byte[] value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(byte[] value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(byte[] value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(byte[] value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(byte[] value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<byte[]> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<byte[]> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(byte[] value1, byte[] value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(byte[] value1, byte[] value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     * biz_column
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * biz_column 2016-08-23
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}

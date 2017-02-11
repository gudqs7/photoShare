package cn.photo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAlbumdescIsNull() {
            addCriterion("albumdesc is null");
            return (Criteria) this;
        }

        public Criteria andAlbumdescIsNotNull() {
            addCriterion("albumdesc is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumdescEqualTo(String value) {
            addCriterion("albumdesc =", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotEqualTo(String value) {
            addCriterion("albumdesc <>", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescGreaterThan(String value) {
            addCriterion("albumdesc >", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescGreaterThanOrEqualTo(String value) {
            addCriterion("albumdesc >=", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescLessThan(String value) {
            addCriterion("albumdesc <", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescLessThanOrEqualTo(String value) {
            addCriterion("albumdesc <=", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescLike(String value) {
            addCriterion("albumdesc like", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotLike(String value) {
            addCriterion("albumdesc not like", value, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescIn(List<String> values) {
            addCriterion("albumdesc in", values, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotIn(List<String> values) {
            addCriterion("albumdesc not in", values, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescBetween(String value1, String value2) {
            addCriterion("albumdesc between", value1, value2, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andAlbumdescNotBetween(String value1, String value2) {
            addCriterion("albumdesc not between", value1, value2, "albumdesc");
            return (Criteria) this;
        }

        public Criteria andPhotoidIsNull() {
            addCriterion("photoid is null");
            return (Criteria) this;
        }

        public Criteria andPhotoidIsNotNull() {
            addCriterion("photoid is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoidEqualTo(Integer value) {
            addCriterion("photoid =", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotEqualTo(Integer value) {
            addCriterion("photoid <>", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidGreaterThan(Integer value) {
            addCriterion("photoid >", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("photoid >=", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLessThan(Integer value) {
            addCriterion("photoid <", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLessThanOrEqualTo(Integer value) {
            addCriterion("photoid <=", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidIn(List<Integer> values) {
            addCriterion("photoid in", values, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotIn(List<Integer> values) {
            addCriterion("photoid not in", values, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidBetween(Integer value1, Integer value2) {
            addCriterion("photoid between", value1, value2, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotBetween(Integer value1, Integer value2) {
            addCriterion("photoid not between", value1, value2, "photoid");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTotallookIsNull() {
            addCriterion("totallook is null");
            return (Criteria) this;
        }

        public Criteria andTotallookIsNotNull() {
            addCriterion("totallook is not null");
            return (Criteria) this;
        }

        public Criteria andTotallookEqualTo(Integer value) {
            addCriterion("totallook =", value, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookNotEqualTo(Integer value) {
            addCriterion("totallook <>", value, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookGreaterThan(Integer value) {
            addCriterion("totallook >", value, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookGreaterThanOrEqualTo(Integer value) {
            addCriterion("totallook >=", value, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookLessThan(Integer value) {
            addCriterion("totallook <", value, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookLessThanOrEqualTo(Integer value) {
            addCriterion("totallook <=", value, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookIn(List<Integer> values) {
            addCriterion("totallook in", values, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookNotIn(List<Integer> values) {
            addCriterion("totallook not in", values, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookBetween(Integer value1, Integer value2) {
            addCriterion("totallook between", value1, value2, "totallook");
            return (Criteria) this;
        }

        public Criteria andTotallookNotBetween(Integer value1, Integer value2) {
            addCriterion("totallook not between", value1, value2, "totallook");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数IsNull() {
            addCriterion("相册点赞总数 is null");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数IsNotNull() {
            addCriterion("相册点赞总数 is not null");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数EqualTo(Integer value) {
            addCriterion("相册点赞总数 =", value, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数NotEqualTo(Integer value) {
            addCriterion("相册点赞总数 <>", value, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数GreaterThan(Integer value) {
            addCriterion("相册点赞总数 >", value, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数GreaterThanOrEqualTo(Integer value) {
            addCriterion("相册点赞总数 >=", value, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数LessThan(Integer value) {
            addCriterion("相册点赞总数 <", value, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数LessThanOrEqualTo(Integer value) {
            addCriterion("相册点赞总数 <=", value, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数In(List<Integer> values) {
            addCriterion("相册点赞总数 in", values, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数NotIn(List<Integer> values) {
            addCriterion("相册点赞总数 not in", values, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数Between(Integer value1, Integer value2) {
            addCriterion("相册点赞总数 between", value1, value2, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria and相册点赞总数NotBetween(Integer value1, Integer value2) {
            addCriterion("相册点赞总数 not between", value1, value2, "相册点赞总数");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("isopen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("isopen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(Integer value) {
            addCriterion("isopen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(Integer value) {
            addCriterion("isopen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(Integer value) {
            addCriterion("isopen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(Integer value) {
            addCriterion("isopen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(Integer value) {
            addCriterion("isopen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(Integer value) {
            addCriterion("isopen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<Integer> values) {
            addCriterion("isopen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<Integer> values) {
            addCriterion("isopen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(Integer value1, Integer value2) {
            addCriterion("isopen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(Integer value1, Integer value2) {
            addCriterion("isopen not between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
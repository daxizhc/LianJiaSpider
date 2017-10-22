package com.spider.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LianjiaHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LianjiaHouseExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andXiaoquIsNull() {
            addCriterion("xiaoqu is null");
            return (Criteria) this;
        }

        public Criteria andXiaoquIsNotNull() {
            addCriterion("xiaoqu is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoquEqualTo(String value) {
            addCriterion("xiaoqu =", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotEqualTo(String value) {
            addCriterion("xiaoqu <>", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquGreaterThan(String value) {
            addCriterion("xiaoqu >", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquGreaterThanOrEqualTo(String value) {
            addCriterion("xiaoqu >=", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquLessThan(String value) {
            addCriterion("xiaoqu <", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquLessThanOrEqualTo(String value) {
            addCriterion("xiaoqu <=", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquLike(String value) {
            addCriterion("xiaoqu like", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotLike(String value) {
            addCriterion("xiaoqu not like", value, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquIn(List<String> values) {
            addCriterion("xiaoqu in", values, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotIn(List<String> values) {
            addCriterion("xiaoqu not in", values, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquBetween(String value1, String value2) {
            addCriterion("xiaoqu between", value1, value2, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andXiaoquNotBetween(String value1, String value2) {
            addCriterion("xiaoqu not between", value1, value2, "xiaoqu");
            return (Criteria) this;
        }

        public Criteria andMianjiIsNull() {
            addCriterion("mianji is null");
            return (Criteria) this;
        }

        public Criteria andMianjiIsNotNull() {
            addCriterion("mianji is not null");
            return (Criteria) this;
        }

        public Criteria andMianjiEqualTo(Float value) {
            addCriterion("mianji =", value, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiNotEqualTo(Float value) {
            addCriterion("mianji <>", value, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiGreaterThan(Float value) {
            addCriterion("mianji >", value, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiGreaterThanOrEqualTo(Float value) {
            addCriterion("mianji >=", value, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiLessThan(Float value) {
            addCriterion("mianji <", value, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiLessThanOrEqualTo(Float value) {
            addCriterion("mianji <=", value, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiIn(List<Float> values) {
            addCriterion("mianji in", values, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiNotIn(List<Float> values) {
            addCriterion("mianji not in", values, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiBetween(Float value1, Float value2) {
            addCriterion("mianji between", value1, value2, "mianji");
            return (Criteria) this;
        }

        public Criteria andMianjiNotBetween(Float value1, Float value2) {
            addCriterion("mianji not between", value1, value2, "mianji");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andFocusIsNull() {
            addCriterion("focus is null");
            return (Criteria) this;
        }

        public Criteria andFocusIsNotNull() {
            addCriterion("focus is not null");
            return (Criteria) this;
        }

        public Criteria andFocusEqualTo(Integer value) {
            addCriterion("focus =", value, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusNotEqualTo(Integer value) {
            addCriterion("focus <>", value, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusGreaterThan(Integer value) {
            addCriterion("focus >", value, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus >=", value, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusLessThan(Integer value) {
            addCriterion("focus <", value, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusLessThanOrEqualTo(Integer value) {
            addCriterion("focus <=", value, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusIn(List<Integer> values) {
            addCriterion("focus in", values, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusNotIn(List<Integer> values) {
            addCriterion("focus not in", values, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusBetween(Integer value1, Integer value2) {
            addCriterion("focus between", value1, value2, "focus");
            return (Criteria) this;
        }

        public Criteria andFocusNotBetween(Integer value1, Integer value2) {
            addCriterion("focus not between", value1, value2, "focus");
            return (Criteria) this;
        }

        public Criteria andWatchIsNull() {
            addCriterion("watch is null");
            return (Criteria) this;
        }

        public Criteria andWatchIsNotNull() {
            addCriterion("watch is not null");
            return (Criteria) this;
        }

        public Criteria andWatchEqualTo(Integer value) {
            addCriterion("watch =", value, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchNotEqualTo(Integer value) {
            addCriterion("watch <>", value, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchGreaterThan(Integer value) {
            addCriterion("watch >", value, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("watch >=", value, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchLessThan(Integer value) {
            addCriterion("watch <", value, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchLessThanOrEqualTo(Integer value) {
            addCriterion("watch <=", value, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchIn(List<Integer> values) {
            addCriterion("watch in", values, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchNotIn(List<Integer> values) {
            addCriterion("watch not in", values, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchBetween(Integer value1, Integer value2) {
            addCriterion("watch between", value1, value2, "watch");
            return (Criteria) this;
        }

        public Criteria andWatchNotBetween(Integer value1, Integer value2) {
            addCriterion("watch not between", value1, value2, "watch");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Integer value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Integer value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Integer value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Integer value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Integer> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Integer> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvgPriceEqualTo(Integer value) {
            addCriterion("avg_price =", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotEqualTo(Integer value) {
            addCriterion("avg_price <>", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThan(Integer value) {
            addCriterion("avg_price >", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_price >=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThan(Integer value) {
            addCriterion("avg_price <", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceLessThanOrEqualTo(Integer value) {
            addCriterion("avg_price <=", value, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceIn(List<Integer> values) {
            addCriterion("avg_price in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotIn(List<Integer> values) {
            addCriterion("avg_price not in", values, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceBetween(Integer value1, Integer value2) {
            addCriterion("avg_price between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andAvgPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_price not between", value1, value2, "avgPrice");
            return (Criteria) this;
        }

        public Criteria andJingduIsNull() {
            addCriterion("jingdu is null");
            return (Criteria) this;
        }

        public Criteria andJingduIsNotNull() {
            addCriterion("jingdu is not null");
            return (Criteria) this;
        }

        public Criteria andJingduEqualTo(Double value) {
            addCriterion("jingdu =", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotEqualTo(Double value) {
            addCriterion("jingdu <>", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduGreaterThan(Double value) {
            addCriterion("jingdu >", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduGreaterThanOrEqualTo(Double value) {
            addCriterion("jingdu >=", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduLessThan(Double value) {
            addCriterion("jingdu <", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduLessThanOrEqualTo(Double value) {
            addCriterion("jingdu <=", value, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduIn(List<Double> values) {
            addCriterion("jingdu in", values, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotIn(List<Double> values) {
            addCriterion("jingdu not in", values, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduBetween(Double value1, Double value2) {
            addCriterion("jingdu between", value1, value2, "jingdu");
            return (Criteria) this;
        }

        public Criteria andJingduNotBetween(Double value1, Double value2) {
            addCriterion("jingdu not between", value1, value2, "jingdu");
            return (Criteria) this;
        }

        public Criteria andWeiduIsNull() {
            addCriterion("weidu is null");
            return (Criteria) this;
        }

        public Criteria andWeiduIsNotNull() {
            addCriterion("weidu is not null");
            return (Criteria) this;
        }

        public Criteria andWeiduEqualTo(Double value) {
            addCriterion("weidu =", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotEqualTo(Double value) {
            addCriterion("weidu <>", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduGreaterThan(Double value) {
            addCriterion("weidu >", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduGreaterThanOrEqualTo(Double value) {
            addCriterion("weidu >=", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLessThan(Double value) {
            addCriterion("weidu <", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduLessThanOrEqualTo(Double value) {
            addCriterion("weidu <=", value, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduIn(List<Double> values) {
            addCriterion("weidu in", values, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotIn(List<Double> values) {
            addCriterion("weidu not in", values, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduBetween(Double value1, Double value2) {
            addCriterion("weidu between", value1, value2, "weidu");
            return (Criteria) this;
        }

        public Criteria andWeiduNotBetween(Double value1, Double value2) {
            addCriterion("weidu not between", value1, value2, "weidu");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andQuIsNull() {
            addCriterion("qu is null");
            return (Criteria) this;
        }

        public Criteria andQuIsNotNull() {
            addCriterion("qu is not null");
            return (Criteria) this;
        }

        public Criteria andQuEqualTo(String value) {
            addCriterion("qu =", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotEqualTo(String value) {
            addCriterion("qu <>", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuGreaterThan(String value) {
            addCriterion("qu >", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuGreaterThanOrEqualTo(String value) {
            addCriterion("qu >=", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLessThan(String value) {
            addCriterion("qu <", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLessThanOrEqualTo(String value) {
            addCriterion("qu <=", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLike(String value) {
            addCriterion("qu like", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotLike(String value) {
            addCriterion("qu not like", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuIn(List<String> values) {
            addCriterion("qu in", values, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotIn(List<String> values) {
            addCriterion("qu not in", values, "qu");
            return (Criteria) this;
        }

        public Criteria andQuBetween(String value1, String value2) {
            addCriterion("qu between", value1, value2, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotBetween(String value1, String value2) {
            addCriterion("qu not between", value1, value2, "qu");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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
package com.personal.mock.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockAppQuery implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MockAppQuery() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        private static final long serialVersionUID = 1L;

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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIsNull() {
            addCriterion("request_type is null");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIsNotNull() {
            addCriterion("request_type is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTypeEqualTo(String value) {
            addCriterion("request_type =", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeNotEqualTo(String value) {
            addCriterion("request_type <>", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeGreaterThan(String value) {
            addCriterion("request_type >", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("request_type >=", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeLessThan(String value) {
            addCriterion("request_type <", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeLessThanOrEqualTo(String value) {
            addCriterion("request_type <=", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeLike(String value) {
            addCriterion("request_type like", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeNotLike(String value) {
            addCriterion("request_type not like", value, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIn(List<String> values) {
            addCriterion("request_type in", values, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeNotIn(List<String> values) {
            addCriterion("request_type not in", values, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeBetween(String value1, String value2) {
            addCriterion("request_type between", value1, value2, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestTypeNotBetween(String value1, String value2) {
            addCriterion("request_type not between", value1, value2, "requestType");
            return (Criteria) this;
        }

        public Criteria andRequestUriIsNull() {
            addCriterion("request_uri is null");
            return (Criteria) this;
        }

        public Criteria andRequestUriIsNotNull() {
            addCriterion("request_uri is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUriEqualTo(String value) {
            addCriterion("request_uri =", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotEqualTo(String value) {
            addCriterion("request_uri <>", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriGreaterThan(String value) {
            addCriterion("request_uri >", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriGreaterThanOrEqualTo(String value) {
            addCriterion("request_uri >=", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLessThan(String value) {
            addCriterion("request_uri <", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLessThanOrEqualTo(String value) {
            addCriterion("request_uri <=", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLike(String value) {
            addCriterion("request_uri like", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotLike(String value) {
            addCriterion("request_uri not like", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriIn(List<String> values) {
            addCriterion("request_uri in", values, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotIn(List<String> values) {
            addCriterion("request_uri not in", values, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriBetween(String value1, String value2) {
            addCriterion("request_uri between", value1, value2, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotBetween(String value1, String value2) {
            addCriterion("request_uri not between", value1, value2, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestQueryIsNull() {
            addCriterion("request_query is null");
            return (Criteria) this;
        }

        public Criteria andRequestQueryIsNotNull() {
            addCriterion("request_query is not null");
            return (Criteria) this;
        }

        public Criteria andRequestQueryEqualTo(String value) {
            addCriterion("request_query =", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryNotEqualTo(String value) {
            addCriterion("request_query <>", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryGreaterThan(String value) {
            addCriterion("request_query >", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryGreaterThanOrEqualTo(String value) {
            addCriterion("request_query >=", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryLessThan(String value) {
            addCriterion("request_query <", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryLessThanOrEqualTo(String value) {
            addCriterion("request_query <=", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryLike(String value) {
            addCriterion("request_query like", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryNotLike(String value) {
            addCriterion("request_query not like", value, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryIn(List<String> values) {
            addCriterion("request_query in", values, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryNotIn(List<String> values) {
            addCriterion("request_query not in", values, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryBetween(String value1, String value2) {
            addCriterion("request_query between", value1, value2, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestQueryNotBetween(String value1, String value2) {
            addCriterion("request_query not between", value1, value2, "requestQuery");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIsNull() {
            addCriterion("request_body is null");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIsNotNull() {
            addCriterion("request_body is not null");
            return (Criteria) this;
        }

        public Criteria andRequestBodyEqualTo(String value) {
            addCriterion("request_body =", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotEqualTo(String value) {
            addCriterion("request_body <>", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyGreaterThan(String value) {
            addCriterion("request_body >", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyGreaterThanOrEqualTo(String value) {
            addCriterion("request_body >=", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLessThan(String value) {
            addCriterion("request_body <", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLessThanOrEqualTo(String value) {
            addCriterion("request_body <=", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLike(String value) {
            addCriterion("request_body like", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotLike(String value) {
            addCriterion("request_body not like", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIn(List<String> values) {
            addCriterion("request_body in", values, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotIn(List<String> values) {
            addCriterion("request_body not in", values, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyBetween(String value1, String value2) {
            addCriterion("request_body between", value1, value2, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotBetween(String value1, String value2) {
            addCriterion("request_body not between", value1, value2, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderIsNull() {
            addCriterion("request_header is null");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderIsNotNull() {
            addCriterion("request_header is not null");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderEqualTo(String value) {
            addCriterion("request_header =", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotEqualTo(String value) {
            addCriterion("request_header <>", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderGreaterThan(String value) {
            addCriterion("request_header >", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("request_header >=", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderLessThan(String value) {
            addCriterion("request_header <", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderLessThanOrEqualTo(String value) {
            addCriterion("request_header <=", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderLike(String value) {
            addCriterion("request_header like", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotLike(String value) {
            addCriterion("request_header not like", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderIn(List<String> values) {
            addCriterion("request_header in", values, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotIn(List<String> values) {
            addCriterion("request_header not in", values, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderBetween(String value1, String value2) {
            addCriterion("request_header between", value1, value2, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotBetween(String value1, String value2) {
            addCriterion("request_header not between", value1, value2, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andMockDataIsNull() {
            addCriterion("mock_data is null");
            return (Criteria) this;
        }

        public Criteria andMockDataIsNotNull() {
            addCriterion("mock_data is not null");
            return (Criteria) this;
        }

        public Criteria andMockDataEqualTo(String value) {
            addCriterion("mock_data =", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataNotEqualTo(String value) {
            addCriterion("mock_data <>", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataGreaterThan(String value) {
            addCriterion("mock_data >", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataGreaterThanOrEqualTo(String value) {
            addCriterion("mock_data >=", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataLessThan(String value) {
            addCriterion("mock_data <", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataLessThanOrEqualTo(String value) {
            addCriterion("mock_data <=", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataLike(String value) {
            addCriterion("mock_data like", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataNotLike(String value) {
            addCriterion("mock_data not like", value, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataIn(List<String> values) {
            addCriterion("mock_data in", values, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataNotIn(List<String> values) {
            addCriterion("mock_data not in", values, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataBetween(String value1, String value2) {
            addCriterion("mock_data between", value1, value2, "mockData");
            return (Criteria) this;
        }

        public Criteria andMockDataNotBetween(String value1, String value2) {
            addCriterion("mock_data not between", value1, value2, "mockData");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeIsNull() {
            addCriterion("redirect_type is null");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeIsNotNull() {
            addCriterion("redirect_type is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeEqualTo(String value) {
            addCriterion("redirect_type =", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotEqualTo(String value) {
            addCriterion("redirect_type <>", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeGreaterThan(String value) {
            addCriterion("redirect_type >", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_type >=", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeLessThan(String value) {
            addCriterion("redirect_type <", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeLessThanOrEqualTo(String value) {
            addCriterion("redirect_type <=", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeLike(String value) {
            addCriterion("redirect_type like", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotLike(String value) {
            addCriterion("redirect_type not like", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeIn(List<String> values) {
            addCriterion("redirect_type in", values, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotIn(List<String> values) {
            addCriterion("redirect_type not in", values, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeBetween(String value1, String value2) {
            addCriterion("redirect_type between", value1, value2, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotBetween(String value1, String value2) {
            addCriterion("redirect_type not between", value1, value2, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNull() {
            addCriterion("redirect_url is null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNotNull() {
            addCriterion("redirect_url is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlEqualTo(String value) {
            addCriterion("redirect_url =", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotEqualTo(String value) {
            addCriterion("redirect_url <>", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThan(String value) {
            addCriterion("redirect_url >", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_url >=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThan(String value) {
            addCriterion("redirect_url <", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThanOrEqualTo(String value) {
            addCriterion("redirect_url <=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLike(String value) {
            addCriterion("redirect_url like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotLike(String value) {
            addCriterion("redirect_url not like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIn(List<String> values) {
            addCriterion("redirect_url in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotIn(List<String> values) {
            addCriterion("redirect_url not in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlBetween(String value1, String value2) {
            addCriterion("redirect_url between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotBetween(String value1, String value2) {
            addCriterion("redirect_url not between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryIsNull() {
            addCriterion("redirect_query is null");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryIsNotNull() {
            addCriterion("redirect_query is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryEqualTo(String value) {
            addCriterion("redirect_query =", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryNotEqualTo(String value) {
            addCriterion("redirect_query <>", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryGreaterThan(String value) {
            addCriterion("redirect_query >", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_query >=", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryLessThan(String value) {
            addCriterion("redirect_query <", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryLessThanOrEqualTo(String value) {
            addCriterion("redirect_query <=", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryLike(String value) {
            addCriterion("redirect_query like", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryNotLike(String value) {
            addCriterion("redirect_query not like", value, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryIn(List<String> values) {
            addCriterion("redirect_query in", values, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryNotIn(List<String> values) {
            addCriterion("redirect_query not in", values, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryBetween(String value1, String value2) {
            addCriterion("redirect_query between", value1, value2, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectQueryNotBetween(String value1, String value2) {
            addCriterion("redirect_query not between", value1, value2, "redirectQuery");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyIsNull() {
            addCriterion("redirect_body is null");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyIsNotNull() {
            addCriterion("redirect_body is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyEqualTo(String value) {
            addCriterion("redirect_body =", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyNotEqualTo(String value) {
            addCriterion("redirect_body <>", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyGreaterThan(String value) {
            addCriterion("redirect_body >", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_body >=", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyLessThan(String value) {
            addCriterion("redirect_body <", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyLessThanOrEqualTo(String value) {
            addCriterion("redirect_body <=", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyLike(String value) {
            addCriterion("redirect_body like", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyNotLike(String value) {
            addCriterion("redirect_body not like", value, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyIn(List<String> values) {
            addCriterion("redirect_body in", values, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyNotIn(List<String> values) {
            addCriterion("redirect_body not in", values, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyBetween(String value1, String value2) {
            addCriterion("redirect_body between", value1, value2, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectBodyNotBetween(String value1, String value2) {
            addCriterion("redirect_body not between", value1, value2, "redirectBody");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderIsNull() {
            addCriterion("redirect_header is null");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderIsNotNull() {
            addCriterion("redirect_header is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderEqualTo(String value) {
            addCriterion("redirect_header =", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderNotEqualTo(String value) {
            addCriterion("redirect_header <>", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderGreaterThan(String value) {
            addCriterion("redirect_header >", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_header >=", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderLessThan(String value) {
            addCriterion("redirect_header <", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderLessThanOrEqualTo(String value) {
            addCriterion("redirect_header <=", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderLike(String value) {
            addCriterion("redirect_header like", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderNotLike(String value) {
            addCriterion("redirect_header not like", value, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderIn(List<String> values) {
            addCriterion("redirect_header in", values, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderNotIn(List<String> values) {
            addCriterion("redirect_header not in", values, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderBetween(String value1, String value2) {
            addCriterion("redirect_header between", value1, value2, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andRedirectHeaderNotBetween(String value1, String value2) {
            addCriterion("redirect_header not between", value1, value2, "redirectHeader");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixIsNull() {
            addCriterion("proxy_url_perfix is null");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixIsNotNull() {
            addCriterion("proxy_url_perfix is not null");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixEqualTo(String value) {
            addCriterion("proxy_url_perfix =", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixNotEqualTo(String value) {
            addCriterion("proxy_url_perfix <>", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixGreaterThan(String value) {
            addCriterion("proxy_url_perfix >", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixGreaterThanOrEqualTo(String value) {
            addCriterion("proxy_url_perfix >=", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixLessThan(String value) {
            addCriterion("proxy_url_perfix <", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixLessThanOrEqualTo(String value) {
            addCriterion("proxy_url_perfix <=", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixLike(String value) {
            addCriterion("proxy_url_perfix like", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixNotLike(String value) {
            addCriterion("proxy_url_perfix not like", value, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixIn(List<String> values) {
            addCriterion("proxy_url_perfix in", values, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixNotIn(List<String> values) {
            addCriterion("proxy_url_perfix not in", values, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixBetween(String value1, String value2) {
            addCriterion("proxy_url_perfix between", value1, value2, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andProxyUrlPerfixNotBetween(String value1, String value2) {
            addCriterion("proxy_url_perfix not between", value1, value2, "proxyUrlPerfix");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
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

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        private static final long serialVersionUID = 1L;

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
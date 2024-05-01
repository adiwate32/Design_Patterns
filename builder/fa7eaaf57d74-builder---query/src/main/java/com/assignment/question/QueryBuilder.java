package com.assignment.question;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    public QueryBuilder(String select, String from, String where, String join, String orderBy, String groupBy) {
        this.select = select;
        this.from = from;
        this.where = where;
        this.join = join;
        this.orderBy = orderBy;
        this.groupBy = groupBy;
    }

    public static class Builder{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public void setSelect(String select) {
            this.select = select;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public void setWhere(String where) {
            this.where = where;
        }

        public void setJoin(String join) {
            this.join = join;
        }

        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }

        public void setGroupBy(String groupBy) {
            this.groupBy = groupBy;
        }
        
        public QueryBuilder build() {
            return new QueryBuilder(select, from, where, join, orderBy, groupBy);
        }
    }

    private static Builder getBuilder(){
        return new Builder();
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    public String getJoin() {
        return join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }
}
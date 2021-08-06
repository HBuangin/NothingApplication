package com.nxzzld.nothingappication.base;

import java.util.List;

public class PagingEntity<T> {

    /**
     * current : 1
     * hitCount : false
     * orders : []
     * pages : 1
     * records : [{"activityApplies":[],"activityCategory":null,"activityStatus":"2","address":"宁夏银川市西夏区怀远路工人文化宫","applyBeginTime":"2020-06-09T16:00:00","applyDeadline":"2020-06-11T16:00:00","appraiseCount":null,"beginTime":"2020-06-12T05:02:39","bodyCount":null,"categoryId":null,"content":"文化联谊交友会","coverImage":"/uploads/image/20200609200401998406.jpg","createdAt":"2020-06-10 11:10:19","deleted":0,"endTime":"2020-06-19T16:00:00","id":"1270553851312738306","joinCondition":"全体团员","judgeTime":null,"judgeUserId":null,"location":"12;41","name":"文化联谊交友会","orgCode":"600001030004000","projectInsId":null,"publicUserId":"10004991","rangeRoles":"全部","status":"1","targetType":1,"type":null}]
     * searchCount : true
     * size : 50
     * total : 1
     */

    private int current;
    private boolean hitCount;
    private int pages;
    private boolean searchCount;
    private int size;
    private int total;
    private List<?> orders;
    private List<T> records;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isHitCount() {
        return hitCount;
    }

    public void setHitCount(boolean hitCount) {
        this.hitCount = hitCount;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getOrders() {
        return orders;
    }

    public void setOrders(List<?> orders) {
        this.orders = orders;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}

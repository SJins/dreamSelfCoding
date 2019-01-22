package com.su.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询结果
 * 我们用Dubbo进行交互，无论是参数，还是返回值，只要是自定义类的
 * 都需要序列化
 */
public class PageVo<T> implements Serializable {

    private int count;//总数据
    private int currpage;// 当前页码
    private int size;// 每页显示的数量
    private List<T> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

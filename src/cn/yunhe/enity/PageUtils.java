package cn.yunhe.enity;

import java.util.List;

public class PageUtils {
    private int currentPage;
    private int pageSize;
    private int total;
    private List<Account> list;

    public PageUtils(int currentPage, int pageSize, int total, List<Account> list) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    public PageUtils() {
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Account> getList() {
        return list;
    }

    public void setList(List<Account> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageUtils{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}

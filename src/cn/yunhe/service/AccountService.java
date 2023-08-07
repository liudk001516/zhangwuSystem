package cn.yunhe.service;

import cn.yunhe.enity.PageUtils;

public interface AccountService {

    PageUtils selectLimit(String currentPage, String pageSize);
}

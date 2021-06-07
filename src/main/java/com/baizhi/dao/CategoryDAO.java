package com.baizhi.dao;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryDAO {

    Category queryById();

    List<Category> queryAll();

}

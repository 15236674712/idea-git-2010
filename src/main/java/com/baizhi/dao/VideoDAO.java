package com.baizhi.dao;

import com.baizhi.entity.Video;

import java.util.List;

public interface VideoDAO {

    List<Video> queryAll();

    Video queryById();
}

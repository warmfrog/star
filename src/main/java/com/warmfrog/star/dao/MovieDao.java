package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.MovieExtMapper;
import com.warmfrog.star.dao.mapper.MovieMapper;
import com.warmfrog.star.dao.mapper.entity.Movie;

/**
 * @author libo
 * @date 2020/2/6
 */
public class MovieDao extends BaseDao<MovieMapper, MovieExtMapper, Movie> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(MovieMapper.class);
        this.setExtMapperClass(MovieExtMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(Movie.class);
    }
}

package com.warmfrog.star.dao;

import com.warmfrog.star.dao.extmapper.BookExtMapper;
import com.warmfrog.star.dao.mapper.BookMapper;
import com.warmfrog.star.dao.mapper.entity.Book;

/**
 * @author libo
 * @date 2020/2/6
 */
public class BookDao extends BaseDao<BookMapper, BookExtMapper, Book> {
    @Override
    protected void setMapperClass() {
        this.setMapperClass(BookMapper.class);
        this.setExtMapperClass(BookExtMapper.class);
    }

    @Override
    protected void setEntityClass() {

    }
}

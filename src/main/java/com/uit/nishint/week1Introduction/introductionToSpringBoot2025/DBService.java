package com.uit.nishint.week1Introduction.introductionToSpringBoot2025;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService
{
    final private DB db; // now immutable

    public DBService(DB db)
    {
        this.db=db;
    }

    String getData()
    {
        return db.getData();
    }
}

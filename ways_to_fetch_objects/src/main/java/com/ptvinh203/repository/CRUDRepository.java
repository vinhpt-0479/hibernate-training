package com.ptvinh203.repository;

import java.util.List;

public interface CRUDRepository<T, ID> {

    public List<T> selectAll();

    public T selectById(ID id);

    public boolean save(T data);

    public T update(ID id, T data);

    public void delete(ID id);
}

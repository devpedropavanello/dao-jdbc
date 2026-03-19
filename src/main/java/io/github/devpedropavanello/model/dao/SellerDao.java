package io.github.devpedropavanello.model.dao;

import io.github.devpedropavanello.model.entities.Department;
import io.github.devpedropavanello.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}

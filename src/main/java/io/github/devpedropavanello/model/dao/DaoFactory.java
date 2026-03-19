package io.github.devpedropavanello.model.dao;

import io.github.devpedropavanello.db.DB;
import io.github.devpedropavanello.model.dao.impl.DepartmentDaoJDBC;
import io.github.devpedropavanello.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}

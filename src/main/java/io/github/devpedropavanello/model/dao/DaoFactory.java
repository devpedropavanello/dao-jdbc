package io.github.devpedropavanello.model.dao;

import io.github.devpedropavanello.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}

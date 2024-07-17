package model.dao;

import model.entity.Passport;

public class PassportDAO extends GenericDAO<Passport> {
    public PassportDAO() {
        super(Passport.class);
    }
}
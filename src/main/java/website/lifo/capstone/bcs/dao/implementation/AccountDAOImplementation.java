package website.lifo.capstone.bcs.dao.implementation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import website.lifo.capstone.bcs.dao.AccountDAO;
import website.lifo.capstone.bcs.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

// Transactional for Hibernate
@Repository
public class AccountDAOImplementation implements AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Account findAccount(String userName) {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Account> crit = builder.createQuery(Account.class);

        crit.add(Restrictions.eq("userName", userName));
        return (Account) crit.uniqueResult();
    }


}
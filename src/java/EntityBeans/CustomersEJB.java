/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityBeans;

import Entity.Customers;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author ayeps
 */
@Named
@Stateless

public class CustomersEJB {

    @Inject
    private EntityManager em;

    public List<Customers> findCustomers() {

        TypedQuery<Customers> query = em.createNamedQuery("Customers.findAll", Customers.class);
        return query.getResultList();
    }

    public Customers createCustomer(Customers customer) {
        em.persist(customer);
        return customer;
    }

    public void deleteCustomer(Customers customer) {
        em.remove(customer);
    }

    public Customers updateCustomer(Customers customer) {
        return em.merge(customer);
    }

    public Customers findCustomerID(Integer id) {
        return em.find(Customers.class, id);

    }

}

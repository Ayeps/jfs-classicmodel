/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entity.Customers;
import EntityBeans.CustomersEJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author ayeps
 */

@Named
@RequestScoped
public class CustomersController {

    @Inject
    private CustomersEJB customerEJB;
    private Customers customers = new Customers();

    public void findCustomer() {
        //customers = customerEJB.findCustomerID()

        customers = customerEJB.findCustomerID(customers.getCustomerNumber());
    }

    public String doCreateCustomers() {

        customerEJB.createCustomer(customers);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Customer Added", "The customer" + customers.getCustomerName() + " has been created with id=" + customers.getCustomerNumber()
                ));

        return "newcustomers.xhtml";

    }

    public CustomersEJB getCustomerEJB() {
        return customerEJB;
    }

    public void setCustomerEJB(CustomersEJB customerEJB) {
        this.customerEJB = customerEJB;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

}

package Entity;

import Entity.Orderdetails;
import Entity.Productlines;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-06T03:54:12")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> productScale;
    public static volatile CollectionAttribute<Products, Orderdetails> orderdetailsCollection;
    public static volatile SingularAttribute<Products, Short> quantityInStock;
    public static volatile SingularAttribute<Products, Double> msrp;
    public static volatile SingularAttribute<Products, String> productCode;
    public static volatile SingularAttribute<Products, String> productDescription;
    public static volatile SingularAttribute<Products, Productlines> productLine;
    public static volatile SingularAttribute<Products, Double> buyPrice;
    public static volatile SingularAttribute<Products, String> productVendor;
    public static volatile SingularAttribute<Products, String> productName;

}
package Entity;

import Entity.Employees;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-06T03:54:12")
@StaticMetamodel(Offices.class)
public class Offices_ { 

    public static volatile CollectionAttribute<Offices, Employees> employeesCollection;
    public static volatile SingularAttribute<Offices, String> officeCode;
    public static volatile SingularAttribute<Offices, String> phone;
    public static volatile SingularAttribute<Offices, String> postalCode;
    public static volatile SingularAttribute<Offices, String> territory;
    public static volatile SingularAttribute<Offices, String> state;
    public static volatile SingularAttribute<Offices, String> addressLine2;
    public static volatile SingularAttribute<Offices, String> addressLine1;
    public static volatile SingularAttribute<Offices, String> city;
    public static volatile SingularAttribute<Offices, String> country;

}
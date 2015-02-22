package rent; //TODO: I'm not sure whether a package name is correct.

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rent")
public class Rent{

  @Id
  @Column(name = "id")
  private Long id;

  //TODO: maybe mysql provide location sutructure, investigate it, please
  //TODO: you can find information here http://dev.mysql.com/doc/refman/5.6/en/spatial-extensions.html
  private Long lat;
  private Long lon;

  private String titleName;
  private Date date;

  private Double pricePerMonth;

  //TODO: should be address and contacts
  //TODO: prefer to use @Embeddable, see details here http://www.concretepage.com/hibernate/example-embeddable-embedded-hibernate-annotation 
}
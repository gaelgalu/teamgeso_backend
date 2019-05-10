package teamgeso.CIapp.Models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.io.Serializable;

@Entity
@Table(name="Producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Long id;

    @Column(nullable = false)
    private String productCode;

    @Column(nullable = false)
    private String productName;

    @Column(name = "", nullable = false)
    private Timestamp expirationDate;

    @Column(name = "", nullable = false)
    private String category;

    @Column(name = "", nullable = false)
    private int price;

    public Producto(){
    }

    public Producto(String productCode, String productName, Timestamp expirationDate, String category, int price){
    	this.productCode = productCode;
    	this.productName = productName;
    	this.expirationDate = expirationDate;
    	this.category = category;
    	this.price = price;
    }

    public Long getId(){
    	return this.id;
    }

    public String getProductCode(){
    	return this.productCode;
    }

    public void setProductCode(String productCode){
    	this.productCode = productCode;
    }

    public String getProductName(){
    	return this.productName;
    }

    public void getProductName(String productName){
    	this.productName = productName;
    }

    public Timestamp getExpirationDate(){
    	return this.expirationDate;
    }	

    public void setExpirationDate(Timestamp expirationDate){
    	this.expirationDate = expirationDate;
    }

    public String getCategory(){
    	return this.category;
    }

    public void setCategory(String category){
    	this.category = category;
    }

    public int getPrice(){
    	return this.price;
    }

    public void setPrice(int price){
    	this.price = price;
    }
}
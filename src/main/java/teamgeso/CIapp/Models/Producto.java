package teamgeso.CIapp.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(name="product_code", nullable = false)
    private String productCode;

    @Column(name="product_name", nullable = false)
    private String productName;

    @Column(name="expiration_date", nullable = false)
    private String expirationDate;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int price;

    public Producto(){
    }

    public Producto(String productCode, String productName, String expirationDate, String category, int price){
    	this.productCode = productCode;
    	this.productName = productName;
    	this.expirationDate = expirationDate;
    	this.category = category;
    	this.price = price;
    }

    public Integer getId(){
    	return this.id;
    }

    public void setId(Integer id){
        this.id = id;
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

    public String getExpirationDate(){
    	return this.expirationDate;
    }	

    public void setExpirationDate(String expirationDate){
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
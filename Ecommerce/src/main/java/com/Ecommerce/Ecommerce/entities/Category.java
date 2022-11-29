//package com.Ecommerce.Ecommerce.entities;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import java.util.List;
//
//@Getter
//@Setter
//
//@Entity
//public class Category {
//    @Id
//    int  id;
//    String category_name;
//    String description;
//
//    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
//    private List<Products> productsList;
//
//}

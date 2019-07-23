/*
 * package com.visa.training.web;
 * 
 * import java.util.HashMap; import java.util.List; import java.util.Map;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.visa.training.Domain.Product; import
 * com.visa.training.dal.ProductDAO; import
 * com.visa.training.service.ProductService; import
 * com.visa.training.service.ProductServiceIMPL;
 * 
 * @Controller public class ProductController {
 * 
 * ProductService service;
 * 
 * @Autowired public void setService(ProductService service) { this.service =
 * service; }
 * 
 * @RequestMapping(value="addProduct") public ModelAndView
 * addProduct(@RequestParam("name")String name, @RequestParam("price")float
 * price, @RequestParam("qoh")int qoh) { Product p = new Product(name, price,
 * qoh);
 * 
 * int id = service.addNewProduct(p); List<Product> productList =
 * service.findAll(); Map<String, Object>attributes = new HashMap<>();
 * attributes.put("productList", productList); return new
 * ModelAndView("productpage", attributes);
 * 
 * }
 * 
 * @RequestMapping(value="displayProduct") public ModelAndView displayProduct()
 * { List<Product> productList = service.findAll(); Map<String,
 * Object>attributes = new HashMap<>(); attributes.put("productList",
 * productList); return new ModelAndView("productpage", attributes);
 * 
 * }
 * 
 * @RequestMapping(value="removeProduct") public ModelAndView removeProduct(int
 * id) { service.deleteProduct(id); List<Product> productList =
 * service.findAll(); Map<String, Object>attributes = new HashMap<>();
 * attributes.put("productList", productList); return new
 * ModelAndView("productpage", attributes); } }
 */


package com.visa.training.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.visa.training.Domain.Product;
import com.visa.training.service.ProductService;

@Controller
public class ProductController {
    
    @Autowired
    ProductService service;
    
    @RequestMapping(value="/products",method=RequestMethod.GET)
    public String listProducts() {
        return "productslist";
    }
    
    @RequestMapping(value="/products",method=RequestMethod.POST)
    public String addProduct(@ModelAttribute("product")Product p) {
        //Product p = new Product(name, price, qoh);
        service.addNewProduct(p);
        
        return "productslist";
    }
    
    @RequestMapping("/removeProduct")
    public String removeProduct(@RequestParam("id")int id) {
        try {
            service.deleteProduct(id);
        }catch (IllegalArgumentException e) {
            return "removeFailed";
        }
        return "productslist";
    }
    
    @ModelAttribute("productList")
    public List<Product> getProductList(){
        return service.findAll();
    }

}
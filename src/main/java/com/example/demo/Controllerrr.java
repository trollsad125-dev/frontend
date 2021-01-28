package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nizis on 1/27/2021.
 */
@Controller
public class Controllerrr {
    @GetMapping("/")
    public String viewHome(){
        return "redirect:/trang-chu";
    }
    @GetMapping("/trang-chu")
    public String viewHOme2(){
        return "index";
    }
    @GetMapping("/about")
    public String viewAbout(){
        return "about";
    }
    @GetMapping("/blog")
    public String viewBlog(){
        return "blog";
    }
    @GetMapping("/blog-detail")
    public String viewBlogDetails(){
        return "blog-detail";
    }
    @GetMapping("/checkout")
    public String viewCheckout(){
        return "checkout";
    }
    @GetMapping("/product-details")
    public String viewProductDetail(){
        return "product-details";
    }
    @GetMapping("/product")
    public String viewProduct(){
        return "product";
    }
    @GetMapping("/cart")
    public String viewsCart(){
        return "cart";
    }
    @GetMapping("/contact")
    public String viewContact(){
        return "contact";
    }
}

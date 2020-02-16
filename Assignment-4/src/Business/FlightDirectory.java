/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AEDSpring2019
 */
public class FlightDirectory {
    
    private List<Flight> productList;// = new ArrayList<Product>();
    
    public FlightDirectory(){
        productList = new ArrayList<>();
    }

    public List<Flight> getProductList() {
        return productList;
    }

    public void setProductList(List<Flight> productList) {
        this.productList = productList;
    }
    
    
    
}

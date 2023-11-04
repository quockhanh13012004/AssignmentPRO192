
package data;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.*;
import java.lang.*;



public class BrandList extends ArrayList<Brand> {
private List<Brand> brandList;
    private String brandFile;
    private String carFile;

    public BrandList(String brandFile, String carFile) {
        brandList = new LinkedList<>();
        this.brandFile = brandFile;
        this.carFile = carFile;
        loadBrand();
        loadCar();
    }

    public boolean addBrand(String id, String name, String sound, double price) {
        if(getBrandById(id) != null) {
            return false;
        }
        brandList.add(new Brand(id, name, sound, price));
        return true;
    }
     public Brand getBrandById(String id) {
        for(Brand brand: brandList) {
            if(brand.getId().equalsIgnoreCase(id)) {
                return brand;
            }
        }
        return null;
    }
}

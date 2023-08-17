package main.checkingDuplicates;

import main.product.Product;

import java.util.List;

public class CheckingForDuplicateItems{

    public static void repeateCheck(List<Product> products, List<Integer> productsId, Product productItem) {
        if (!productsId.contains(productItem.getId())) {
            products.add(productItem);
            productsId.add(productItem.getId());
        } else {
            int indexOfRepeateProduct = productsId.indexOf(productItem.getId());
            products.get(indexOfRepeateProduct).setCount(productItem.getCount());
        }
    }
}

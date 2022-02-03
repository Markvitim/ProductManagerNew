package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] items = new Product[0];


    public void save(Product item) {
        Product[] tmp = new Product[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        items = tmp;
    }


    public Product[] findAll() {
        return items;
    }

    public void removeById(int idToRemove) {
        Product[] tmp = new Product[items.length - 1];
        int copyTo = 0;
        for (Product item : items) {
            if (item.getId() != idToRemove) {
                tmp[copyTo] = item;
                copyTo++;
            }
        }
        items = tmp;
    }

    public Product findById(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}

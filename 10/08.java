
//아래 코드를 조건에 맞게 구현하세요. 필요 시엔 코드를 수정해야 합니다.
import java.util.*;

abstract class Product {
    protected int price, productNumber;

    public Product(int price, int productNumber) {
        this.price = price;
        this.productNumber = productNumber;
    }

    public Product() {
        this(0, 0);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductNumber() {
        return this.productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public abstract void sort(Product[] products);
}

class Food extends Product {
    private int shelfLife;

    public Food(int price, int productNumber, int shelfLife) {
        super(price, productNumber);
        this.shelfLife = shelfLife;
    }

    public Food() {
        this(0, 0, 0);
    }

    public int getShelfLife() {
        return this.shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public void sort(Product[] products) {
        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return ((Food) a).shelfLife - ((Food) b).shelfLife;
            }
        });
    }
}

class Cloth extends Product {
    private char size;

    public Cloth(int price, int productNumber, char size) {
        super(price, productNumber);
        this.size = size;
    }

    public Cloth() {
        this(0, 0, 's');
    }

    public char getSize() {
        return this.size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public void sort(Product[] products) {
        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return ((Cloth) b).size - ((Cloth) a).size;
            }
        });
    }
}

// 아래 코드는 수정하지 마세요
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}
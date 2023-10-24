package oop1;

public class Main {
    public static void main(String[] args) {

        Pruduct product1=new Pruduct();
        product1.setName("Delonghi kahve makines");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Pruduct product2=new Pruduct();
        product2.setName("Smeg kahve makines");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Pruduct product3=new Pruduct();
        product3.setName("Kitchen aid kahve makines");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Pruduct[] products= {product1,product2,product3};
        System.out.println("<ul>");
        for(Pruduct product : products) {
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("052222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCampanyName("kodlama.io");
        corporateCustomer.setPhone("053333333");
        corporateCustomer.setTaxNumber("1234567890");
        corporateCustomer.setCustomerNumber("54321");
        //tümünü bir arada tutmak için
        Customer[]customers= {individualCustomer,corporateCustomer};

    }


}

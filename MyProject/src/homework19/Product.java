package homework19;

public class Product {

        private String name;
        private float quantity;
        private float price;
        public Product() {
        }

        public String getName() {
            return name;
        }

        public float getQuantity() {
            return quantity;
        }

        public float getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }

}

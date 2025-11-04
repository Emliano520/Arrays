public class Customer {   int id;
        String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Customer{id=" + id + ", name='" + name + "'}";
        }
    }



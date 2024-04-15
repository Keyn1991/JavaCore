package HomeWork1.Resolves.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Car
        Car car1 = new Car();
        car1.setModel("Toyota Camry");
        car1.setPower(200);
        car1.setVolumeEngine(2.5);
        car1.setTurbo(false);

        Car car2 = new Car();
        car2.setModel("Toyota Avensis");
        car2.setPower(150);
        car2.setVolumeEngine(1.8);
        car2.setTurbo(false);

        Car car3 = new Car();
        car3.setModel("Audi");
        car3.setPower(180);
        car3.setVolumeEngine(2.5);
        car3.setTurbo(true);

        Car car4 = new Car();
        car4.setModel("Mercedes-Benz");
        car4.setPower(280);
        car4.setVolumeEngine(3.5);
        car4.setTurbo(false);

        Car car5 = new Car();
        car5.setModel("BMW X6");
        car5.setPower(380);
        car5.setVolumeEngine(4.0);
        car5.setTurbo(true);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Car car : cars) {
            System.out.println(car);
        }

//        Book
        Book book1 = new Book();
        book1.setTitle("agagagagagags");
        book1.setPages(123);
        book1.setAuthors("John Doe");
        book1.setGenre("programing");

        Book book2 = new Book();
        book2.setTitle("agas");
        book2.setPages(123);
        book2.setAuthors("John Doe123");
        book2.setGenre("programing");


        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        for (Book book : books) {
            System.out.println(book);
        }

//        Dog
        Dog dog1 = new Dog();
        dog1.setName("Barbos");
        dog1.setAge(12);
        dog1.setPoroda("Pitt Bull");

        Dog dog2 = new Dog();
        dog2.setName("Barbos2");
        dog2.setAge(5);
        dog2.setPoroda("Pitt Bull2");

        Dog dog3 = new Dog();
        dog3.setName("Barbos3");
        dog3.setAge(7);
        dog3.setPoroda("Pitt Bull3");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

//        Post
        List<Post> posts = new ArrayList<>();
        for (int i = 1; i <= 1; i++) {
            Post post = new Post();
            post.setUserId(1);
            post.setId(i);
            post.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
            post.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
            posts.add(post);
        }
        for (Post post : posts) {
            System.out.println(post);

        }
//        Comments
        List<Comments> comments = new ArrayList<>();

        for (int i = 1; i <= 1; i++) {
            Comments comment = new Comments();
            comment.setUserId(1);
            comment.setId(i);
            comment.setName("id labore ex et quam laborum");
            comment.setEmail("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
            comment.setBody("laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
            comments.add(comment);
        }
        for (Comments comment : comments) {
            System.out.println(comment);
        }
    }
}

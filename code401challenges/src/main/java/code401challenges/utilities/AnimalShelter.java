//package code401challenges.utilities;
//
//import code401challenges.LinkededList.LinkedList;
//import code401challenges.stacksandqueues.Queue;
//
//public class AnimalShelter {
//    private LinkedList<Dog> dogQueue = new LinkedList<>();
//    private LinkedList<Cat> catQueue = new LinkedList<>();
//
//    public void enqueue(Dog d) {
//        this.dogQueue.addLast(d);
//    }
//
//    public void enqueue(Cat c) {
//        this.catQueue.addLast(c);
//    }
//
//    public <T> T dequeue(Class<T> type) {
//        if(type == Dog.class) {
//            return (T)this.dogQueue.removeFirst();
//        } else if (type.equals(Cat.class)) {
//            return (T)this.catQueue.removeFirst();
//        } else {
//            throw new IllegalArgumentException("Only Dogs or Cats please!");
//        }
//    }
//
//    public static void main(String[] args) {
//        AnimalShelter shelter = new AnimalShelter();
//        shelter.enqueue(new Dog("Rosie"));
//        shelter.enqueue(new Cat("Teddy"));
//        shelter.enqueue(new Cat("Jimbob"));
//        shelter.enqueue(new Dog("Ginger"));
//
//        System.out.println(shelter.dequeue(Dog.class));
//        System.out.println(shelter.dequeue(Dog.class));
//        System.out.println(shelter.dequeue(Cat.class));
//    }
//
//    class Dog {
//        private String name;
//
//        public Dog(String name) {
//            this.name = name;
//        }
//    }
//
//    class Cat {
//        private String name;
//
//        public Cat(String name){
//            this.name = name;
//        }
//    }
//
////    Queue<Dog> dog = new Queue<>();
////    Queue<Cat> cat = new Queue<>();
////
////    public void enqueue(Cat cat) {
////        cat.enqueue(cat);
////    }
////
////    public void enqueue(Dog dog) {
////        dog.enqueue(dog);
////    }
////
////    public Animal dequeue(String pref){
////        if (this.front == null) {
////            System.out.println("Null Head");
////        }
////        if (pref == null) {
////            System.out.println("No type");
////        }
////        Node<T> next_node = this.front;
////        this.front = this.front.next;
////        return next_node.value;
////        }
//
//
//}

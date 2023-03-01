public class Main {
    public static void main(String[] args){
        Person[] person = new Person[4];
        Book[] book = new Book[4];

        person[0] = new Person("Cleber", 22, "male");

        person[1] = new Person("Jose", 30, "male");

        person[2] = new Person("Clara", 20, "female");

        person[3] = new Person("Marcia", 32, "female");

        book[0] = new Book("The love hypothesis", "Ali Hazelwood", 336, "romance", person[1]);

        book[1] = new Book("Eight perfect hours", "Lia Louis", 304, "comedy", person[0]);

        book[2] = new Book("Night flight", "Antoine de Saint-Exupéry", 112, "action and adventure", person[2]);

        book[3] = new Book("IT", "Sthepen King", 1104, "horror", person[3]);


        book[1].openBook();
        book[1].turnPage(56);
        System.out.println(book[1].showDetailsBook());
        book[1].nextPage();
        System.out.println(book[1].showDetailsBook());
        book[1].returnPage();
        System.out.println(book[1].showDetailsBook());
    }

}
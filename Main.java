public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //Přidání prvků
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);

        //Výpis seznamu
        System.out.println("Seznam:");
        list.printList();

        //Obsahuje
        System.out.println("Obsahuje 20? " + list.contains(20));
        System.out.println("Obsahuje 99? " + list.contains(99));

        //odstranit
        System.out.println("Odstraňuji 20: " + list.remove(20));
        list.printList();

        //velikost
        System.out.println("Velikost seznamu: " + list.size());

        //vymazání
        list.clear();
        System.out.println("Po vymazání:");
        list.printList();
    }
}

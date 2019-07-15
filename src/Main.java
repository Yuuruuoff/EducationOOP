public class Main {

    /*
    TODO ссылочные = ссылка на ячейку в памяти
    TODO примитивы - непосредственно значение

    TODO при при присвоении одной ссылочной переменной ссылки на другую и изменении этой переменной изменится и предыдущая переменная
        Integer int1 = 12;
        Integer int2 = int1;
        int2 = int2 - 1;

    TODO CTRL + ALT + L
        soup to system.out.println

    TODO 3 кита ООП !!!

    TODO все ссылочные переменные реализуют Object

    TODO высходящее преобразование
    TODO Ctrl + /

     */

    //TODO всё, что задаётся, выполняется в конструкторе происходит во время создания экземпляра класса
    /*
    TODO кальлятор
    каждая операция - отдельный класс
    все операции наследуются от одного класса - операция и так же от одного интерфеса
    в parent классе должен быть один или несколько универсальных методов для всех операций (toString из Object точно должен быть переписан)
    использовать высходящее преобразование
    В итоге, все экземпляры класса создаются из main()
     Полновину классов свести до Object
     */
    public static void main(String[] args) {

//        Animal klop = new Animal();
//        System.out.println(klop.getVoice());



//        klop.setVoice("My voice");
//
//        System.out.println(klop.getVoice());
//
//        Cat cat = new Cat();
//        cat.voice();
//
//        Dog dog = new Dog();
//        dog.voice();
        Animal cat1 = new Cat("New voice");
        System.out.println(cat1);
        //явное приведение типов
//        ((Cat) cat1).voice();
//
//        AnimalInterface cat2 = new Cat();
//
//        Object myObj = new Cat();
//        ((Cat) myObj).voice();

    }
}
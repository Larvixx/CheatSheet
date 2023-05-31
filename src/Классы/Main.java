//package Классы;
//
//public class Main {
//    public static void main(String[] args) {
//        Cats catBarsik = new Cats("Барсик", 5);
//        System.out.println("У нас появился новый кот " + catBarsik.getName());// catBarsik принадлежит классу Cats,
//         получаем данные из геттера этого класса
//        System.out.println("Возраст кота " + catBarsik.getName() + " " + catBarsik.getAge());
//        catBarsik.sayMeow(); // Вызвали метод помяукать(он один для всех котов в Cats)
//        catBarsik.setName("  "); // Пытаемся поменять имя на пустое (получаем ошибку)
//        catBarsik.setAge(-25); // Пытаемся задать отрицательный  возраст (получаем ошибку)
//        Cats catMurka = new Cats(" ",-5); // пытаемся создать неправильного кота  (получаем ошибку)
//                                    обьект все равно будет создан и данные можно сменить позже
//        Cats dvorovoi = new Cats();// Здесь создали дворового кота без имени и возраста
//                                    сработал конструктор по умолчанию
//                                     в последствии их можно присвоить через сеттер
//        dvorovoi.setName("Кузя"); // Придумали имя коту
//        dvorovoi.setAge(10);// Потом выяснили возраст
//        System.out.println("У нас появился новый кот " + dvorovoi.getName());
//        System.out.println("Возраст кота " + dvorovoi.getName() + " " + dvorovoi.getAge());
//        dvorovoi.sayMeow();
//        catMurka.sayMeow();// Мурка тоже мяукает
//        System.out.println(catMurka.getName());// хотя не имеет имени
//        System.out.println(catMurka.getAge());// и возраста

//    }
//}

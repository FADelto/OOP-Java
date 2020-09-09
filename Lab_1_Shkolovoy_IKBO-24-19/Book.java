public class Book {
     //Переменные
     public String Book1;
     public String Book2;
     public String Book3;
 
     //Конструкторы
     public Book(){
         Book1 = "Brave New World";
         Book2 = "One Hundred Years Of Solitude";
         Book3 = "A Farewell To Arms";
     }
 
     public Book(String B1, String B2, String B3) {
         Book1 = B1;
         Book2 = B2;
         Book3 = B3;
     }
     //Методы
     public String getBook1(){
         return Book1;
     }
 
     public String getBook2(){
         return Book2;
     }
 
     public String getBook3(){
         return Book3;
     }
}

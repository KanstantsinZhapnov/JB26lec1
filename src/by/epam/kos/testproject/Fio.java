package by.epam.kos.testproject;

public class Fio {
    public static void main(String[] args){
        String newLine = System.getProperty("line.separator");
        String SecondName = "Жапнов ";
        String Firstname = "Константин";
        String Address = "Шугаева, 11";
        String MobileNumber = "+375292222222";

        System.out.println("ФИО: " + SecondName + Firstname + newLine + "Адрес: " + Address + newLine + "Телефон: " + MobileNumber);
    }
}

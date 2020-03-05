package part1.homework1;


public class mainClass {
/***
 * Задание 1
 * @author Ilnaz Sharafiev
 */
    public static void main(String[] args) {
        try{
            TestNullError();
            TestArrayError();
            testMyError();
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    /**
     * Исключение NullPointerException
     */
    static void TestNullError(){
        Integer number = null;
        if (number == 123) {
            System.out.println(number.toString());
        }
    }

    /**
     * Исключение ArrayIndexOutOfBoundsException
     */
    static void TestArrayError(){
        String arrayList[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        arrayList[12] = "Ten";
    }

    /**
     * Моя Ошибка
     */
    static void testMyError() throws MyException{
        throw new MyException();
    }
}
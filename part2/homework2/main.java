package part2.homework2;

public class main {
    public static void main(String[] args) {
        Object [] num = new Object[3];
        num[0] = 1;
        Integer value = new Integer(2);
        num[1] = value;
        num[2] = new Double(4.5);

        ObjectBox objBox = new ObjectBox();

        for(int i=0;i<num.length;i++){
            objBox.addObject(num[i]);
        }
        objBox.dump();
        objBox.deleteObject(num[2]);
        objBox.dump();
    }
}

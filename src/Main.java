
public class Main {
    

    public static void main(String[] args) {
        try {
            throw new MyException("Ойой");
        } catch(MyException e) {
            System.out.print(e.getMessage());
        }

    }


}

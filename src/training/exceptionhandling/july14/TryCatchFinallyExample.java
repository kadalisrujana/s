package training.exceptionhandling.july14;

public class TryCatchFinallyExample {

    public void test(){
        System.out.println("Step1");
        String s = null;
        try{
            System.out.println("Step2");
            s.toString();// throws nullpointer exception
            System.out.println("Step3");
        }catch(NullPointerException e){
            System.out.println("Step6");
        }
        catch(Exception e){
            System.out.println("Step4");
        }finally {
            System.out.println("Step5");
        }
    }

    public static void main(String[] args) {
        TryCatchFinallyExample example = new TryCatchFinallyExample();
        example.test();
    }
}

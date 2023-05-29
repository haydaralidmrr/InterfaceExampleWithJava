public class InterfaceExample {
    public static void main(String[] args) {
        ArabeskSarkiciOzellikleri azer=new AzerBulbul();
        azer.sahnedeEfkarlandir();
        ArabeskSarkiciOzellikleri muslum=new MuslumBaba();
        muslum.sahnedeEfkarlandir();
        muslum.defaultMethot();
        boolean a=ArabeskSarkiciOzellikleri.emailControl("demir17@gmail.com");
        System.out.println(a);



    }
}
interface Kisi{
    void yemekYe();
    void sporYap();
}
abstract class Sarkici implements Kisi{
    abstract void sarkiSoyle();
}
interface ArabeskSarkiciOzellikleri{
    void sahnedeEfkarlandir();
    static final int yas=45;
    default void defaultMethot() {
        System.out.println("Ben default methodum interfacelerin artik icerigi var java8 le beraber");
    }
    static boolean emailControl(String mail) {//java 8den sonra gelen ozellik
        if (mail.contains("@")){
            return true;
        }else return false;


    }
}
interface PopSarkiciOzellikleri{
    void sahnedeDansEt();
}
class AzerBulbul implements ArabeskSarkiciOzellikleri{

    @Override
    public void sahnedeEfkarlandir() {
        System.out.println("Insanlari duygulandiriyor");
    }

    public void yas() {
        System.out.println("Yasi= " +yas);
    }
}
class MuslumBaba implements ArabeskSarkiciOzellikleri{
    @Override
    public void sahnedeEfkarlandir() {
        System.out.println("Insanlara kendilerini kaybettiriyor");
    }
}

class ArabeskSarkici extends Sarkici{
    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }

    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk sarkicisi sarki soyluyor");

    }
}
class PopSarkici extends Sarkici{
    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }

    @Override
    void sarkiSoyle() {
        System.out.println("Pop sarkicisi sarki soyluyor");

    }
}

package praktikum4;
public class DetectorTemp {
    private double suhu;

    public double getSuhu(){
        return this.suhu;
    }

    public void setSuhu(double suhu){
        if (suhu >= 35 && suhu <= 42){
            this.suhu = suhu;
            System.out.println("suhu normal");
        }else{
            this.suhu = suhu;
            System.out.println("suhu tidak normal");
        }
    }
}

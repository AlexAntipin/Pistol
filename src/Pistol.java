public class Pistol {
    private Integer count_patron;
    private Integer max_count_patron;

    public Pistol(){
        this.count_patron = 5;
    }

    public Pistol(Integer count_patron){
        this.max_
        this.count_patron = count_patron;
    }

    public void Shoot(){
        if (this.count_patron > 0){
            this.count_patron --;
            System.out.println("Бах!");
        }
        else {
            System.out.println("Клац!");
        }
    }


    public void Checkpatron(){
        System.out.println(this.count_patron);
    }





    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
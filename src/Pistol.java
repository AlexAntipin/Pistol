public class Pistol {
    private Integer count_patron;
    final Integer max_count_patron;

    public Pistol(Integer max_count_patron){
        this.count_patron = 5;
        this.max_count_patron = max_count_patron;
    }

    public Pistol(Integer count_patron, Integer max_count_patron){
        this.max_count_patron = max_count_patron;
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

    public Integer Unload(){
        Integer help = count_patron;
        this.count_patron = 0;
        return help;
    }

    public Integer Reload(Integer count_patron_reload){
        if (count_patron_reload < 0) {
            System.out.println("Введено неправильное количество патронов");
            return null;
        }
        else if (this.count_patron + count_patron_reload > this.max_count_patron){
            Integer return_patron = (this.count_patron + count_patron_reload) - this.max_count_patron;
            this.count_patron = this.max_count_patron;
            return return_patron;
        }
        else{
            this.count_patron += count_patron_reload;
            return 0;
        }

    }

    public boolean isLoaded(){
        if (this.count_patron > 0){
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {
        Pistol test = new Pistol(3,7);
        for (int i = 0; i < 5; i++){
            test.Shoot();
        }
        test.Reload(8);
        test.Shoot();
        test.Shoot();

        test.Unload();
        test.Shoot();

    }
}
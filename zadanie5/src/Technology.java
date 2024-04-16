public class Technology {
    public String nameOfTechnology;
    public int bonusMoney;
    public Technology(String nameOfTechnology,int bonusMoney){
        this.nameOfTechnology = nameOfTechnology;
        this.bonusMoney = bonusMoney;
    }
    public int zwrocBonus(){
        return bonusMoney;
    }
}

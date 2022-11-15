public class Hero {

    private int healts;
    private int damage;



   public int  getDamage() {
       return damage;

     }
     public int getHealts(){
       return  healts;
}
   public String getSuperpower(){
       return  superpower;
   }



  private   String superpower;


  private   Hero(String superpower,int healts,int damage){
    this.superpower = superpower;
    this.damage = damage;
    this.healts = healts;

  }

  public Hero(int damage, int healts,String superpower) {
      this.damage = damage;
      this.healts = healts;

  }
}//Создать класс героя(Hero) c приватными полями здоровье,урон и суперспособность.
//Написать 2 разных конструктора ждя создание объекта.health.damage/superpower
//В одном конструкторе задаются все поля,вдругом только здоровья и урон
//добавить в класс Hero гетерры для всех полей
//создать класс босса (Boss) с приватными полями здоровье,урон и тип защиты
//добавить в класс геттеры и сетеры для всех полей
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значение полями)
//затем распечатать всю информацию о боссе



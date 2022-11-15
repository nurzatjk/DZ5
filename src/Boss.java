import javax.management.BadStringOperationException;

public class Boss {
    private int health;
    private int damage;
    private String protectionTupe;

    public int getHealth(){
        return  health;


    }public void setHealth(int health){
        this.health = health;

    }public  int getDamage(){
    return  damage;

}public  void  setDamage(int damage ){
    this.damage = damage;



}public String getProtectionTupe(){
    return protectionTupe;

}public   void setProtectionTupe(String protectionTupe){
        this.protectionTupe = protectionTupe;
    }



}








////Создать класс героя(Hero) c приватными полями здоровье,урон и суперспособность.
//Написать 2 разных конструктора ждя создание объекта.health.damage/superpower
//В одном конструкторе задаются все поля,вдругом только здоровья и урон
//добавить в класс Hero гетерры для всех полей
//создать класс босса (Boss) с приватными полями здоровье,урон и тип защиты
//добавить в класс геттеры и сетеры для всех полей
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значение полями)
//затем распечатать всю информацию о боссе



public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(100);
        boss.setProtectionTupe("magic");


        System.out.println("     BOSS     ");
        System.out.println("Health :" + " "+ boss.getHealth());
        System.out.println("Damage : " + " " + boss.getDamage());
        System.out.println("ProtectionTupe:" +" " + boss.getProtectionTupe());


    }
}






//Создать класс героя(Hero) c приватными полями здоровье,урон и суперспособность.
//Написать 2 разных конструктора ждя создание объекта.health.damage/superpower
//В одном конструкторе задаются все поля,вдругом только здоровья и урон
//добавить в класс Hero гетерры для всех полей
//создать класс босса (Boss) с приватными полями здоровье,урон и тип защиты
//добавить в класс геттеры и сетеры для всех полей
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значение полями)
//затем распечатать всю информацию о боссе
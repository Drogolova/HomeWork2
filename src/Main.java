public class Main {
    public static void main(String[] args) {
        var Boxer1Weight = 78.2;
        var Boxer2Weight = 82.7;
        var TotalWeight = Boxer1Weight + Boxer2Weight;
        System.out.println("Общий вес бойцов " + TotalWeight + " кг");
        var DifferenceWay1 = Boxer2Weight - Boxer1Weight;
        System.out.println("Разница между весами бойцов " + DifferenceWay1 + " кг");
        var DifferenceWay2 = TotalWeight % Boxer1Weight;
        System.out.println("Разница между весами бойцов " + DifferenceWay2 + " кг");

        var TotalHours = 640;
        var EmploeeHours = 8;
        var AllEmploees = TotalHours / EmploeeHours;
        System.out.println("Всего работников в компании - " + AllEmploees + " человек");
        var NewAllEmploees = AllEmploees + 94;
        var NewTotalHours  = NewAllEmploees * 8;
        System.out.println("Если в компании работает " + NewAllEmploees + " человек, то всего " + NewTotalHours +
                " часов работы может быть поделено между сотрудниками");




    }

}
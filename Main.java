package ua.lviv.iot.java.lab1;

public class Main {

    public static void main(String[] args) {
        ITCluster firstITCluster= new ITCluster();
        ITCluster secondITCluster = new ITCluster("Kyiv",99_000,"Igor Arkhypenko");
        ITCluster thirdITCluster = new ITCluster("Lviv","Stepan Veselovskyi",
                "To see Lviv becoming the center of world-class cutting-edge technology",180 ,
                26_000);

        System.out.println(firstITCluster);
        System.out.println(secondITCluster);
        System.out.println(thirdITCluster);

        System.out.println();
        System.out.println(ITCluster.getStaticField());

    }
}

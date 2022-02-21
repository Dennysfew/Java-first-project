package ua.lviv.iot.java.lab1;

public record ITCluster(String nameOfTheCity,String nameOfHead,String mainMission,Integer numOfCompanies,
                        Integer numberOfParticipants) {

    private static String nameOfCountry = "Ukraine";

    ITCluster() {
        this("Kharkiv", null, null, null, null);
    }
    ITCluster(String nameOfTheCity, int numberOfParticipants, String nameOfHead) {
        this(nameOfTheCity,nameOfHead,null,null, numberOfParticipants );
    }


    @Override
    public String toString() {
        return "ITCluster{"
                + "city = " + this.nameOfTheCity + ", "
                + "participans = " + this.numberOfParticipants + ", "
                + "Head = " + this.nameOfHead + ", "
                + "Country = " + nameOfCountry + ", "
                + "NumOfCompanies = " + this.numOfCompanies + ", "
                + "Main mission = " + this.mainMission + " "
                + '}';
    }


    public static String getStaticField(){
        return nameOfCountry;
    }
}

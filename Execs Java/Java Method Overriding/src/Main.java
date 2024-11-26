public class Main {
    public static void main(String[] args) {
        Sports sport = new Sports();
        System.out.println(sport.getName());
        sport.getNumberOfTeamMembers();

        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
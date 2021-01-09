package practice;

public class Main {
    public static void main(String [] args){
        ProUnfinishedMan p = new ProUnfinishedMan();
        String [] participant = {"mislav","mislav","stanko", "ana"};
        String [] completion = {"mislav","stanko", "ana"};
        p.solution(participant,completion);
    }
}

import java.util.Scanner;

public class Ring {
    Scanner scanner = new Scanner(System.in);
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (isCheck()) {
            System.out.print(f1.name + ": " +
                    "\n1)Should start first?" +
                    "\n2)boost damage by 10%: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                this.f2.damage += (this.f2.damage * 10 / 100);

                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("====New Round====");

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin(this.f1, this.f2)){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin(this.f2, this.f1)){
                        break;
                    }
                    System.out.println(this.f1.name + " Health: " + this.f1.health + "\n"
                                                  + this.f2.name + " Health: " + this.f2.health);
                }
            }
            if (choice == 2) {
                this.f1.damage += (this.f1.damage * 10 / 100);

                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("====New Round====");

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin(this.f2, this.f1)){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin(this.f1, this.f2)){
                        break;
                    }
                    System.out.println("Health: " + this.f1.name + " " + this.f1.health + " // "
                                                  + this.f2.name + " " + this.f2.health);
                }
            }

        } else {
            System.out.println("Welterweights are mismatched");
        }
    }

    private boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    private boolean isWin(Fighter winner, Fighter loser){
        if(loser.health == 0){
            System.out.println(winner.name + " is win!!");
            return true;
        }
        return false;
    }

}

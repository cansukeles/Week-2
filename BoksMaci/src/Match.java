public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    public void start() {
        if(isCheck()) {
            System.out.println(this.f1.name + " Fighter " + " \nDamage: " + this.f1.damage + " \nHealth: " + this.f1.health  + " \nweight: " + this.f1.weight + " \nDodge: " + this.f1. dodge + " \nVS \nFighter: " + this.f2.name + " \nDamage: " + this.f2.damage + " \nHealth: " + this.f2.health + " \nweight: " + this.f2.weight + " \nDodge: " + this.f2.dodge);
        if(coinFlip()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                this.f2.health = this.f1.hit(this.f2); // f1 -- f2'ye vuruyor.
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    this.f1.health = this.f2.hit(this.f1); //f2---f1
                    if(isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor!");
        }
        }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

    public boolean coinFlip() {
        double randomValue = Math.random() * 100;
        if (randomValue > 50) {
            return true;
        }
        return false;
    }
}



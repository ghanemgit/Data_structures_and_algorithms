package CodeChallenges.Challenge12;

public class Animals {

    Animals dog;
    Animals cat;

    public Animals() {
    }

    public Animals(Animals dog) {
        this.dog = dog;
    }


    public Animals getDog() {
        return dog;
    }

    public void setDog(Animals dog) {
        this.dog = dog;
    }

    public Animals getCat() {
        return cat;
    }

    public void setCat(Animals cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "dogs=" + dog +
                ", cats=" + cat +
                '}';
    }
}

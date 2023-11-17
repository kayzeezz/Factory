package factory;

public class Tiger implements  Animals{
    private Integer noOfLives;

    public Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }
    @Override
    public String makeSound() {
        return "Rowr, rowr, rowr!";
    }

    @Override
    public String play() {
        return "attack moving objects!";
    }
}

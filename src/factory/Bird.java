package factory;

public class Bird implements  Animal{
    private Integer Type;

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }
    @Override
    public String makeSound() {
        return "Tweet, tweet, tweet!";
    }

    @Override
    public String play() {
        return "attack moving objects!";
    }
}

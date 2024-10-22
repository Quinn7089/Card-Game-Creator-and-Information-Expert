public class Player {

    private String name;
    private Playerhand playerhand;

    public Player(String name, Playerhand playerhand) {
        this.name = name;
        this.playerhand = playerhand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Playerhand getPlayerhand() {
        return playerhand;
    }

    public void setPlayerhand(Playerhand playerhand) {
        this.playerhand = playerhand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerhand=" + playerhand +
                '}';
    }
}

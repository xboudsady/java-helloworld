import java.util.Random;

public class Coin {

  public final static int HEADS = 0;
  public final static int TAILS = 1;

  private int faceUp;       // Keeps track on what face the coin is on.

  public Coin() {  // Initial constructor to allow us to start on heads or tails.
    flip();
  }

  public void flip() {              // Flips our coin, either 0 or 1
    Random rand = new Random();
    faceUp = rand.nextInt(2);
  }

  public String getFaceUp() {
    if (faceUp == HEADS) {
      return "HEADS";
    } else if (faceUp == TAILS) {
      return "TAILS";
    } else {
      return "INVALID";
    }
  }

}
public class change {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    int[] basicCoins = {25, 10, 5, 1};
    System.out.println(NumberOfWaysToMakeChange(25, 4, basicCoins));

  }


  public static int NumberOfWaysToMakeChange(int cents, int coins, int coinSet[]) {
    if (cents == 0) {
      return 1;
    }
    if (cents < 0) {
      return 0;
    }
    if (cents >= 1 && coins <= 0) {
      return 0;
    }
    return NumberOfWaysToMakeChange(cents, coins-1, coinSet) +
    NumberOfWaysToMakeChange(cents-coinSet[coins-1], coins, coinSet);
  }
}
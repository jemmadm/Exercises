//package exercise32;
//
//import org.junit.Test;
//
//
//import static org.assertj.core.api.Assertions.*;
//
//public class GuessTheNumberTest {
//
//
//@Test
//    public void doesEasyGameWork(){
//
//    GuessTheNumber guessTheNumber = new GuessTheNumber();
//
//    assertThat(guessTheNumber.easyGame()).isBetween(1,10);
//
//    }
//
//    @Test
//    public void doesNormalGameWork(){
//
//        GuessTheNumber guessTheNumber = new GuessTheNumber();
//
//        assertThat(guessTheNumber.normalGame()).isBetween(1,100);
//
//    }
//
//    @Test
//    public void doesHardGameWork(){
//
//        GuessTheNumber guessTheNumber = new GuessTheNumber();
//
//        assertThat(guessTheNumber.hardGame()).isBetween(1,1000);
//
//    }
//
//    @Test
//    public void chooseEasyDifficulty(){
//    GuessTheNumber guessTheNumber = new GuessTheNumber();
//
//    assertThat(guessTheNumber.difficultySelector(1)).isEqualTo(guessTheNumber.easyGame());
//    }
//
//    @Test
//    public void chooseNormalDifficulty(){
//        GuessTheNumber guessTheNumber = new GuessTheNumber();
//
//        assertThat(guessTheNumber.difficultySelector(2)).isBetween(1,100);
//    }
//
//
//}
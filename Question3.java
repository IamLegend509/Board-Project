public class Question3

{ int nextInt;
 public static void main(String[] args)
 {
  Question3 randomNumGenerator = new Question3();
 
           for (int idx = 1; idx <= 10; ++idx){
              int randomInt = randomNumGenerator.nextInt(100);
              System.out.println("Random Number= "+randomInt);
            }
        }
    }
    
class Main {
  public static void main(String[] args) {

    int i;

   for (i = 0; i <= 5; i++){
     int numero = i;
    switch(numero){
      case 1:
      System.out.println("Primeira condi��o!");
      break;
      case 4:
      System.out.println("Segunda condi��o!");
      break;
      default:
      System.out.println("N�o foi encontrada nenhuma condi��o"); 
    }
   }

  }
}
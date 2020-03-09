class Main {
  public static void main(String[] args) {

    int i;

   for (i = 0; i <= 5; i++){
     int numero = i;
    switch(numero){
      case 1:
      System.out.println("Primeira condição!");
      break;
      case 4:
      System.out.println("Segunda condição!");
      break;
      default:
      System.out.println("Não foi encontrada nenhuma condição"); 
    }
   }

  }
}
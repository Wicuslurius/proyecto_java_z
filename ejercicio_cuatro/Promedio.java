public class Promedio{
  public static void main(String args[]){
    int matematicas = 5;
    int biologia = 3;
    int quimica = 3;
    int promedio = 0;

    promedio = (matematicas + biologia + quimica)/3;

    if(promedio >= 6){
      System.out.println("El alumno aprobo " + promedio);
    }else{
      System.out.println("El alumno reprobo " + promedio);
    }
  }
}
